
public class audiobook extends book
{
    private int minutes;
    private int seconds;
    
    public audiobook(String title, String author, int minutes, int seconds){
        super(title, author);
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public String display(){
        return getTitle() + "by the author " +getAuthor()+ "." + " Time: " + minutes + " minutes, " +seconds+ " seconds.";
    }
}
