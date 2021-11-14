package com.company;

public class Lamp {
    private boolean isOn = false;

    public boolean turnOn(){
        return isOn = true;
    }

    public boolean turnOff(){
        return isOn = false;
    }

    public String displayStatus(){
        return "Lamp on: " +isOn;
    }
}
