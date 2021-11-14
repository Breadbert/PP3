package com.company;

public class Main {

    public static void main(String[] args) {
	    Product p1 = new Product("Apple", true);
	    Product p2 = new Product("Meat", false);

	    System.out.println(p1.getName());
	    System.out.println(p1.getVegetarian());
	    System.out.println(p2.getName());
	    System.out.println(p2.getVegetarian() + "\n");

	    Guitar bb = new Guitar("Schecter Demon-6", "Seymour-Duncan diamond active pickups");
	    System.out.println(bb.getModel());
	    System.out.println(bb.getPickups());
    }
}
