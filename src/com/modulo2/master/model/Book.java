package com.modulo2.master.model;

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
        this.price = price;
    }

    // Constructors chain

    // Second Constructor
    // Using two attributes
    public Book(String title, String author){
        this(title, author, "Editorial",0.0);
    }

    // Third Constructor
    // Using three attributes
    public Book(String title, String author, String editorial){
        this(title, author, editorial,0.0);
    }

    // Fourth Constructor
    // one attribute
    public Book(String title){
        this(title, "Autor","Editorial");
    }

    // Default Constructor
    // Initialize attributes with its default value
    public Book(){
        this("Titulo");
    }

    // Getters
    // To call the attribute
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getEditorial(){
        return editorial;
    }
    public Double getPrice(){
        return price;
    }
}
