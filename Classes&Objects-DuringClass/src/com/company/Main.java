package com.company;

public class Main {

    public static void main(String[] args) {
	    Student s1 = new Student("Robert", "Durda", 19, 219250, true, 3, 6.0f);
	    s1.sayHello();
	    s1.displayAge();
	    s1.displayName();

	    Student s2 = new Student("Krzysztof", "Kononowicz",59, 213700, false, 1, 2.3f);
        s2.sayHello();
        s2.displayAge();
        s2.displayName();

        Student s3 = new Student("Wojciech", "Suchodolski", 55, 213701, false, 1, 1.2f);
        s3.sayHello();
        s3.displayAge();
        s3.displayName();

        Student s4 = new Student("Luca", "Bartolotti", 19, 111111, true, 3, 3.4f);
        s4.displayInformation();
        s4.changeValidity(false);
    }
}
