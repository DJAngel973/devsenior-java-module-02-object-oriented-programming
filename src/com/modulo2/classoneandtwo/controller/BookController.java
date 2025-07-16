package com.modulo2.classoneandtwo.controller;

import com.modulo2.classoneandtwo.model.Book;
import com.modulo2.classoneandtwo.model.BookService;
import com.modulo2.classoneandtwo.view.BookUI;

public class BookController {

    // Create object
    private final BookUI bookUI = new BookUI();
    private final BookService bookService = new BookService();

    // Message
    public void showMessage(){
        bookUI.exampleBook();
        bookUI.firstMessage();
    }

    // Show books
    public void showBook(){
        bookUI.showInfoBook(bookService.getBook1());
        bookUI.showInfoBook(bookService.getBook2());
        bookUI.showInfoBook(bookService.getBook3());
        bookUI.showInfoBook(bookService.getBook4());
    }
}
