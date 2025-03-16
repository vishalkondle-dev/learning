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

### Java 8 Features
- **Why?**
  - Minimal code
  - Functional programming benefits
  - More Compatible code with multi core processors
- **Features**
  - Lambda Expression
  - Stream API
  - Date and Time API
  - Base64 Encode and Decode
  - Method Reference and Constructor Reference
  - Default methods in interfaces
  - Static methods in interfaces
  - Functional Interface - ```@FunctionalInterface```
  - Optional Class
  - Java IO Improvements
  - Collection API Improvements
#### Lambda Expression
- An anonymous function without a name, access modifiers, return type.
- Syntax: ```(parameters) -> expression```
- Example: ```(int a, int b) -> a + b```
- Lambda expression can be used in place of a method reference.
- Type inference - the compiler automatically infers the type of the variable.
- Lambda expression can be used in place of a constructor reference.
- If body has only one statement, then you can remove the curly braces and the return keyword.
- If only one parameter, then you can remove the parentheses.
- This can be used to create a functional interface.
- Lambda expression can be used in place of a method reference.
- We dont need to create a seperate class which will implement the interface with only one abstract method.
- Directly, we can give the implementation of the method with lambda expression. ie. we dont need to create new class and object.

**Function**
```java
public int lengthOfString(String str) {
    return str.length();
}
```
**Lambda Expression**
```java
str -> str.length()
```
#### Functional Interface
- An interface that contains only one abstract method.
- An interfac can have any number of default and static methods.
- @FunctionalInterface annotation is used to mark an interface as a functional interface.
#### Defaault Methods
- A method in an interface that has a default implementation.
- A default method can be overridden in a subclass.
- A default method can be called using the super keyword. // Parent.super.defaultMethod();
- A default method should have a body.
- A default method cannot be abstract.
- A default method cannot be static.
#### Static Methods
- defined with the static keyword.
- contains the complete definition of the method.
- will not be visible and available to inherited class.
- Only can be called using the interface class.
- public **static** void main(String[] args) can be written in interface.
#### Predicates
- A predicate is nothing but a function that returns a boolean value.
- It has abstract test(), default or(), and, default negate(), static isEqual methods.
- ```Predicate<Integer> isThalaForReason = (s) -> s % 7 == 0;```
#### Function Interface
- A Function is same as a Predicate but, it can something and returns a value.
- It has abstract apply(), default andThen(), default compose() and static identity() method.
#### Consumer
- A Consumer is nothing but a function that does not return anything.
- It has abstract accept() method.
- ```Consumer<String> printString = (s) -> System.out.println(s);```
#### Supplier
- A Supplier is nothing but a function that returns a value.
- It has abstract get() method.
- ```Supplier<String> getString = () -> "Hello";```
#### Bi
- These functions are used for two parameters.
- BiPredicate
- BiFunction
- BiConsumer
#### UnaryOperator and BinaryOperator
- UnaryOperator
- BinaryOperator
- These interfaces are replacement for Function if we have all Generic types same.
  ```java
  Function<Integer, Integer> square = (n) -> n * n;>
  UnaryOperator<Integer> unaryOperator = (n) -> n * n;

  Function<Integer, Integer, Integer> add = (n1, n2) -> n1 + n2;
  BinaryOperator<Integer> binaryOperator = (n1, n2) -> n1 + n2;
  ```
#### Method and Constructor Reference
- We can give these references directly at the place of lambda expression.
- Method Reference
- Constructor Reference
#### Stream
- A stream is a sequence of elements.
- A stream can be created from a collection, array, or other stream.
- There are many methods to create a stream.
  - List li.stream()
  - Arrays.stream(Array a)
  - Stream.of()
  - Stream.iterate()
  - Stream.generate()
