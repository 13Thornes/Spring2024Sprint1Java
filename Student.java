import java.util.ArrayList;
/**
 * @author Samantha Throne
 * @version 1.00
 */
public class Student extends Patron{
    /**
     * repersents the ID of the student
     */
    private int studentID;
    /**
     * repersents the school of the student
     */
    private String school;
    /**
     * repersents the grade of the student
     */
    private int grade;

    /**
     * creates a Student object
     * @param patronID accepts patronID and set it to the Student object
     * @param name accepts name and set it to the Student object
     * @param address accepts address and set it to the Student object
     * @param phoneNum accepts phoneNum and set it to the Sutdent object
     * @param studentID accepts studentID and set it to the Student object
     * @param school  accepts school and set it to the Student object
     * @param grade accepts grade and set it to the Student object
     */
    public Student(int patronID, String name, String address, String phoneNum, int studentID, String school, int grade) {
        super(patronID, name, address, phoneNum);
        this.studentID = studentID;
        this.school = school;
        this.grade = grade;
    }

    /**
     * creates a Student object
     * @param patronID accepts patronID and set it to the Student object
     * @param name accepts name and set it to the Student object
     * @param address accepts address and set it to the Student object
     * @param phoneNum accepts phoneNum and set it to the Sutdent object
     * @param studentID accepts studentID and set it to the Student object
     * @param school  accepts school and set it to the Student object
     * @param grade accepts grade and set it to the Student object
     * @param grade accepts itemList and set it to the Student object
     */
    public Student(int patronID, String name, String address, String phoneNum, int studentID, String school, int grade, ArrayList<LibaryItem> itemList) {
        super(patronID, name, address, phoneNum);
        this.studentID = studentID;
        this.school = school;
        this.grade = grade;
        ArrayList<LibaryItem> borrowList = new ArrayList<LibaryItem>();
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
