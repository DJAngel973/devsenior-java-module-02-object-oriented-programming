package com.modulo2.master.model;

public class BookService {

    // We define the instances
    // Objects
    private final Book book1 = new Book("Origen","Dan Brown");
    private final Book book2 = new Book("Buda Blues");
    private final Book book3 = new Book("O Bloco das Crianças","Otto B. Kraus","Editorial Presenca");
    private final Book book4 = new Book("1984","George Orwell","",125.30);

    // Getters
    public Book getBook1(){
        return book1;
    }
    public Book getBook2(){
        return book2;
    }
    public Book getBook3(){
        return book3;
    }
    public Book getBook4(){
        return book4;
    }
}
