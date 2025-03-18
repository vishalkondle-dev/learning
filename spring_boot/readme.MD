# Java Spring Boot
## Spring Boot
- It is a framework for building applications in the Java Programming Language.
- It makes it easy to create stand-alone, production-grade Spring based Applications that you can just run.
- The core Spring framework already reduces boilerplate code and provides a lot of helpful features for Java applications.
- However, Spring Boot takes this convenience to the next level by focusing specifically on reducing the effort required to set up and configure a Spring application.
- Auto-Configuration
- Standalone Applications
## Spring Initializer
[Spring Initializer](https://start.spring.io/)
- Spring Initializer is a tool that helps you create a Spring Boot application.
- It provides a quick way to get started with a Spring Boot application.
  - **Project** : Maven
  - **Language** : Java
  - **Spring Boot Version** : 2.7.15
  - **Group** : net.company_name
  - **Artifact** : project_name
  - **Name**: project_name
  - **Description**: description
  - **Package**: net.groupname.project_name
  - **Packaging** : Jar
    - Jar - Simple
    - War - need to deploy on external web server
  - **Java Version** : 8
  - **Dependencies** : Spring Web
## Maven
[Maven Repository](https://mvnrepository.com)
- Maven is a build and dependency management tool.
- Intellij IDEA has a Maven plugin that can be used to run Maven commands. (Right Sidebar)
- Dependencies are added to the pom.xml file.
- ```mvn validate``` : validate the project
- ```mvn compile``` : compile the project
- ```mvn test``` : run the tests
- ```mvn package``` : package the project (creates a jar file)
- ```mvn verify``` : verify the project
- ```mvn install``` : install the project
- ```mvn deploy``` : deploy the project
- ```mvn clean``` : clean the project (removes the target directory)
## IOC
- Application Context : one of the way to achieve Inversion of Control.
- Inversion of Control : 
  - The container creates the objects and wires them together, it is present in the Spring Framework.
  - It will hold the classes which have been annotated with the ```@Component``` annotation.
  - Every object ie. stored in the container is called a **Spring Bean**.
  - It is a collection of objects that are managed by the Spring Framework.
## @SpringBootApplication
- It is used to mark the **main class** (main method) of a Spring Boot application.
- It is a combination of ```@Configuration``` and ```@EnableAutoConfiguration``` and ```@ComponentScan```.
- ```@Configuration``` : It is used to define beans in a Spring Boot application.
- ```@EnableAutoConfiguration``` : It is used to enable auto-configuration for a Spring Boot application.
- ```@ComponentScan``` : It is used to scan for components in a Spring Boot application.
- ```@Bean``` : It is used to define a bean in a Spring Boot application.
- ```@Component``` : It is used to define a component in a Spring Boot application.
### Database Mappings
- **ORM (Object Relational Mapping)** 
  - A technique used to map objects in a programming language to tables in a database.
  - It allows developers to work with database using object oriented programming concepts, making it easier to interact with relational database.
  - Consider a java class User and a database table users. ORM frameworks like Hibernate can map the fields of the java class to the columns in the users table. making it easier to insert, update, retrieve and delete records.
- **JPA (Java Persistence API)**
  - A way to achieve ORM, includes interfaces and annotations that you use in your Java, Classes, requires a persistence provider (ORM tools) for implementation.
  - To use JPA, you need a persistence provider. A persistence provider is a specific implementation of the JPA specification. Examples of JPA persistence providers include Hibernate, EclipseLink, and OpenJPA. These providers implement the JPA interfaces and provide the underlying functionality to interact with databases.
  - **Spring Data JPA** is built on top of the JPA specification, but it is not a JPA implementation itself. Instead, it simplifies working with JPA by providing higher-level abstractions and utilities. However, to use Spring Data JPA effictively, you still need a JPA implementation, such as Hibernate, EclipseLink or another JPA-compliant provider, to handle the actual database interactions.
  - JPA is primarily designed for working with relational databases, where data is stored in tables with a predefined schema. MongoDB, on the other hand, is a NoSQL database that uses a different data model, typically based on collections of documents, which are schema-less or have flexible schemas. This funcdamental difference in data models and storage structures is why JPA is not used with MongoDB.
- **Spring Data MongoDB**
  - In the case of MongoDB, you dont have a traditional JPA peristence provider. MongoDB is a NoSQL database, and Spring Data MongoDB serves as the "persistence provider" for MongoDB. It provides the necessary abstractions and implementations to work with MongoDB in a Spring application.
  - Query Method DSL and Criteria API are two different ways to interact with a database when using Spring Data JPA for relational databases and Spring Data MongoDB for MongoDB databases.
  - Query method DSL is a simple and convenient way to create queries based on method naming conventions, while the Criteria API offers a more dynamic and programmatic approach for building complex and custom queries.
  - Spring Data JPA is a part of the Spring Framework that simplifies data access in Java applications, while Spring Data MongoDB provides similar functionality for MongoDB databases.