package com.kishwar.librarybookingapp.ui.model;

public class BookingRequestModel {
    private String username;
    private String bookName;

    public BookingRequestModel() {
    }

    public BookingRequestModel(String username, String bookName) {
        this.username = username;
        this.bookName = bookName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
