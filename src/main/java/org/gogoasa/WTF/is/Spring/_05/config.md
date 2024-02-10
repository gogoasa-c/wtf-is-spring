# 0x05: How do I configure my application?

Good question, remember that `src/main/resources` folder? That's where you can put your configuration files. 
Spring Boot will automatically load any `application.properties` or `application.yml` file that you put there.

If you're wondering what one of these files might look like, here's an example of a `application.properties` file:

```properties
# Regular properties used by Spring Boot dependencies

spring.datasource.url=jdbc:mysql://127.0.0.1:3306/db_schema
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=create

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

spring.jackson.date-format=yyyy-MM-dd

# Custom properties used by your application

myapp.log.level=DEBUG
```

And here's an example of a `application.yml` file:

```yaml
# Regular properties used by Spring Boot dependencies

spring:
  datasource:
    url: jdbc:mysql://
    username: root
    password: root

    jpa:
        hibernate:
            ddl-auto: create
    
        show-sql: true
        properties:
            hibernate.format_sql: true

    jackson:
        date-format: yyyy-MM-dd

# Custom properties used by your application

myapp:
  log:
    level: DEBUG
```

And say, we want to use that property we defined there explicitly within our code (e.g. `myapp.log.level`), 
we can do so by using the `@Value` annotation:

```java
import org.springframework.beans.factory.annotation.Value;

public class MyService {

    @Value("${myapp.log.level}")
    private String logLevel;

    public void doSomething() {
        if ("DEBUG".equals(logLevel)) {
            // do something
        }
    }
}
```

I'd say that this is a sufficient introduction to using the application properties in Spring Boot, you'll
be getting more used to this as you create applications and as you use more and more properties for the
dependencies.