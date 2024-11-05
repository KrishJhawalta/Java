import java.util.Scanner;

/**
 * ifelse
 */
public class ifelse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 /*       System.out.println("Enter your age");
          int age = sc.nextInt();
          if(age > 18){
            System.out.println("Youre able to drive");

          }
          else{
            System.out.println("No wait for your turn");
          } */
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age >=8) {
            System.out.println(" CONGRATS, You are able to drive ");
        }
        else {
            System.out.println(" HEY! BUDDY Don't worry, Just wait few years");
        }






    }
}