package com.example.springbthyme.domain;

public class LearnResourceDto {
    public String name;
    public String author;
    public Double price;
    public String content;

    public LearnResourceDto(String name, String author, Double price, String content) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.content = content;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
