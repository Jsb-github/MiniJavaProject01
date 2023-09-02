package GradeBasic;

import java.util.List;
import java.util.Scanner;

public class GradeMain {
    public static void main(String[] args) {
        GradeController gradeController = new GradeController();
        StudentController studentController = new StudentController(gradeController);
        ConsoleView view = new ConsoleView();

        while (true){
            System.out.println("=======학생 성적 관리 시스템=========");
            System.out.println("1. 학생 정보 입력 : ");
            System.out.println("2. 학생 성적 입력 : ");
            System.out.println("3. 학생 성적 조회 : ");
            System.out.println("4. 학생 정보 삭제 : ");
            System.out.println("5. 종료 ");
            System.out.println("원하는 기능을 선택하세요.");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice){
                case 1 : // 학생 등록
                    Studendt newStudent = view.getStudentInfo();
                    String studentPhone = newStudent.getStudentPhone();
                    if(studentController.isPhoneExist(studentPhone)){
                        view.printMessage("이미 등록된 학생입니다.");
                        continue;
                    }
                    studentController.addStudent(newStudent);
                    view.printMessage("학생정보가 추가 되었습니다.");
                    break;
                case  2 : // 성적 등록
                    studentPhone =view.getStudentPhone();
                    if(studentController.findStudent(studentPhone)==null){
                        view.printMessage("해당 전화번호를 가진 학생은 없습니다.");
                        break;
                    }

                    Studendt studendt1 = studentController.findStudent(studentPhone);
                    GradeRecord newRecord = view.getGradeRecordInfo();
                    newRecord.setStudentPhone(studentPhone);
                    gradeController.addGradeRecord(newRecord);
                    studendt1.addGradeRecords(newRecord);
                    view.printMessage("학생기록이 저장되었습니다.");
                    break;

                case  3 : //성적 조회
                    studentPhone = view.getStudentPhone();
                    List<GradeRecord> records = gradeController.findGradeRecords(studentPhone);
                    if(records.isEmpty()){
                        view.printMessage("해당 전화번호로가진 학생성적은 없습니다.");
                        break;
                    }
                    studendt1 = studentController.findStudent(studentPhone);
                    view.printGradeRecordInfo(studendt1);
                    view.printMessage("학생성적을 출력합니다.");
                    break;
                case  4 :  //학생정보 삭제
                    studentPhone = view.getStudentPhone();

                    if(studentController.findStudent(studentPhone)==null){
                        view.printMessage("해당 전화번호를 가진 회원 정보가 없습니다.");
                        break;
                    }
                    studentController.removeStudent(studentPhone);
                    view.printMessage("회원 정보가 삭제되었습니다.");
                    break;
                case  5 : //종료
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default: //
                    System.out.println("잘못된 선택입니다.");
                    break;
            }
        }
    }


}
