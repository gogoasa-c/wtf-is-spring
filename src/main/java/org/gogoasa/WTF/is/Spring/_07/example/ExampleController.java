package org.gogoasa.WTF.is.Spring._07.example;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/example")
public class ExampleController {

    /**
     * This method returns an example object
     *
     * @return Example - an example object
     */
    @GetMapping("/new")
    public ResponseEntity<Example> getExampleSuccessfully() {
        Example example = new Example();
        example.setName("Example");
        example.setDescription("This is an example");
        example.setId(1L);
        example.setType("Example");

        return ResponseEntity.ok(example);
    }


    /**
     * This method returns an error
     *
     * @return RuntimeException - an example error
     */
    @GetMapping("/error")
    public ResponseEntity<RuntimeException> getExampleWithError() {
        RuntimeException runtimeException = new RuntimeException("This is an example error");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(runtimeException);
    }


    /**
     * This method returns an example object with the given id as a path variable
     * @param id - the id of the example object
     * @return Example - an example object
     */
    @GetMapping("/{id}")
    public ResponseEntity<Example> getExampleWithId(@PathVariable Long id) {
        Example example = new Example();
        example.setName("Example");
        example.setDescription("This is an example");
        example.setId(id);
        example.setType("Example");

        return ResponseEntity.ok(example);
    }


    /**
     * This method changes the id of the example object sent in as a request body
     * @param id - the id of the example object
     * @param example - the example object
     * @return Example - an example object
     */
    @PostMapping("/{id}")
    public ResponseEntity<Example> updateExample(@PathVariable Long id,
                                                 @RequestBody Example example) {
        example.setId(id);

        return ResponseEntity.ok(example);
    }

}
