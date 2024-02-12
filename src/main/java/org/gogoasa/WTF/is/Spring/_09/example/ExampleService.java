package org.gogoasa.WTF.is.Spring._09.example;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class ExampleService {
    private ExampleRepository exampleRepository;

    public Boolean executeService() {
        if (exampleRepository.count() > 0) {
            return true;
        } else if (exampleRepository.count() == 0) {
            return exampleRepository.findById(1L).stream().findAny().isPresent();
        } else {
            return !exampleRepository.findAllByTypeAndId("type", 1L).isEmpty();
        }
    }
}
