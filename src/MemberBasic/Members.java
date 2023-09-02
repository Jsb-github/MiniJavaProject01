package MemberBasic;

public class Members {
    private  String phoneNumber;
    private  String userName;
    private  String email;
    private  String address;
    private  int birthYear;

    public Members(){} //기본 생성자

    public Members(String phoneNumber, String userName, String email, String address, int birthYear) {
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.email = email;
        this.address = address;
        this.birthYear = birthYear;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Members{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
