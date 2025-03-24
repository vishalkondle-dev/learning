# Spring Boot

### Eclipse Shortcuts

**Text Manipulation**
| **Action** | **Shortcut** |
|------------|-------------|
| Convert to Upper Case | `Ctrl + Shift + X` |
| Convert to Lower Case | `Ctrl + Shift + Y` |
| Move lines up or down | `Alt + Up` / `Alt + Down` |
| Auto format code | `Ctrl + Shift + F` |
| Optimize imports | `Ctrl + Shift + O` |

**Code Snippets & Auto-Completion**
| **Action** | **Shortcut** |
|------------|-------------|
| System.out.println(); | Type `"sysout"`, then `Ctrl + Space` |
| Main method | Type `"main"`, then `Ctrl + Space` |
| For loop | Type `"for"`, then `Ctrl + Space` |
| For-each loop | Type `"foreach"`, then `Ctrl + Space` |
| While loop | Type `"while"`, then `Ctrl + Space` |
| Do-while loop | Type `"do"`, then `Ctrl + Space` |
| If statement | Type `"if"`, then `Ctrl + Space` |
| Surround code with various structures | Select code, then `Alt + Shift + Z` |

**Generate Code Automatically**
| **Action** | **Shortcut** |
|------------|-------------|
| Generate Getters and Setters | Right Click > Source > Generate Getters and Setters |
| Shortcut for Getters and Setters | `Alt + Shift + S`, then `R` |
| Generate Constructor using Fields | Right Click > Source > Generate Constructors |
| Shortcut for Constructor using Fields | `Alt + Shift + S`, then `O` |

**Commenting Code**
| **Action** | **Shortcut** |
|------------|-------------|
| Comment/uncomment a line | `Ctrl + /` |
| Multi-line block comment | `Ctrl + Shift + /` |

**Refactoring & Navigation**
| **Action** | **Shortcut** |
|------------|-------------|
| Rename variable, method, or class | `Alt + Shift + R` |
| Jump to a specific line | `Ctrl + L` |
| View class outline | `Ctrl + O` |
| Extract method | `Alt + Shift + M` |
| Delete line | `Ctrl + D` |
| View call hierarchy | `Ctrl + Alt + H` |
| View class hierarchy | `F4` |
| Jump to beginning/end of `{}`, `()`, `[]` | `Ctrl + Shift + P` |
| Increase or decrease font size | `Ctrl + "+"` or `Ctrl + "-"` |
| Jump to method implementation | `F3` or `Ctrl + Click` |
| Jump to variable declaration | `F3` or `Ctrl + Click` |
| Open a resource | `Ctrl + Shift + R` |
| Change file tabs | `Ctrl + PageUp`, `Ctrl + PageDown` |

**Navigation History**
| **Action** | **Shortcut** |
|------------|-------------|
| Jump backward in history | `Alt + Left Arrow` |
| Jump forward in history | `Alt + Right Arrow` |
| Mouse shortcut for navigation | Use the Back/Forward Mouse Buttons |

**Running & Viewing Code**
| **Action** | **Shortcut** |
|------------|-------------|
| Run the program | `Ctrl + F11` |
| View all keyboard shortcuts | `Ctrl + Shift + L` |

### What is Spring Boot ?\*\*

1. Java Framework : Spring boot is an open-source framework built on top of Java, making it easier to develop Java applications.
2. Faster Development : It makes development faster by reducing configuration and boilderplate code.
3. Stand-alone Applications : Spring Boot applications can run on their own without a external web server.
4. Embedded Servers: It often embeds servers like Tomcat or Jetty within the application itself.
5. Autoconfiguration : Spring Boot automatically configures many aspects based on the libraries you include.
6. Minimal Configurations : This allows developers to focus on business logic instead of complex configurations.
7. No XML Configuration : It eliminates the need for XML configuration files.
8. Production-ready Features : Spring Boot offers built-in features for health checks, metrics, and externalized configuration for production use.
9. Microservices : Spring Boot is a popular tool for building microservices, which are small, independent services that work together.
10. Security : Authentication, Authorization etc.

### Spring boot application without intializer

1. Create a maven project
2. Add spring-boot-starter-web dependency in pom.xml
   ```xml
   <parent>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-parent</artifactId>
       <version>3.4.4</version>
   </parent>
   <dependencies>
   <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-web</artifactId>
   </dependency>
   </dependencies>
   ```
3. Create a main class

   ```java
   package dev.vishalkondle;

   import org.springframework.boot.SpringApplication;
   import org.springframework.boot.autoconfigure.SpringBootApplication;

   @SpringBootApplication
   public class SpringBootWithoutIntializerApplication {
       public static void main(String[] args) {
           SpringApplication.run(SpringBootWithoutIntializerApplication.class, args);
       }
   }
   ```

4. Create a controller classes

   ```java
   package com.controllers;

   import org.springframework.web.bind.annotation.GetMapping;
   import org.springframework.web.bind.annotation.RestController;

   @RestController
   public class HelloController {
       @GetMapping("/hello")
       public String hello() {
           return "Hello World";
       }
   }
   ```

5. Run the application

### JAR vs Fat JAR

1. **JAR**

- A regular JAR contains only your compiled Java application code (.class files) along with metadata like MANIFEST.MF.
- Dependencies (external libraries) are not included inside the JAR.
- When running a regular JAR, you need to provide the required dependencies separately via the classpath.
- ```bash
  java -cp my-app.jar:lib/dependency1.jar:lib/dependency2.jar com.example.Main
  ```

2. **Fat JAR**

- A Fat JAR (also called an Uber JAR) contains both your compiled application code and all of its required dependencies inside a single JAR file.
- This makes it easier to deploy and run without needing external dependencies.
- Typically used in Spring Boot applications where all necessary libraries are bundled.
- ```bash
  java -jar my-fat-app.jar
  ```

| **Feature Regular**                       | **JAR** | **Fat JAR** |
| ----------------------------------------- | ------- | ----------- |
| Includes dependencies?                    | ❌ No   | ✅ Yes      |
| Requires external libraries?              | ✅ Yes  | ❌ No       |
| Suitable for microservices (Spring Boot)? | ❌ No   | ✅ Yes      |
| Deployment size                           | Smaller | Larger      |

- Right-click on the project and hover on `Run as` > `maven install || maven build`
