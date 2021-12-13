

public class Circle extends shape
{
    private int diameter;
    private final double pi = 3.14;
    
    public Circle(int diameter){
        this.diameter = diameter;
    }
    
    void surfaceArea(){
        System.out.println("circle: " + (diameter * 3.14));
    }
    
    void perimeter(){ System.out.println("circle perimeter: " + (pi * (diameter/2)*(diameter/2))); }
}
