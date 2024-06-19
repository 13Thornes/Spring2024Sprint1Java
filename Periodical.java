public class Periodical extends LibaryItem {
    public String type;
    public String issueNum;

    public Periodical(int itemID, String title, Author author, String isbn, String publisher, int copyNum,String type, String issueNum){
        super(itemID, title, author, isbn, publisher, copyNum);
        this.type = type;
        this.issueNum = issueNum;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIssueNum() {
        return this.issueNum;
    }

    public void setIssueNum(String issueNum) {
        this.issueNum = issueNum;
    }


    @Override
    public String toString() {
   
        return (super.toString() + " Periodical[Type= " + type + ", Issue No.= " + issueNum + "]");
    }
}


