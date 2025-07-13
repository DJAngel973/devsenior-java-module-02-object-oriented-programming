package com.modulo2.classoneandtwo;

/*
* Practical Exercise: Creating and Using Encapsulated Objects
* we apply attributes, constructor and objects
*/

// Create class book, as an example
public class Book {

    /* Attributes
    * We use 'private' for encapsulation,
    * with this we force that only in this class it can be modified
    * or through the get and set methods
    */
    private String title;
    private String author;
    private String editorial;
    private Double price;

    /*
    * Constructor
    * Is a type special ot method
    * Used  for create and initialize the object of the class
    * it ensures that a valid and usable object is created
    */
    
    // Primary Constructor
    // it ensures that object have all attributes
    public Book(String title, String author, String editorial, Double price){
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.price =price;
    }

}
