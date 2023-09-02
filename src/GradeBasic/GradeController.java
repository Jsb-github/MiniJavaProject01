package GradeBasic;

import java.util.ArrayList;
import java.util.List;

public class GradeController {
    private List<GradeRecord> records = new ArrayList<>();

    //성적 기록을 등록한는 메서드

    public void addGradeRecord(GradeRecord record){

        records.add(record);
    }

    //성적 기록을 삭제하는 메서드

    public  void removeGradeRecord(String studentPhone){
        for(int i=0; i<records.size(); i++){
            if(records.get(i).getStudentPhone().equals(studentPhone)){
                records.remove(i);
                break;
            }
        }
    }

    //전화 번호에 해당하는 모든 학생기록을 검색하여 새로운 List<GradeRacord>를 만들는 메소드

    public  List<GradeRecord> findGradeRecords(String studentPhone){
        List<GradeRecord> result = new ArrayList<>();
        for (GradeRecord record : records){
            if(record.getStudentPhone().equals(studentPhone)){
                result.add(record);
            }
        }
        return result;
    }

}
