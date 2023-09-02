package GradeBasic;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private List<Studendt> studendts;
    private GradeController gradeController; // 성적 기록을 관리하는 컨트롤러

    public StudentController(GradeController gradeController) {
        this.studendts =  new ArrayList<>();
        this.gradeController = gradeController;
    }

    //학생 정보를 등록하는 메서드

    public  void addStudent(Studendt studendt){
        studendts.add(studendt);
    }

    //학생 정보를 삭제하는 메서드 (성적도 함께 삭제)

    public  void removeStudent(String studentPhone){
        for(int i=0; i<studendts.size(); i++) {
            studendts.remove(i);
            gradeController.removeGradeRecord(studentPhone); // 해당 학생의 성적 기록을 삭제
            break;
        }
    }

    //학생 등록 여부를 확인하는 메서드

    public Studendt findStudent(String studentPhone){
        for(Studendt studendt : studendts){
            if(studendt.getStudentPhone().equals(studentPhone)){
                return studendt;
            }
        }
        return null;
    }

    //기존의 전화번호로 등록된 고객이 있는지를 확인하는 메서드
    public boolean isPhoneExist(String studentPhone){
        for (Studendt studendt : studendts){
            if(studendt.getStudentPhone().equals(studentPhone)){
                return true;
            }
        }
        return false;
    }

}
