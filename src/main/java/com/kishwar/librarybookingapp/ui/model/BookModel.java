package com.kishwar.librarybookingapp.ui.model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class BookModel {

    @Id
    @GeneratedValue
    long id;

    @Column(name="name")
    String name;

    @Column(name="author")
    String author;

    @Column(name="number_in_stock")
    int numberInStock;

    public BookModel() {
    }

    public BookModel(long id, String name, String author, int numberInStock) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.numberInStock = numberInStock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }
}
