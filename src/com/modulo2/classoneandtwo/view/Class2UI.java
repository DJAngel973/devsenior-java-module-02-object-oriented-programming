package com.modulo2.classoneandtwo.view;

public class Class2UI {

    // show menu
    public void menuClass2(){
        System.out.println("""
                Herencia, polimorfismo, clases abstractas e Interfaces
                1. Explicación
                2. Ejercicio Modelando una flota de vehículos
                3. Volver menu principal
                Escoge una opción valida:
                """);
    }

    // show explication
    public void explication(){
        System.out.println("""
                
                🧬 🧬 🧬   Herencia   🧬 🧬 🧬
                Básicamente es generar una clase en superClase, donde tenemos atributos, constructores, getters
                y setters si es necesario, para poder definirla como superClase es importante determinar el uso
                que le queremos dar, ya que una superClase busca es reutilizar código, tener una mejor organización,
                por ejemplo si se crea una clase animal, se estaría entendiendo algo general, que puede tener cualquier
                tipo de animal, en ese caso se puede decir "perro ES UN TIPO DE animal", entonces la clase animal se
                puede dejar como superClase ya que puede tener atributos, métodos, que son iguales para diferentes tipos
                de animales, como peso, tipo, nombre, edad, entre otro.
                Con la herencia podemos crear subClases que tomen los métodos y atributos que necesiten de la superClase
                al agregar la palabra 'extends' ya definimos que la clase va a heredar algunas atributos o métodos, para
                poder heredar la superClase tiene que definir atributos public o protected, si son privados puede acceder
                a ellos mediante los getters.
                
                🎭 🎭 🎭   Polimorfismo   🎭 🎭 🎭
                El polimorfismo es generar varias formas de métodos con su mismo nombre, dentro de la misma clase, solo
                que varia los atributos, parámetros que toma el método, por ejemplo un método de suma que toma dos valores
                para ejecutar la suma, para este ejemplo un método puede tomar parámetros Integer, el otro método se llama
                igual y toma igual dos parámetros solo que ahora piden Double, de esta forma podemos tener varios métodos con
                el mismo nombre pero con diferentes parámetros, ya sea tipo o organización de los parámetros, también se maneja
                con sobrecarga, es cuando tenemos un método en nuestra SuperClase y se llama en la SubClase, asignado o declarando
                su propia implementación, en este caso por buena practica se agrega '@Override' para sobreescribir el método.
                
                🧱 🧱 🧱   Clases Abstractas   🧱 🧱 🧱
                Las clases abstractas están diseñadas para ser superClases en su jerarquía de herencia, por lo que una clase abstract
                no se puede instanciar directamente, por eso es como definir la plantilla para las subClases, de la misma forma en los
                métodos es solo implementar la firma, cuando la subClase lo llama hay hace la implementación, estos métodos y las
                clases se definen como 'abstract', pueden tener atributos y constructores, solo que los constructores solo se
                pueden llamar con 'super()'.
                La clase abstract es util para poder definir una estructura o una base común con comportamiento que se requieren en
                las subClases.
                
                🖥️ 🖥️ 🖥️   Interfaz   🖥️ 🖥️ 🖥️
                Se define como un contrato, los métodos que se se implementen en cualquier clase esa interfaz lo debe proporcionar,
                se busca definir capacidades o comportamientos comunes en diferentes clases, sin importar su jerarquía de herencia
                el contrato es decir que debe hacer la clase, pero no el cómo.
                Una clase puede implementar multiples interfaces, también maneja el polimorfismo ya que permite manejar objetos de
                clases diferentes de la misma forma si están implementando la misma interfaz.
                Estas clases se declaran con la 'interface' y se hereda com 'implements'
                
                """);
    }
}
