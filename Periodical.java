/**
 * @author Samantha throne
 */
public class Periodical extends LibaryItem {
    /**
     * repersents the type of the Periodical object
     */
    private String type;
    /**
     * repersents the issue number of the Periodical object
     */
    private String issueNum;

    /**
     * create a Periodical object
     * @param itemID accepts itemID and set it to the Periodical object
     * @param title accepts title and set it to the Periodical object
     * @param author accepts author and set it to the Periodical object
     * @param isbn accepts isbn and set it to the Periodical object
     * @param publisher accepts publisher and set it to the Periodical object
     * @param copyNum accepts copyNum and set it to the Periodical object
     * @param type accepts type and set it to the Periodical object
     * @param issueNum accepts issueNum and set it to the Periodical object
     */
    public Periodical(int itemID, String title, Author author, String isbn, String publisher, int copyNum,String type, String issueNum){
        super(itemID, title, author, isbn, publisher, copyNum);
        this.type = type;
        this.issueNum = issueNum;
    }

    /**
     * create a null Periodical object
     */
    public Periodical(){}

    /**
     * 
     * @return returns the type of the Periodical object
     */
    public String getType() {
        return this.type;
    }

    /**
     * 
     * @param type accepts type and set it to the Periodical object
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return returns the issueNum of the Periodical object
     */
    public String getIssueNum() {
        return this.issueNum;
    }

    /**
     * 
     * @param issueNum accepts issueNum and set it to the Periodical object
     */
    public void setIssueNum(String issueNum) {
        this.issueNum = issueNum;
    }


    /**
     * @return returns the data of the Periodical Object as a string
     */
    @Override
    public String toString() {
   
        return (super.toString() + " Periodical[Type= " + type + ", Issue No.= " + issueNum + "]");
    }
}

