class Triangle extends shape{
    private int a;
    private int b;
    private int c;
    private int h;
    
    public Triangle(int a, int b, int c, int h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    void surfaceArea(){
        System.out.println("triangle: " + ((a*h)/2));
    }
    
    void perimeter(){ System.out.println("triangle perimeter: " + (a + b + c)); }
}