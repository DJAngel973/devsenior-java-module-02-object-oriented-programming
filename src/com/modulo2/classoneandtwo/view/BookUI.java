package com.modulo2.classoneandtwo.view;

import com.modulo2.classoneandtwo.model.Book;

public class BookUI {

    // Method message
    public void firstMessage(){
        System.out.println("\uD83D\uDCDA \uD83D\uDCDA  Libros disponibles  \uD83D\uDCDA \uD83D\uDCDA");
    }

    // Method show information book
    public void showInfoBook(Book book){
        System.out.printf("""
                Titulo: %s
                Autor: %s
                Editorial: %s
                Precio: $%.2f
                """, book.getTitle(), book.getAuthor(), book.getEditorial(), book.getPrice());
    }
}