- Stream Methods - 
``` filter(), map(), distinct(), sorted(), limit(), skip(), peek(), forEach(), collect(), reduce(), min(), max(), count(), anyMatch(), noneMatch(), findAny(), findFirst() ```
#### Date and Time
- LocalDate
- LocalTime
- LocalDateTime
- ZonedDateTime
- Instant
- Duration
- Period
- DateTimeFormatter
- ZoneOffset
- ```.parse('String', 'Pattern')```
#### Optional Class
- An optional is a container object which may or may not contain a non-null value.
- It is a container object for a single, non-null value.
- An optional can be in one of two states: empty or containing a non-null value.
- An empty optional is created using the empty() method.
- A non-empty optional is created using the of() method.
- An optional can be converted to a value using the get() method.
### Collection Framework
#### *List*
- It stores the elements in contiguous memory locations.
- It is an ordered collection.
- It allows duplicate elements.
- It can be accessed using index.
#### 1. ArrayList
- An ArrayList is a dynamic array.
- It can grow and shrink in size.
- It is a class that implements the List interface.
- It has a add, remove, get, set, size and etc methods.
#### 2. Stack
- A Stack is a last-in-first-out (LIFO) data structure.
- It is a class that implements the Stack interface.
- It has a push, pop, peek, search and etc methods.
- It is used to implement the undo and redo operations.
#### *Queue*
- A Queue is a first-in-first-out (FIFO) data structure.
- It is used to implement the queue operations.
- It is a class that implements the Queue interface.
- It has a peek, offer, poll, search and etc methods.
- It also has add, remove, element which will throw an exception if operation is not successful.
#### 1. LinkedList
- A LinkedList is a class that can implement the **Queue and List** interface.
- It store has 3 parts, data, next and previous.
- next has the address of next element.
- previous has the address of previous element.
- It is a dynamic data structure.
- It can grow and shrink in size.
#### 2. PriorityQueue
- A PriorityQueue is a class that implements the Queue interface.
- It is a class that implements the PriorityQueue interface.
- It also has add, remove, element which will throw an exception if operation is not successful.
- It is a heap data structure.
- We can change the priority by providing a comparator.
- ```PriorityQueue<String> pq = new PriorityQueue<String>(Comparator.reverseOrder());```
#### 3. ArrayDeque
- An ArrayDeque is a class that implements the Deque interface.
- It is a double ended queue.
- It is a dynamic data structure.
- It can add and remove elements from both ends.
- It has a ```offerFirst, offerLast, pollFirst, pollLast, peekFirst, peekLast``` and etc methods which other collections don't have.
#### *Set*
- A Set is a collection of unique elements. does not allow duplicates.
#### 1. HashSet
- A HashSet is a class that implements the Set interface.
- It is a dynamic data structure.
- It is a hash table data structure.
- It has a ```add, remove, contains, size``` and etc methods.
- It doesn't maintain the order of elements.
- Time Complexity - O(1)
#### 2. LinkedHashSet
- It is same as HashSet but it also **maintains the order of elements**.
- Time Complexity - O(1)
#### 3. TreeSet
- It is same as HashSet but it is **a sorted set**.
- It uses binary search tree to maintain the elements.
- Time Complexity - O(log n)
#### Map
- A Map is a collection of key-value pairs.
#### 1. HashMap
- A HashMap is a class that implements the Map interface.
- It will not be sorted or ordered.
- It is a dynamic data structure.
- It is a hash table data structure.
- It has a ```put, get, remove, containsKey, containsValue, size``` and etc methods.
- Time Complexity - O(1)
#### 2. TreeMap
- It is same as HashMap but it is **a sorted map**.
- It uses binary search tree to maintain the elements.
- Time Complexity - O(log n)
#### Arrays Class
- An array is a collection of elements of the same type.
- It is a static data structure.
- It is a contiguous data structure.
- It has a fixed size.
#### Collections Class
- A Collections class has many static methods as : ```sort(), reverse(), shuffle(), copy(), swap(), fill(), binarySearch()```.
- It is a utility class that provides a number of useful methods for working with collections.
- For Sorting of Class Objects, we need to implement Comparable Interface in our class. and override the compareTo() method.
- Comparator is a functional interface that takes two objects and returns an integer to compare them.
### Multithreading
**Definitions**:
- **CPU**: The central processing unit of a computer, responsible for executing instructions.
- **Core**: An independent processing unit within a CPU. Modern CPUs have multiple cores to execute tasks in parallel.
- **Program**: A set of instructions that can be executed by a computer.
- **Process**: A running instance of a program that has its own memory space and resources. A process can have multiple threads.
- **Thread**: The smallest unit of execution within a process. Threads share the same memory and resources of their parent process but can execute independently.
- **Multitasking**: 
  - At level of processes, which are the OS's primary units of execution.
  - allows multiple programs to run concurrently.
  - Each process has its own memory space and resources.
- **Multithreading**: 
  - At level of threads, which are the smallest units of execution within a process.
  - allows multiple threads to run concurrently within a process.
