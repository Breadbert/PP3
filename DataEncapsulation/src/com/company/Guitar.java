package com.company;

public class Guitar {
    private final int strings = 6;
    private String model;
    private String pickups;

    public void setModel(String model){
        this.model = model;
    }

    public void setPickups(String pickups){
        this.pickups = pickups;
    }

    public String getModel(){
        return model;
    }

    public String getPickups(){
        return pickups;
    }

    public Guitar(String model, String pickups){
        this.setModel(model);
        this.setPickups(pickups);
    }
}
