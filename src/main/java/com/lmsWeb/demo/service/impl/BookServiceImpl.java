package com.lmsWeb.demo.service.impl;



import com.lmsWeb.demo.dao.BookDAO;
import com.lmsWeb.demo.domain.Book;
import com.lmsWeb.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class BookServiceImpl implements BookService {
    @Autowired
    BookDAO bookDAO;


    BookServiceImpl(BookDAO bookDAO){
        this.bookDAO = bookDAO;
    }

    @Override
    public Book searchBook(Book book) {
        System.out.println("Calling BookService .....Searching the book");
        book=bookDAO.searchBook(book);
        return book;
    }
    @PostConstruct
    public void init(){
        System.out.println("MyService init method called");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("MyService destroy method called");
    }

    public String fallbackMethod(){
        return "fallback method";
    }
}
