
public class book
{
    private String title;
    private String author;
    
    public book(String title, String author){
        setTitle(title);
        setAuthor(author);
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String display(){
        return title + "by the author " + author;
    }
}