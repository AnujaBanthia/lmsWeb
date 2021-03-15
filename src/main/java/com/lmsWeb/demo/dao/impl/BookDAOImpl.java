package com.lmsWeb.demo.dao.impl;


import com.lmsWeb.demo.dao.BookDAO;
import com.lmsWeb.demo.domain.Book;

public class BookDAOImpl implements BookDAO {
    private String dataSource;

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Book searchBook(Book book) {
        System.out.println("Calling BookDAO....Searching book in database");
        return book;
    }
}
