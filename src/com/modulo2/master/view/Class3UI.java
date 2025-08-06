package com.modulo2.master.view;

public class Class3UI {

    // show menu
    public void menuClass3(){
        System.out.println("""
                Modelado Avanzado de Clases POO
                1. Explicación
                2. Ejercicio Sistema Básico de Gestión Universitaria
                3. Volver menu principal
                Escoge una opción valida:
                """);
    }

    // show explication
    public void explication(){
        System.out.println("""
                
                     Modelado Avanzado de Clases en POO
                Ahora empezamos a darle forma en POO para la orientación de las clases, implementando Herencia y Polimorfismo,
                usar la abstracción, hacer colecciones de objetos con Arrays en las relaciones.
                
                     Array
                El Array es una estructura de datos que se puede implementar para hacer colecciones de objetos, ya que es
                un espacio que nos da para poder guardar datos de forma ordenada, debemos darle el tamaño, ya que su tamaño
                es fijo, se declara con '[]'.
                
                     Array Multidimensional
                Este array va conformado por mas arrays dentro de el, por ejemplo el array de dos dimensiones '[][]',
                en desarrollo nos indica que dentro de un array hay otro array, el prime [] es el punto de partida, es decir
                si están [3][3] significa que puede ser un cubo con 9 espacios adentro ya que el primer array tiene 3 espacios
                y adicional el segundo array tiene 3 espacios, esos 3 espacios esta diciendo que cada espacio del primer array,
                cada uno tiene 3 espacios por dentro, al sumar dan 9 espacios.
                
                     Asociación
                Esta relación avanzada representa como los objetos de una clase pueden estar relacionados con objetos de otra
                clase, aca surgen varias relaciones como uno a uno, uno a muchos, muchos a muchos.
                
                     Composición
                En la composición hay un todo es el que genera o construye la composición, el objeto compuesto no puede existir
                sin el objeto que lo contiene,como ejemplo se puede decir que ciertos útiles escolares,
                son la lista de útiles para un estudiante, eca el todo seria la lista de útiles,
                dentro están los útiles que necesita el estudiante.
                
                     Agregación
                En este caso el objeto puede existir independientemente al todo, es similar al de composición solo que mas flexible
                ya que los objetos pueden existir por separado, en el anterior ejemplo seria los estudiantes.
                """);
    }

    // Show first message
    public void welcome(){
        System.out.println("""
                \nLa clase 3 se compone del modelado avanzado de clases en POO, de acuerdo a herencia, polimorfismo podemos
                empezar a crear modelados avanzados, implementando arrays y las relaciones.
                """);
    }
}