import java.util.Scanner;

public class Stringss {

    public static void main(String[] args) {
        //String name = "apple";
        //System.out.println(name);
        Scanner sc = new Scanner(System.in);
        /*  int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is: " + sum);*/
        String name = "KrisH ";
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
System.out.println(name.length());

// here we know that we use the trim string
String Name = " Sh adow ";
System.out.println(Name.trim());
// here for substring methods
String krish = "programmer";
System.out.println(krish.substring(0,10));

// here for replacing the name of string
String replace = "kitty";
System.out.println(replace.replace('t', 'h'));

// now for checking name starts with
System.out.println(replace.startsWith("ki"));
System.out.println(replace.endsWith("ty"));
System.out.println(replace.charAt(4));


// for escaping character
System.out.println("Hello\b this is a escaping sequence\"");


}
}
