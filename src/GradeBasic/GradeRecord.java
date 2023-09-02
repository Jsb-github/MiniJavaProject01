package GradeBasic;

public class GradeRecord {
    private String studentPhone;
    private int kor;
    private int eng;
    private int math;

    public GradeRecord() {}

    public GradeRecord(String studentPhone, int kor, int eng, int math) {
        this.studentPhone = studentPhone;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }


    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "GradeRecord{" +
                "studentPhone='" + studentPhone + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }
}
