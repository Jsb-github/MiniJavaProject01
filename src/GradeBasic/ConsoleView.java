package GradeBasic;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner = new Scanner(System.in);

    //학생 전화번호를 입력받는 화면

    public  String getStudentPhone(){
        System.out.println("전화번호를 입력하세요 : ");
        return  scanner.nextLine();
    }

    //신규 학생 정보 입력 화면
    public Studendt getStudentInfo(){
        System.out.println("신규 학생 정보를 입력하세요.");
        System.out.println("전화 번호 : ");
        String studentPhone = scanner.nextLine();

        System.out.println("학생 이름 : ");
        String sudentName = scanner.nextLine();

        System.out.println("이메일 : ");
        String email = scanner.nextLine();

        System.out.println("주소 : ");
        String address = scanner.nextLine();

        System.out.println("출생년도 : ");
        int birthYear = scanner.nextInt();
        scanner.nextLine();
        return new Studendt(studentPhone,sudentName,email,address,birthYear);

    }

    //학생 성적을 입력 받는 화면
    public  GradeRecord getGradeRecordInfo(){
        System.out.println("국어 성적을 입력하세요 : ");
        int kor = scanner.nextInt();
        scanner.nextLine();

        System.out.println("영어 성적을 입력하세요 : ");
        int eng = scanner.nextInt();
        scanner.nextLine();

        System.out.println("수학 성적을 입력하세요 : ");
        int math = scanner.nextInt();
        scanner.nextLine();

        return new GradeRecord(null,kor,eng,math);

    }



    //학생 기록 조회하여 출력
    public void printGradeRecordInfo(Studendt studendt){
        List<GradeRecord> records = studendt.getGradeRecords();
        System.out.println("["+studendt.getStudentName()+"]님의 성적");
        for(GradeRecord record1 : records){

            System.out.println("국어 성적 : "+record1.getKor());
            System.out.println("영어 성적 : "+record1.getEng());
            System.out.println("수학 성적 : "+record1.getMath());
        }
    }

    //
    public void printMessage(String message){
        System.out.println(message);
    }


}
