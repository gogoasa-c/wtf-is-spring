package org.gogoasa.WTF.is.Spring._01.ioc;

public class PrinterImpl2 implements Printer {
    /**
     * This is the implementation of the print method.
     * This outputs the message to the console, but each character is printed on a new line.
     */
    @Override
    public void print(String message) {
        char[] charArray = message.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }
    }
}
