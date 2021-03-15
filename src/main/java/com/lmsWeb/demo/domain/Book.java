package com.lmsWeb.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Book {
    private int bookId;
    private String bookTitle;
    private List<String> authorName;
    private double price;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        System.out.println("In Book Title");
        return bookTitle;
    }


    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }


    public List<String> getAuthorName() {
        return authorName;
    }

    @Autowired(required = false)
    public void setAuthorName(List<String> authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
