package com.company;

public class Rectangles {

    private int width;
    private int height;

    public Rectangles(int w, int h){
        this.width = w;
        this.height = h;
    }

    public String displayInformation(){
        int perimeter = 2 * width + 2 * height;
        int area = height * width;
        return "Dimensions: " +width+ "x" +height+ "\nPerimeter: " +perimeter+ "\nArea: " +area;
    }
}
