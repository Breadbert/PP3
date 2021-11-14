package com.company;

public class Book {
    private String title;
    private String author;
    private int pageCount;
    private int currentPage;

    public Book(String title, String author, int pageCount, int currentPage){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.currentPage = 1;
    }

    public String displayBookInfo(){
        return "title: " + title + "author: " + author + "\npage " + currentPage + "/" + pageCount;
    }

    public void turnPage(){
        currentPage++;
    }
}
