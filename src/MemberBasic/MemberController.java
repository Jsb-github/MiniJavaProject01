package MemberBasic;

import java.util.ArrayList;
import java.util.List;

public class MemberController {
    //회원 정보를 담을 리스트 생성
    private List<Members> members;


    public MemberController(){
        this.members = new ArrayList<>();
    }

    //회원 정보를 등록하는 메서드
    public void addMember(Members member){
        members.add(member);
    }

    //회원 정보를 삭제하는 메서드
    public void removeMember(String phoneNumber){
        for(int i=0; i<members.size(); i++){
            members.remove(i);
            break;
        }
    }
    //고객등록 여부를 확인하는 메서드
    public Members findMember(String phoneNumber){
        for(Members member1 : members){
            if(member1.getPhoneNumber().equals(phoneNumber)){
                return member1;
            }
        }
        return null;
    }


    //기존의 전화번호로 등록 고객이 있는지를 확인하는 메서드
    public  boolean isPhoneNumberExist(String phoneNumber){
        for (Members member1 : members){
            if(member1.getPhoneNumber().equals(phoneNumber)){
                return true;
            }
        }
        return false;
    }

}
