import java.util.ArrayList;
/**
 * @author Samantha Throne
 * @version 1.00
 */
public class Employee  extends Patron{
    /**
     * repersents the id of the employee
     */

    private int empID;

    /**
     * repersents the postion of the employee
     */
    private String position;

    /**
     * Create an Employee object
     * @param patronID accepts the patronID and set it to the Employee object
     * @param name accepts the name and set it to the Employee object
     * @param address accepts the address and set it to the Employee object
     * @param phoneNum accepts the phone number and set it to the Employee objects
     * @param empID accepts the empID and set it to the Employee object
     * @param position accepts the position and set it to the Employee object
     */
    public Employee(int patronID, String name, String address, String phoneNum, int empID, String position) {
        super(patronID, name, address, phoneNum);
        this.empID = empID;
        this.position = position;
    }

    /**
     * Create an Employee object
     * @param patronID accepts the patronID and set it to the Employee object
     * @param name accepts the name and set it to the Employee object
     * @param address accepts the address and set it to the Employee object
     * @param phoneNum accepts the phone number and set it to the Employee objects
     * @param empID accepts the empID and set it to the Employee object
     * @param position accepts the position and set it to the Employee object
     * @param itemList accepts the itemList and set it to the Employee object
     */
    public Employee(int patronID, String name, String address, String phoneNum, int empID, String position, ArrayList<LibaryItem> itemList) {
        super(patronID, name, address, phoneNum);
        this.empID = empID;
        this.position = position;
        ArrayList<LibaryItem> borrowList = new ArrayList<LibaryItem>();
        borrowList.addAll(itemList);
    }

    /**
     * 
     * @return Returns the empID of the Employee Object
     */
    public int getEmpID() {
        return empID;
    }

    /**
     * 
     * @param empID accepts the empID and set it to the Employee object
     */
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    /**
     * 
     * @return returns the position of the Employee object
     */
    public String getPosition() {
        return position;
    }

    /**
     * 
     * @param position accepts the postion and set it to the Employee object
     */
    public void setPosition(String position) {
        this.position = position;
    }


    /**
     * @return returns the Employee object data as a string
     */
    @Override
    public String toString() {
        return (super.toString() + " Employee[EmployeeID= " + empID + ", Position= " + position + "]") ;
    }
}
