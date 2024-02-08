package org.gogoasa.WTF.is.Spring._01.di;

import org.gogoasa.WTF.is.Spring._01.ioc.PrinterImpl1;
import org.gogoasa.WTF.is.Spring._01.ioc.PrinterImpl2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This is a configuration class. It is used to define beans that will be used in the application.
 */
@Configuration
public class PersonalConfiguration {

    /**
     * This is a bean 🫘, it will return the same PrinterImpl1 object everywhere where you have a
     * Printer interface with @Autowired on it.
     */
    @Bean
    public PrinterImpl1 printerImpl1() {
        return new PrinterImpl1();
    }

    /**
     * This is another bean, it will return a new PrinterImpl2 object everywhere where you have a
     * Printer interface with @Autowired on it. So, as many PrinterImpl2 objects as you have @Autowired
     * Printer interfaces.
     */
    @Bean
    public PrinterImpl2 printerImpl2() {
        return new PrinterImpl2();
    }

}
