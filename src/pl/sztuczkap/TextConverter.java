package pl.sztuczkap;

import java.util.Locale;

@FunctionalInterface
public interface TextConverter {

    String convert(String text);

    default void displayText(){
        System.out.println("Hello from Functional Interface");
    }

    static String convertToLowerCase(String text){
        return text.toLowerCase();
    }

}
