package com.company;

public class Main {

    public static void main(String[] args) {
        folder the_folder = new folder("klekoty");
        file file1 = new file("main", ".java");
        file file2 = new file("folder", ".java");

        the_folder.addToFolder(file1);
        the_folder.addToFolder(file2);
        the_folder.displayContents();

        file file3 = new file("file", ".java");

        the_folder.addToFolder(file3);
        the_folder.displayContents();
        the_folder.removeFile(file3);

        the_folder.displayContents();
    }
}
