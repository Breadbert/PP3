package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class folder {
    private String folderName;
    private int itemCount;
    private ArrayList<file> files = new ArrayList<>();

    public folder(String folderName){
        this.folderName = folderName;
        this.itemCount = 0;
    }

    public void addToFolder(file f){
        files.add(f);
        itemCount++;
    }

    public void removeFile(file f){
        files.remove(f);
        itemCount--;
    }

    public void displayContents(){
        for(int i = 0; i < files.size(); i++){
             file  f = files.get(i);
             System.out.println(f.displayName());
        }
        System.out.println("This folder has " + itemCount + " files.");
    }
}
