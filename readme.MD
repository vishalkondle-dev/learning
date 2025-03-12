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