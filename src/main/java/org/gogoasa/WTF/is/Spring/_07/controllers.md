# 0x07: So, how do controllers work in Spring?

Controllers, as I mentioned earlier, are the classes that handle the incoming HTTP requests. 
They're the classes that contain the methods that handle the requests and return the responses.

And they're marked, as a lot of things in the Spring framework, with annotations. In this case,
the annotation that the class is marked with is `@RestController`. This tells Spring that this
class is a controller and that it should handle the incoming requests. 

One thing worth mentioning, is that the `@RestController` annotation is a combination of the `@Controller`
and `@ResponseBody` annotations. The `@Controller` annotation tells Spring that this class is a controller,
and the `@ResponseBody` annotation tells Spring that the methods in this class should return the response
body directly, instead of a view name.


Now, then, to give you an example, you can have a look in the `example` package in this directory,
you can find an `ExampleController` class. This class is an example of what a controller looks like 
in Spring. 

It can be quite overwhelming at first with all the annotations and the different methods, and objects,
but fret not for this not as complicated as it seems at first.

Let's split this class into smaller parts and see what each part does.

If we have a look at the class annotations first, we can see that the class is marked with the 
`@RestController` and `@RequestMapping` annotations. We have talked about the `@RestController` annotation
already, so let's talk about the `@RequestMapping` annotation.

The `@RequestMapping` annotation is used to map the HTTP requests to the methods in the controller.
In this case, I have used it to give the base URL for the requests that this controller will handle.

Furthermore, the endpoints themselves are marked with the `@GetMapping` and `@PostMapping`. This
will let Spring know that these methods should handle the GET and POST requests, respectively, and
the URLs are specified as arguments. Of course, we have other annotations for other HTTP methods as well,
such as `@PutMapping`, `@DeleteMapping`, and `@PatchMapping`, and even `@RequestMapping` if you want to
use a different method than the ones mentioned.

You can also see that some endpoints have part of the path specified as a variable. This is a common
thing to do in RESTful APIs, and Spring has a way to handle this as well. To get the values from the
path, we use the `@PathVariable` annotation. 

On top of that we have the `@PathVariable` and `@RequestBody` annotations. These are used to get the
path variables and the request body from the requests, respectively. 

Finally, you can also notice we return a `ResponseEntity` object from the methods. This is a class that
Spring provides to handle the responses. It's a good way to handle the responses because it gives you
a lot of control over the response, such as the status code, the headers, and the body.

So, to sum up:
- `@RestController`: This annotation tells Spring that this class is a controller and that it should 
handle the incoming requests;
- `@RequestMapping`: This annotation is used to map the HTTP requests to the methods in the controller;
- `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`, `@PatchMapping`: These annotations
are used to specify the HTTP method that the method should handle;
- `@PathVariable`: This annotation is used to get the path variables from the requests;
- `@RequestBody`: This annotation is used to get the request body from the requests;
- `ResponseEntity`: This class is used to handle the responses.
- `@ResponseBody`: This annotation tells Spring that the methods in this class should return the response
body directly, instead of a view name.