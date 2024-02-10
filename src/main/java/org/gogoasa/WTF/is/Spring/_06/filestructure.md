# 0x06: What does the file structure of a Spring project look like?

I know that this is a confusing topic for me whenever I start playing around with a new technology
or framework. I always find myself asking the same questions: *"Where do I put this? What about that?"*. 
And it's a bit of an issue since every project is different and there's no one-size-fits-all answer and the 
differences between conventions can be confusing at times and there's also a million different standards
for absolutely everything.

But I'm here to clear that up for you in your journey of learning Spring. I'll show you the most common
file structure for a Spring project and explain what each directory (package) is used for.


## The file structure:

Generally, the way I go about things is to think about the different layers of the application and how
they're separated. This is a good way to think about it because it's a good way to separate concerns and
keep things organized.

Most times, the file structure will look something like this:

```
src
├── main
│   ├── java
│   │   └── org
│   │       └── gogoasa
│   │           └── wtf
│   │               └── is
│   │                   └── spring
│   │                       ├── controller
│   │                       ├── model (sometimes also entity if I'm using JPA)
│   │                       ├── repository
│   │                       ├── service
│   │                       ├── data
│   │                       ├── security
│   │                       ├── dto 
│   │                       ├── exception
│   │                       ├── mapper
│   │                       └── util
│   └── resources
│       └── application.properties
└── test
    ├── java
    │   └── org
    │       └── gogoasa
    │           └── wtf
    │               └── is
    │                   └── spring
    │                       ├── controller
    │                      ...
    └── resources
```

This is a pretty standard file structure for a Spring project. It's a good way to separate the different
layers of the application and keep things organized.

Here's a brief explanation of what each directory is used for:

- `controller`: This is where you put your controllers. These are the classes that handle the incoming HTTP requests;
- `model`: This is where you put your model classes. These are the classes that represent the data in your application. 
Sometimes, you'll also see an `entity` package if you're using JPA;
- `repository`: This is where you put your repository classes. These are the classes that handle the database operations;
- `service`: This is where you put your service classes. These are the classes that contain the business logic of your 
application;
- `data`: This is where you put your data classes. These are the classes that represent the data in your application;
- `security`: This is where you put your security classes. These are the classes that handle the security of your 
application and can be configured for authentication and authorization;
- `dto`: This is where you put your DTO (Data Transfer Object) classes. These are the classes that represent the data 
that's being transferred between the client and the server, and will typically be different from the model classes and
contain less fields;
- `exception`: This is where you put your exception classes. These are the classes that represent the exceptions that
can be thrown by your application;
- `mapper`: This is where you put your mapper classes. These are the classes that map the data from one format to 
another;
- `util`: This is where you put your utility classes. These are the classes that contain the utility methods that are
used throughout your application.
- `resources`: This is where you put your resources. 
- `test`: This is where you put your test classes. These are the classes that contain the tests for your application.

This should pretty much be all that you need to actually start writing code for your Spring application. We'll
get into more details concerning what a controller class looks like, what a service class looks like, etc. in
the next sections.




