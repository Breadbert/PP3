package com.company;

public class file {
    private String name;
    private String type;

    public file(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String displayName(){
        return name + type;
    }
}
