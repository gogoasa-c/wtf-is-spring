# 0x0A: How to log things properly

Just as a quick refresher, in case you forgot, the log levels are the following:
- `TRACE`: the lowest level, used for the most detailed logs
- `DEBUG`: used for more detailed logs, such as the values of variables, etc.
- `INFO`: used for logs that are relevant to the user, such as the start of a method, etc.
- `WARN`: used for logs that indicate something might be wrong, but the application can still function
- `ERROR`: used for logs that indicate something is wrong, and the application might not be able to function properly
- `FATAL`: used for logs that indicate something is wrong, and the application cannot function properly

Now, let's get to the actual logging part.

Using Lombok (the recommended thing to do IMO), it's as simple as using a good old
annotation: @Slf4j. This annotation is used to generate a logger field in the class
where it's used, and it's used to log things. It's as simple as that.

Now you may be wondering: "What are all those letters?" and I get the confusion.
But get this: Slf4j stands for "Simple Logging Facade for Java". It's a simple facade
for various logging APIs, such as Log4j, Logback, and JDK logging, but we needn't
worry about such details.

Now, to go on to the example in the `example` package, you can see that the `LoggingClass`
has a very complicated method, that does plenty of logs.

To be fair, you've seen it all when it comes the basic logging setup, all the methods
according to each of the log levels are there, so you may go ahead and just use that.