package org.gogoasa.WTF.is.Spring._08.example;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * ExampleService
 * This will be our example for a service class.
 * We're marking it as a @Service so that Spring can pick it up and manage it.
 * We're also using Lombok's @Data annotation to generate getters, setters, equals, hashcode, and toString methods.
 * But we're basically using that just for constructor injection of beans.
 */
@Data
@Service
public class ExampleService {

    private Repository repository;

    /**
     * This method executes your really complicated business logic.
     * @return Boolean - the result of the really complicated business logic.
     */
    public Boolean executeService() {

        // do some stuff with that repository

        if (2 > 1) {
           return 1 < doSomeReallyComplicatedLogic();
        } else {
            return 2L > doSomeOtherSuperComplicatedLogic();
        }
    }

    private Long doSomeOtherSuperComplicatedLogic() {
        return 1L + 1L * 1L - 1L / 1L;
    }


    public Integer doSomeReallyComplicatedLogic() {
        return 1 + 1 * 1 - 1 / 1;
    }

}
