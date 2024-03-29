package org.gogoasa.WTF.is.Spring._01.di;

import org.gogoasa.WTF.is.Spring._01.ioc.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This is a service class. It is used to define the business logic of the application.
 * We'll get to annotations later, but for now, just know that this is a service class.
 * We also have Repository classes and Controller classes.
 */
@Service
public class PrintingService {

    /**
     * This is an example of using the @Autowired annotation to inject a dependency.
     * This is a field injection. This is a bad practice, because it makes the class hard to test.
     * We _should_ use constructor injection instead, but nobody really does that. Not that you shouldn't!
     */
    @Autowired
    Printer printer;

    public void execute() {
        printer.print("This is a message");
    }
}
