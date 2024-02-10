# 0x04: Dependencies you'll probably be needing:

This part of the guide has a short presentation of the dependencies you'll probably be needing in your 
Spring Boot project. Their names will be specified as the ones on Spring Initializr, and their descriptions
will be short and to the point, so you know what you'll be needing them for.

## Spring Web

This is the dependency you'll be needing if you want to create a web application. It's the one that
brings in the Spring MVC and the embedded Tomcat server, so you can start creating your web application
right away.

## Spring Security

This may be just **the** dependency you'll be needing if you want to secure your application. It's the one
that brings in all the necessary classes and interfaces to secure your application, and it's the one that
you'll be needing to create your own security configurations.

## Spring Data JPA

This is the fancy ORM of the Spring world. It's the one that brings in all the necessary classes and interfaces
to work with databases, and it's the one that you'll be needing to create your own repositories and entities.

As a side note, I don't exactly recommend using ORM's as I feel like they make it cumbersome to design
your database and your application, but if you're into that, then this is the dependency for you. Otherwise,
I recommend just doing your own old-fashioned SQL queries.

## Spring Data JDBC

This is for those of you who want to write your own `select`, `insert`, `update` and `delete` queries. Not 
a whole lot more to say about it.

## Lombok:

This isn't part of Spring by default, but it's a dependency that makes life 10 times easier. It allows you
to use plenty of annotations that make your life easier, and it's the one that you'll be needing to use
`@Data`, `@Builder`, `@NoArgsConstructor`, `@AllArgsConstructor` and `@Slf4j` annotations.

What is `@Slf4j` you wonder? Well, that's a perfect segway for the dependencies that aren't in Spring Initializr.

## Slf4j

Or, silent logging facade for Java, is the logging facade that will help plenty in your application. It's
practically just the standard that the logging implementations will be catering to, and provides easy access
to a `log` object in any class annotated with `@Slf4j`. 

You'll also need to pair this with an implementation dependency such as `Logback` or `Log4j2`, so make
sure to also include those in your `pom.xml` file.

## Jackson

This is the JSON library that you'll be needing to work with JSON objects. It's the one that you'll be needing
to convert your objects to JSON and vice-versa, and it's the one that you'll be needing to work with RESTful
services.