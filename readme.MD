# Learning
## Java
### Introduction

### Exception Handling
#### Keywords: try, catch, finally, throw, throws
- Methods of java.lang.Throwable class
  - addSuppressed(), fillInStackTrace(), getCause(), getLocalizedMessage(), getMessage(), getStackTrace(), getSuppressed(), initCause(), printStackTrace(), printStackTrace(), printStackTrace(), setStackTrace(), and toString().
- Methods of java.lang.Object class
  - clone(), equals(), finalize(), getClass(), hashCode(), notify(), notifyAll(), and wait().

![Exception Hierarchy Tree](https://cdn.rollbar.com/wp-content/uploads/2021/07/java-exceptions-hierarchy-example.png)

### OOP
#### Inheritance
- 1. Single Inheritance
- 2. Multilevel Inheritance
- 3. Hierarchical Inheritance
- 4. Multiple Inheritance (using interfaces)
- 5. Hybrid Inheritance

### Encapsulation
- Making class variables private, and they can be set or get by class public methods.

### Polymorphism
- Methord Overloading : Same method overloading in same class with differ in parameters.
- Method Overriding : Same method overriding in inherited classes
- Operator Overloading : + will add the numbers and concat the strings

### Abstraction
#### Abstraction
  - extends
  - Abstraction is the process of hiding the internal details and showing only the necessary information to the user.
  - **Abstract Class**
    - a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
  - **Abstract Method**
    - can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

#### Interfaces:
- **implements**
- Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
- Interface methods do not have a body - the body is provided by the "implement" class
- On implementation of an interface, you must override all of its methods
- Interface methods are by default abstract and public
- Interface attributes are by default public, static and final
- An interface cannot contain a constructor (as it cannot be used to create objects)

### Modifiers
#### Access Modifiers
- **Classes**
  - **public** : The class is accessible by any other class	
  - **default** : The class is only accessible by classes in the same package. This is used when you don't specify a modifier.
- **Attributes, Methods, Constructors**
  - **public** : The code is accessible for all classes.
  - **private** : The code is only accessible within the declared class.
  - **default** : The code is only accessible in the same package. This is used when you don't specify a modifier.
  - **protected** : The code is accessible in the same package and subclasses.
#### Non-Access Modifiers
- **Classes**
  - **final** : The class cannot be inherited by other classes.
  - **abstract** : The class cannot be used to create objects (To access an abstract class, it must be inherited from another class).
- **Attributes, Methods**
  - **final** : Attributes and methods cannot be overridden/modified.
  - **static** : Attributes and methods belongs to the class, rather than an object.
  - **abstract** : Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from).
  - **transient** : Attributes and methods are skipped when serializing the object containing them.
  - **synchronized** : Methods can only be accessed by one thread at a time.
  - **volatile** : The value of an attribute is not cached thread-locally, and is always read from the "main memory".

### Enums
- An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
- To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters: