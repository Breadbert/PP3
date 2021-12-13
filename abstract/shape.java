
public abstract class shape
{
   abstract void surfaceArea();
   abstract void perimeter();
   
   public static void main(String[] args){
    Triangle t = new Triangle(5, 6, 6, 4);
    Rectangle r = new Rectangle(3, 3);
    Circle c = new Circle(9);
    t.surfaceArea();
    t.perimeter();
    r.surfaceArea();
    r.perimeter();
    c.surfaceArea();
    c.perimeter();
}
}
