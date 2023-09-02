package GradeBasic;

import java.util.ArrayList;
import java.util.List;

public class Studendt {
    private String studentPhone;
    private String studentName;
    private String email;
    private String address;
    private int birthYear;
    private List<GradeRecord> gradeRecords; // 학생 성적을 저장하는 리스트

    public Studendt() {}

    public Studendt(String studentPhone, String studentName ,String email, String address, int birthYear) {
        this.studentPhone = studentPhone;
        this.studentName = studentName;
        this.email = email;
        this.address = address;
        this.birthYear = birthYear;
        this.gradeRecords = new ArrayList<>();
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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

    public List<GradeRecord> getGradeRecords() {
        return gradeRecords;
    }

    public void addGradeRecords(GradeRecord records) {gradeRecords.add(records);};

}
