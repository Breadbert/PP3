package com.company;

public class Main {

    public static void main(String[] args) {
	    Book bruh = new Book("Crime and Punishment", "Fiodor Dostoyevsky", 576, 1);
	    bruh.displayBookInfo();
	    bruh.turnPage();

	    Book yeah = new Book("Wprowadzenie do Pracowni Programowania 3", "Janusz Stal", 600, 1);
	    yeah.displayBookInfo();
	    bruh.turnPage();

	    Lamp l1 = new Lamp();
	    l1.turnOn();
	    l1.turnOff();
	    System.out.println(l1.displayStatus());

	    Lamp l2 = new Lamp();
	    l1.turnOff();
	    System.out.println(l2.displayStatus());

	    Rectangles r1 = new Rectangles(3, 4);
	    Rectangles r2 = new Rectangles(2, 7);
	    System.out.println(r1.displayInformation());
	    System.out.println(r2.displayInformation());

		Counter c1 = new Counter();
		Counter c2 = new Counter();

		c1.increase10();
		c1.increase10();
		c1.increase();
		c1.increase();
		c1.increase();
		System.out.println(c1.displayCounter());

		c2.decrease10();
		c2.decrease10();
		c2.decrease10();
		c2.decrease10();
		c2.decrease10();
		c2.increase();
		c2.increase();
		c2.increase();
		System.out.println(c2.displayCounter());
    }
}
