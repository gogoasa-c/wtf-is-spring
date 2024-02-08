# 0x01: Basics

## What's Spring built on?

Spring is built on two main concepts: **Inversion of Control** and **Dependency Injection**.

### Inversion of Control (IoC)

Inversion of Control is a design principle in which the control of objects 
or portions of a program is transferred to a container or framework. 
It's a way of designing software that makes it easy to change the behavior 
of the application without changing the code.

So, in short: you only need to know what the interface will look like,
and the implementation will be handled by the framework.

You've probably seen it before, but an example of IoC can be found in the
`/ioc` directory.

In Spring, this is usually handled through the `@Autowired` annotation.
We'll make sure to get back to that later.

### Dependency Injection (DI)

Dependency Injection is a technique in which an object receives other objects
that it depends on. These objects are called dependencies.

In Spring, the objects are given their dependencies at runtime,
which makes it easy to change the dependencies without changing the code.

Leaving the more technical explanations aside, in Spring, DI is handled through
the concept of **beans**.

I hear you asking now: *What's a bean?*

Well I'm glad you asked! Beans are the core of the Spring framework, and it's
the way that Spring decides what implementation to inject into what interface
at runtime, through our favourite annotation: `@Autowired`.

The beans are defined inside special classes annotated with `@Configuration`,
as methods returning objects, a bean *probably* cannot be void, but you can
try that out on your own, since experiments fall outside the scope.

The methods defining beans themselves are annotated with the `@Bean` annotation
so that Spring may be aware of them and inject them wherever the need for them arises.

There's one more important thing about **beans**, that being their scope.
The two scopes you'll be seeing around for beans in Spring are:

- prototype;
- singleton.

The latter is by far the most popular one (and the default), but we must 
know them since we'll surely be using them both.

The beans defined will also have a scope attached, by default that being
**singleton**. What that means is: every time it will inject this implementation
somewhere, it'll be using the *same* object. 

A shared instance, everywhere. Mind-blowing, I know.

This is super useful for stuff like repository objects, no point in having
20 different instances of the same object that communicates with the 
database, right?

You can explicitly select the scope through the `@Scope` annotation. This
receives a parameter, being a string specifying the scope. 

So, in case you want a new object for every place where the bean is injected
you can simply annotate the bean with `@Scope("prototype")` which will
give you as many objects as autowired annotations in your code.

Pretty straightforward, right?

Let's check out some code examples after delving into the anatomy of beans.
You'll find the examples under the `/di` directory.
