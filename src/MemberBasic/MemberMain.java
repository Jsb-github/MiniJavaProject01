package MemberBasic;

import java.util.List;
import java.util.Scanner;

public class MemberMain {

    public static void main(String[] args) {
        //회원 컨트롤러 콘솔 객체 생성
        MemberController memberController = new MemberController();
        ConsoleView view = new ConsoleView();

        while (true){
            System.out.println("=====회원 정보 관리 시스템=========");
            System.out.println("1. 신규 회원 정보 입력 : ");
            System.out.println("2. 회원 정보 조회 : ");
            System.out.println("3. 회원 정보 삭제 : ");
            System.out.println("4. 종료 ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    Members newMember = view.getMemberInfo();
                    String phoneNumber = newMember.getPhoneNumber();

                    if(memberController.isPhoneNumberExist(phoneNumber)){
                        view.printMessage("이미 등록된 전화번호 입니다.");
                        continue;
                    }
                    memberController.addMember(newMember);
                    view.printMessage("고객 정보가 추가 되었습니다.");
                    break;
                case 2 :
                    phoneNumber = view.getPhoneNumber();
                    if(memberController.findMember(phoneNumber)==null){
                        view.printMessage("해당 전화번호를 가진 고객 정보가 없습니다.");
                        break;
                    }
                    Members member = memberController.findMember(phoneNumber);
                    view.printMemberRecordInfo(member);
                    System.out.println("회원 정보가 출력 됩니다.");
                    break;
                case 3 :
                    phoneNumber = view.getPhoneNumber();

                    if(memberController.findMember(phoneNumber)==null){
                        view.printMessage("해당 전화번호를 가진 회원 정보가 없습니다.");
                        break;
                    }
                    memberController.removeMember(phoneNumber);
                    view.printMessage("회원 정보가 삭제되었습니다.");
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
                    break;
            }

        }
    }
}
