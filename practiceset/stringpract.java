package practiceset;

import java.util.Scanner;

public class stringpract {
    
public static void main(String[] args) {
    // q1 program to convert a string into lowercase

    String a = "Hello";
    System.out.println(a.toLowerCase());

    // q2 program to replace sapce with underscores 

    String ab = "Hello world ";
    System.out.println(ab.replace(' ', '_'));

    // q3 program to fill a letter template which looks like 
    // letter = "Dear <|name|>, Thanks a lot"
    //replace <|name|> with a string (some name)

    String letter = "Dear name, Thanks a lot"; 
    System.out.println(letter.replace("name","world"));

    // q4 program to detect double and triple spaces in a string
    // idk how to do and i have not cleared the issue


    // q5 program to print letter using esca;e sequemcers 
    String letter4  = "Hello zz";
    System.out.println(letter4);

    
}
}
