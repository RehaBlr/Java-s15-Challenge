package com.challenge.library.model;

import com.challenge.library.model.enums.Categories;

public class Book {
    private static int ID =0;
    private int id;
    private String name;
    private String author;
    private Categories categories;
    private double price;

    public Book(String name, String author,Categories categories,double price) {
        this.name = name;
        this.author = author;
        this.categories = categories;
        this.price = price;
        ID++;
        id = ID;
    }

    public int getId() {
        return id;
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

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", categories='" + categories + '\'' +
                ", price=" + price +
                '}';
    }
}
