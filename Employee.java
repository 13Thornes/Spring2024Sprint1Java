import java.util.ArrayList;

public class Employee  extends Patron{
    
    private int empID;
    private String position;

    public Employee(int patronID, String name, String address, String phoneNum, int empID, String position) {
        super(patronID, name, address, phoneNum);
        this.empID = empID;
        this.position = position;
    }

    public Employee(int patronID, String name, String address, String phoneNum, int empID, String position, ArrayList<LibaryItem> itemList) {
        super(patronID, name, address, phoneNum);
        this.empID = empID;
        this.position = position;
        ArrayList<LibaryItem> borrowList = new ArrayList<LibaryItem>();
        borrowList.addAll(itemList);
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public String toString() {
        return (super.toString() + " Employee[EmployeeID= " + empID + ", Position= " + position + "]") ;
    }
}
