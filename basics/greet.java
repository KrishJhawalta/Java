import java.util.Scanner;
public class greet{
    public static void main(String[] args) {
        System.out.println("Hi, I'm napbap");
        System.out.print("Whats's your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Nice to meet you! "+ name);
    }
}