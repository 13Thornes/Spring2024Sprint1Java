public class Books extends LibaryItem{
    private String title;
    private String genre;
    private String rating;
    private String des;

    public Books (String date, Author author, String title, String genre, String rating, String des){
        super(date, author);
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.des = des;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getRating() {
        return rating;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
   
        return (super.toString() + ", Book[ Title:" + title + ", Genre:" + genre + ", rating:" + rating + ", des:" + des +"]]");
    }
}
