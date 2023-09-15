package org.example.books;

public class BaseBook{

    protected String author;
    public int year;
    protected String name;

    BaseBook(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public BaseBook(String author, int year, String name){
        this.author = author;
        this.year = year;
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void print(){
        System.out.println("Author: "+this.getAuthor());
        System.out.println("Name: "+this.name);
        System.out.println("Year: "+this.year);
    }

    public static void print(BaseBook b){
            b.print();
    }

}
