import java.util.Scanner;

/**
 * strings
 */
public class strings {
    public static void main(String[] args) {
        String name1 = new String("krish");
        String name = "krish";
        System.out.print("the man is ");
        System.out.println(name);

int a = 6;
float b = 3.54f;
        System.out.printf("the value of %d and the value of %f",a,b);

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        System.out.print("enter your name: ");
        String name2 = sc.nextLine();
        System.out.println(name2);
        


    }
    
}
