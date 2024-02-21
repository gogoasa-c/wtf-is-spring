package org.gogoasa.WTF.is.Spring._10.example;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class LoggingClass {

    public void CustomVeryComplicatedMethod() {
        int systemResources = 0;
        log.info("System resources: " + systemResources);
        List<String> errorMessages = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            log.debug("System resources: " + systemResources);
            systemResources += i;
        }

        if (systemResources > 0) {
            log.trace("System resources are being used.");
        } else {
            errorMessages.add("System resources are not being used.");
        }

        log.error("Error messages: " + errorMessages);

        log.info("End of method.");
    }

}
