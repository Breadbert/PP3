package com.company;

public class Counter {
    private int value = 0;

    public int increase(){
        return value++;
    }

    public int decrease(){
        return value--;
    }

    public int increase10(){
        return value += 10;
    }

    public int decrease10(){
        return value -= 10;
    }

    public int reset(){
        return value = 0;
    }

    public int displayCounter(){
        return value;
    }
}