- **CPU (Manager)**: Manages different teams (processes).
- **Processes (Teams)**: Each process is an independent team working on a specific project.
- **Threads (Employees within a Team)**: Employees (threads) work together on different tasks within the same team (process) and share resources like memory.
#### Threads
- To create a thread, we need to extend the Thread class or implement the Runnable interface, and override the run() method.
- To start a thread, we need to call the start() method.
- When we create thread with Runnable interface, we need to create object of Thread class and pass the Runnable interface object as a parameter to the constructor.
##### Thread Lifecycle
- **NEW** : When a thread is created, it is in the new state. // constructor()
- **RUNNABLE** : When a thread is started, it is in the runnable state. // start(), it can be running as well.
- **BLOCKED/WAITING**: When a thread is blocked, it is in the blocked state. // wait()
- **TERMINATED** : When a thread is terminated, it is in the terminated state. // join()
##### Thread Class vs Runnable Interface
- When A class already extending any parent class we cant extend Thread class. due to multiple inheritance. So, in that we can make use of Runnable Interface.
- ```class MyThread extends ParentClass implements Runnable```
- When a class not extending any parent class we can extend Thread class.
##### Thread Methods
- **Start**
  - A thread can be started using the start() method.
  - The start() method will execute the run() method of the thread.
- **Stop**
  - A thread can be stopped using the stop() method.
- **Run**
  - A thread can be run using the run() method.
  - The run() method will execute the run() method of the thread.
- **Join**
  - A thread can be joined using the join() method. // main thread will wait for this thread to finish
- **Sleep**
  - A thread can be put to sleep using the sleep(miliseconds) method.
- **Priority** - hint
  - The priority of a thread is a value between 1 and 10.
    - MIN_PRIORITY = 1, NORM_PRIORITY = 5, MAX_PRIORITY = 10
  - The default priority of a thread is NORM_PRIORITY.
  - This doesnt guarantee the order of execution of threads.
  - The priority of a thread can be set using the setPriority() method.
  - The priority of a thread can be obtained using the getPriority() method.
- **Name**
  - The name of a thread can be set using the setName() method. or can be set using the constructor.
  - The name of a thread can be obtained using the getName() method.
- **State**
  - The state of a thread can be obtained using the getState() method.
- **Interrupted**
  - A thread can be interrupted using the interrupt() method.
- **Yield** - hint
  - A thread can be yielded using the yield() method.
  - The yield() method will give up the CPU to another thread.
- **Daemon**
  - A thread can be set as a daemon using the setDaemon() method.
  - A daemon thread is a thread that will be terminated when the main thread terminates.
  - By default, threads are not daemons. those are user threads.
#### Synchronization
- The Problem
  - Multiple threads can access a shared resource at the same time.
  - The shared resource can be modified by multiple threads at the same time, causing a race condition or deadlock.
  - may be due to fast context switching, this may cause the shared resource to be modified by multiple threads at the same time.
- The Solution
  - To prevent, we need to use synchronization. ie. synchronized keyword or synchronized block.
#### ReentrantLock
- A ReentrantLock is a class that implements the Lock interface.
- It is a class that implements the ReentrantLock interface.
- It also has a tryLock, tryLock(long time, TimeUnit unit), lock, unlock, isLocked, hasQueuedThreads, hasQueuedThread(Thread thread) and etc methods.
- It is useful when we need to lock a resource for a specific amount of time and release it when we are done with it.
- tryLock() method will try to acquire the lock and return true if it is acquired and false if it is not acquired.
- tryLock(long time, TimeUnit unit) method will try to acquire the lock for a specific amount of time and return true if it is acquired and false if it is not acquired.
- so, if want to wait for a specific amount of time, we can use tryLock(long time, TimeUnit unit) method and move on if it is not acquired. so it will not wait indefinitely.
- This scenario will come in when we are doing some DB operation and it is taking a long time to complete and we cant wait indefinitely.
- so, we can use tryLock(long time, TimeUnit unit) method and move on if it is not acquired. so it will not wait indefinitely.
- ReentrantLock(true) is a fair lock and ReentrantLock(false) is a non-fair lock. It will be non-fair by default.
#### ReadWriteLock
- A ReadWriteLock is a class that implements the Lock interface.
- This will help us for read access with multiple threads when there is no write access with any other thread.
- If already any thread is having write access then other threads will wait for that thread to finish.
- This will provide the ```readLock() and writeLock()``` methods.
#### DeadLock
<!-- /Users/vishal/Documents/professional/learning/_java/Multithreading/Locks/DeadLock.java -->
- DeadLock: Two threads are trying to access the same resource at the same time.
- To avoid this, we need to use synchronization.
- If we use synchronized block, then it will prevent the deadlock.
- In DeadLock.java, we have two threads, one is trying to write with pen and the other is trying to write with paper.
- Then, we have two threads, one is trying to write with pen and the other is trying to write with paper.
- But, when we use synchronized block, then it will prevent the deadlock.