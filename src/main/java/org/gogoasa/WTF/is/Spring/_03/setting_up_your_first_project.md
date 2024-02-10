# 0x03: How to actually set up your first project:

I present to you the **right way** to create a new Spring Boot project:

## Spring Intializr

Spring Initializr is a web-based tool that allows you to create a new Spring Boot project with ease.
You just go and select language (Java, Kotlin, Groovy), the version of Spring Boot you want to use, the
preferred build tool (Maven or Gradle), and the dependencies you want to include in your project.

And just like that, you click on the "Generate" button, and you get a `.zip` file with your project ready to go.

As a fun fact, IntelliJ IDEA has a built-in Spring Initializr that you can use to create a new project, 
so you don't have to go to the website every time you want to create a new project. You can just use that
(if it works for you, that is, in my case it didn't work) instead of going to the website.

## What's next?

Alright, so in your brand new Spring Boot project you'll have a `src/main/java` folder, and a `src/main/resources` 
folder, as well as a `pom.xml` file, where you'll be taking care of your dependencies.

Under your `src/main/java` folder, you'll have a `com.example.demo` package, and under that, you'll have a 
`DemoApplication.java` file. This is the starting point for the application in question and its' contents will look
something like this: 

```java
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
```

Beautiful, isn't it?

Now then, you won't be modifying much of anything around this class, so you can just leave it as it is.

Besides that, inside the `src/main/resources` folder, you'll have an `application.properties` file, where you can
configure your application as you see fit. But for right now, this is all you need to know about the structure of
a Spring Boot project.

But wait, I hear you say *"What dependencies do I need to add in?"*. Well, that's a good question, and I'm glad
you asked. But we'll get to that in the next chapter.