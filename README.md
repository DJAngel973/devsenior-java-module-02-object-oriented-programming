# Module 2 – Object-Oriented Programming
![Java Logo](https://www.oracle.com/a/tech/img/cb88-java-logo-001.jpg)

Module 2 focuses on Object-Oriented Programming (OOP) principles, reinforcing core concepts such as encapsulation, inheritance, polymorphism, interfaces, and abstract classes. These topics are explored through guided explanations and practical exercises provided by [DevSenior](https://devseniorcode.com/).

## 📚 Contents
This project was developed using the Model-View-Controller (MVC) pattern to reinforce the Single Responsibility Principle (SRP) and other SOLID design principles. It features a start menu that allows users to navigate through each class and view its most representative exercise, offering a practical overview of key programming concepts.

- [Main](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/Main.java)

### 📁 Model
- [Book](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/model/Book.java)
- [BookService](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/model/BookService.java)
- [Car](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/model/Car.java)
- [Employee](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/model/Employee.java)
- [EmployeeService](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/model/EmployeeService.java)
- [Motorcycle](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/model/Motorcycle.java)
- [Truck](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/model/Truck.java)
- [Vehicle](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/model/Vehicle.java)
- [VehicleService](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/model/VehicleService.java)

### 📁 View
- [BookUI](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/view/BookUI.java)
- [Class2UI](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/view/Class2UI.java)
- [EmployeeUI](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/view/EmployeeUI.java)
- [InputUserUI](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/view/InputUserUI.java)
- [MenuClassUI](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/view/MenuClass1UI.java) 
- [PrimaryMenuUI](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/view/PrimaryMenuUI.java)
- [VehicleUI](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/view/VehicleUI.java)

### 📁 Controller
- [AppController](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/controller/AppController.java)
- [BookController](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/controller/BookController.java)
- [EmployeeController](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/controller/EmployeeController.java)
- [FleetVehicleController](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/controller/FleetVehicleController.java)
- [MenuClass1Controller](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/controller/MenuClass1Controller.java)
- [MenuClass2Controller](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/controller/MenuClass2Controller.java)
- [MenuController](https://github.com/DJAngel973/devsenior-java-module-02-object-oriented-programming/blob/main/src/com/modulo2/classoneandtwo/controller/MenuController.java)

## Description of Functionalities

Explanation of core Object-Oriented Programming (OOP) concepts through exercise, all structured as a unified module. The main menu navigates through each [DevSenior](https://devseniorcode.com/) class, while a startup menu enables hands-on practice with the MVC pattern.

- **Object-Oriented Programming** (OOP) is a structural approach that applies principles such as Single Responsibility (SRP) and the broader SOLID design guidelines. Each class is designed to representa specific object or behavior, promoting modularity and independent entry point to initialize and launch the application.
- **Objects** is a real-wold entities such as buildings, vehicles, or people can be represented as objects. Each object has its own characteristics (called attributes or properties) and behaviors (called methods). For instance, a `Vehicle` object could have a `color` property abd an `move()` method. This abstraction helps model systems in a more natural and modular way, making code easier to maintain and extend.
- **Class** is a like a blueprint or model used to create objects. For example, a `Vehicle` class defines that every vehicle should have a `color` attribute and the ability to perform actions like `move()`. Each object created from this class will inherit those properties and behaviors, enabling structured and reusable code.  `Scanner` fo
- **SRP** the Single Responsibility Principle (SRP) states that a class should have one, and only one, reason to change. In practice, this means that a class should focus on a single responsibility or functionality. SRP os the first in SOLID, a collection of five foundational design principles for writing clean and maintainable object-oriented code.
- **Encapsulation** is the practice of restricting direct access to an object is internal state. This is typically by declaring attributes as `private` or `protected`, ensuring they cannot be accessed or modified directly form outside the class, To interact with these attributes, public `getter` and `setter` methods are provided, which allow controlled access and updates, promoting data integrity and security.
- **Inheritance** allows a class (subclass or child class) to derive attributes and behaviors form another class (superclass or parent class). For example, a vehicle superclass might define common properties such as color and shared methods `like accelerate()`. Subclasses such as `Car`, `Motorcycle`, or `Bicycle` inherit these features using the extends keyword, enabling code reuse and consistency across related object types.
- **Polymorphism** is the ability of objects to take on multiple forms through a shared interface or superclass. It allows methods with the same name to behave differently depending on the object that calls them. This enables flexible and extensible code, where different classes can implement their own version of a method while being accessed uniformly.
- **Abstract**  class is a class is a class that cannot be instantiated directly and serves as a blueprint for other classes. It may contain abstract methods (without implementation) and concrete methods (with implementation). Subclasses must implement all abstract methods unless they themselves are declared abstract.
- **Interface** in java is a contract that defines a set of method signatures without implementation. Classes that implement an interface must provide concrete implementation for all its methods. Interfaces are great for achieving polymorphism, loose coupling, and designing scalable architectures.

## Objectives of OOP

- **Modular** breaks down complex problems into smaller, manageable components.

- **Reusable** uses blueprints (classes) to create multiple similar buildings (objects).

- **Maintainable** if one building needs repair, you fix only that part - not the entire city.

- **Extensible** allows adding new types of buildings or vehicles without rebuilding everything from scratch.


## How to Use This Repository

You can clone it to interact with the exercises via the console or a user interface.

## Status

✔️ Module 2 in progress. Exercises are organized by class sessions.

## About Me

Hi, my name is Juan David.  
Software engineering student driven by curiosity and innovation. Passionate about emerging technologies and secure development practices. I'm currently exploring scalable databases and refining project structures to improve efficiency and security.

## 🛠️ Requirements
To run the exercises in this repository, you will need:
- **Java Development Kit (JDK)**: Version **21**
- [Download JDK](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)

- **VS Code** or **IntelliJ IDEA**
  Recommend extensions for VS Code:
    - Extension Pack for Java
    - Code Runner

## How to Compile and Run
You can compile and run each `.java` file individually using the terminal or your preferred IDE.
### Using VS Code or IntelliJ IDEA
1. Open the repository in your IDE.
2. Navigate to the class you want to run.
3. Click the **Run** or **Play** icon to execute the program.

### Using the terminal (Linux, Windows or macOS with Git Bash)
1. Navigate to the folder containing the `.java` file:

    ```bash
   cd src/com.modulo2.classoneandtwo

2. Compile the file:

    ```bash
   javac Main.java

3. Run the program:

    ```bash
   java Main

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white)
![Linux](https://img.shields.io/badge/OS-Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black)
![VS Code](https://img.shields.io/badge/Editor-VS%20Code-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white)