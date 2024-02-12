
# 0x08: Servicing in Spring

Services are, as previously mentioned, the classes that contain the business logic of your application. 
They serve as the middleman between the controllers and the repositories, and they're the ones that handle the
heavy lifting of the application most times, such as the data manipulation and the business rules.

Now that we got that out of the way let's see how we can create a service in Spring.

If you go and have a look in the `example` package in this directory, you can find an `ExampleService` class.
This class is an example of what a service looks like in Spring. It has some methods defining some really
overly complicated business logic of your choosing, is integrated with a repository (this can also be multiple
repositories, really as many as your heart desires) and is used in a controller.

The `@Service` annotation is used to mark the class as a service and the `@Data` annotation is used to generate
the getters, setters, and other methods for the class. It helps with the constructor injection of dependencies.

Really, there are no more super complicated annotations to add around here. So we can move on from this.
