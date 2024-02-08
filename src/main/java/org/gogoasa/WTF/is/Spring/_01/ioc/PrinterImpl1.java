package org.gogoasa.WTF.is.Spring._01.ioc;

public class PrinterImpl1 implements Printer {

    /**
     * This is the implementation of the print method. This just outputs the message as is to the console.
     */
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
