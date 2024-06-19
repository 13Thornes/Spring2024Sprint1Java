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
}
