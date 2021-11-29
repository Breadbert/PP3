
public class ebook extends book
{
   private String fileName;
   
   public void setFileName(String fileName){
       this.fileName = fileName;
   }
   
   public String getFileName(){
       return fileName;
   }
   
   public ebook(String fileName, String title, String author){
       super(title, author);
       setFileName(fileName);
   }
   
   public String display(){
       return getTitle() + "by the author " + getAuthor();
   }
}
