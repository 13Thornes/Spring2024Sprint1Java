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

    /**
     * 
     * @return returns the studentID of the Student object
     */
    public int getStudentID() {
        return studentID;
    }



    /**
     * 
     * @param studentID accepts studentID and set it to the Student object
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }


    /**
     * 
     * @return returns the school of the Student object
     */
    public String getSchool() {
        return school;
    }



    /**
     * 
     * @param school accepts school and set it to the Student object
     */
    public void setSchool(String school) {
        this.school = school;
    }


    /**
     * 
     * @return returns the grade of the Student object
     */
    public int getGrade() {
        return grade;
    }



    /**
     * 
     * @param grade accepts grade and set it to the Student object
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @return returns all the data of the Student object as a string
     */
    @Override
    public String toString() {
        return (super.toString() + " Student[StudentID= " + studentID + ", School= " + school + " , Grade= " + grade + "]") ;
    }
}