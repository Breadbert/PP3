public class Rectangle extends shape{
     private int a;
     private int b;
     
     public Rectangle(int a, int b){
         this.a = a;
         this.b = b;
     }
     
     void surfaceArea(){
         System.out.println("rectangle: " + (a*b));
     }
     
     void perimeter(){ System.out.println("rectangle perimeter: " + (2*a + 2*b)); }
}