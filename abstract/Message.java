

public abstract class Message
{
    public String text;
    public abstract void send();
    
    public Message(String text){
        this.text = text;
    }
    
    public void setText(String text){
        this.text = text;
    }
    
    public String getText(){
        return this.text;
    }
    
    public int charNumber(){
        return this.text.length();
    }
}
