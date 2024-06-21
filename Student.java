import java.util.ArrayList;

public class Student extends Patron{
    private int studentID;
    private String school;
    private int grade;

    public Student(int patronID, String name, String address, String phoneNum, int studentID, String school, int grade) {
        super(patronID, name, address, phoneNum);
        this.studentID = studentID;
        this.school = school;
        this.grade = grade;
    }

    public Student(int patronID, String name, String address, String phoneNum, int studentID, String school, int grade, ArrayList<Book> itemList) {
        super(patronID, name, address, phoneNum);
        this.studentID = studentID;
        this.school = school;
        this.grade = grade;
        ArrayList<Book> borrowList = new ArrayList<Book>();
        borrowList.addAll(itemList);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return (super.toString() + " Student[StudentID= " + studentID + ", School= " + school + " , Grade= " + grade + "]") ;
    }
}
