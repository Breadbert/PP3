package com.company;

public class Product {
    private String name;
    private boolean isVegetarian;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setVegetarian(boolean b){
        this.isVegetarian = b;
    }

    public boolean getVegetarian(){
        return isVegetarian;
    }

    public Product(String name, boolean isVegetarian){
        this.setName(name);
        this.setVegetarian(isVegetarian);
    }
}
