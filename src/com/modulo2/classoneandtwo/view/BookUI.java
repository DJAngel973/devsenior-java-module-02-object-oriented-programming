package com.modulo2.classoneandtwo.view;

import com.modulo2.classoneandtwo.model.Book;

public class BookUI {

    // Method message
    public void firstMessage(){
        System.out.println("\uD83D\uDCDA \uD83D\uDCDA \uD83D\uDCDA Libros disponibles \uD83D\uDCDA \uD83D\uDCDA \uD83D\uDCDA \n");
    }

    // Method show information book
    public void showInfoBook(Book book){
        System.out.printf("""
                Titulo: %s
                Autor: %s
                Editorial: %s
                Precio: $%.2f
                \n""", book.getTitle(), book.getAuthor(), book.getEditorial(), book.getPrice());
    }

    // Method example explanation Book
    public void exampleBook(){
        System.out.println("""
                ⚡ En este ejemplo de Book miramos como usamos multiples constructores para crear objetos,
                inicializándolos de diferentes formas con diferentes atributos, se implementa los getters que
                nos permiten acceder a los atributos de manera controlada, dando un inicio a la encapsulación
                y a la programación orientada a objetos.
                """);
    }
}
