package com.company;

public class Student {
    public String name;
    public String surname;
    public int age;
    public int semesterNumber;
    public float averageGrade;
    public int ID;
    public boolean IDvalidity;

    public Student(String name, String surname, int age, int ID, boolean validID, int semester, float average){
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.ID = ID;
        this.IDvalidity = validID;
        this.semesterNumber = semester;
        this.averageGrade = average;
    }

    public String sayHello(){
        return "Hello";
    }

    public String displayName(){
        return "I am " + name + surname;
    }

    public String displayAge(){
        return "I am " + age + " years old";
    }

    public String displayInformation(){
        if(IDvalidity){
            return "Name: " + name + "\nSemester Number: " + semesterNumber + "\nAverage Grade: " + averageGrade;
        } else {
            return "ID is not valid";
        }
    }

    public void changeValidity(boolean newValidity){
        this.IDvalidity = newValidity;
    }



}
