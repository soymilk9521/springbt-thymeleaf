package com.example.springbthyme.entity;

public class BookBean {
    public String name;
    public String author;
    public String price;

    public BookBean() {
    }

    public BookBean(String name, String author, String price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getValue() {
        return "value1111";
    }
}
