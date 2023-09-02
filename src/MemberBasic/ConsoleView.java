package MemberBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    //입력받는 스캐너
    private Scanner scanner = new Scanner(System.in);

    //전화번호를 입력받는 화면
    public String getPhoneNumber(){
        System.out.println("전화번호를 입력하세요 : ");
        return scanner.nextLine();
    }

    //회원을 입력받는 화면
    public Members getMemberInfo(){
        System.out.println("신규 회원 정보를 입력하세요 : ");
        System.out.print("전화 번호 : ");
        String phoneNumber = scanner.nextLine();

        System.out.print("이름 : ");
        String userName = scanner.nextLine();

        System.out.print("이메일 : ");
        String email = scanner.nextLine();

        System.out.print("주소 : ");
        String address = scanner.nextLine();

        System.out.print("생년월일(YYYY) : ");
        int birthYear = scanner.nextInt();
        scanner.nextLine();

        return new Members(phoneNumber,userName,email,address,birthYear);
    }

    //회원 정보 조회 하여 출력
    public  void printMemberRecordInfo(Members member ){
        System.out.println("["+member.getUserName()+"]의 회원 정보");
        System.out.println("회원 이름 : " + member.getUserName());
        System.out.println("이메일 : " + member.getEmail());
        System.out.println("전화 번호 : " + member.getPhoneNumber());
        System.out.println("주소 : " +member.getEmail());
        System.out.println("생년월일 : " + member.getBirthYear());
    }


   public  void printMessage(String message){
       System.out.println(message);
   }

}
