package org.gogoasa.WTF.is.Spring._01.ioc;

public interface Printer {
    /**
     * We know that all the classes that implement this interface will have a print method.
     * We don't know what the implementation of the print method will be, and we don't care.
     */
    void print(String message);
}
