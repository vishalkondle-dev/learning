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