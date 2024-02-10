# 0x02: Goodbye Spring, hello Spring Boot!

Was the previous chapter hard to digest? I know it was for me initially, but don't worry.
We won't be touching that again. Spring on its own is complicated and cumbersome even at times, so 
let's get to the bread and butter:

## What's Spring Boot?

As previously stated, if Spring is the ingredients to your delicious cake, then Spring Boot is the
cake itself. What I mean by that is: Spring has a lot of modules, and I mean **a lot**. 

You have everything from Spring Core, to Spring Security, Spring Web MVC and countless others that
you'd otherwise have to go and add in manually to your `pom.xml` file *(or `gradle.build` for those of you
brave enough to go and use Gradle instead of Maven)*, but Spring Boot is here to come and ease that
for all of us by introducing:

## Spring Boot Starters

Spring Boot Starters are a set of convenient dependency descriptors that you can include in your application.
You get a one-stop-shop for all the Spring and related technology that you need, without having to hunt through
the internet to find the right dependencies. You just get them all in one place, and you're good to go.
Just have to add them in your `pom.xml` file as a parent to your project, and you're good to go.

They come and bring in all the dependencies you'd need to start your project, and you've always got the
flexibility to add in more dependencies as you see fit. 

### But wait, there's more!

The starters also remove the need to specify a version for the dependencies, since they already come with
a predefined version that's known to work with the rest of the dependencies in the starter. 

This is super useful, since you won't have to worry about compatibility issues between the dependencies
you're adding in, and you can focus on the actual development of your application.

This is really all you need to know to get going with your project right now, so we'll get more
into the nitty-gritty of Spring Boot in the next chapter, as in *code* and how to create a project
from scratch(-ish).