package com.modulo2.classoneandtwo.controller;

import com.modulo2.classoneandtwo.model.Book;
import com.modulo2.classoneandtwo.view.BookUI;

public class BookController {

    // Create object
    private final BookUI bookUI = new BookUI();

    // Objects
    Book book1 = new Book("Origen","Dan Brown");
    Book book2 = new Book("Buda Blues");
    Book book3 = new Book("O Bloco das Crianças","Otto B. Kraus","Editorial Presenca");
    Book book4 = new Book("1984","George Orwell","",125.30);

    // Message
    public void showMessage(){
        bookUI.firstMessage();
    }

    // Show books
    public void showBook(){
        bookUI.showInfoBook(book1);
        bookUI.showInfoBook(book2);
        bookUI.showInfoBook(book3);
        bookUI.showInfoBook(book4);
    }
}
