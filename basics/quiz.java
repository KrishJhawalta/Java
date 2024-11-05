import java.util.Scanner;
public class quiz {
  public static void main(String[] args) {
    System.out.println("This is a program to write expression in java");
    // x-y\2. b^2-4ac/2a, v2-u2, a*b-d 
Scanner sc = new Scanner(System.in);
/*System.out.println("enter x: ");
int a = sc.nextInt();
System.out.println("enter y");
int b = sc.nextInt();
int cal = a-b/2;
System.out.println("The value is: "+cal);
if(cal <= 0){
  System.out.println("The number is negative");
}*/

System.out.println("enter value of b: ");
int b = sc.nextInt();
System.out.println("Enter value of a: ");
int a = sc.nextInt();
System.out.println("Enter value of c: ");
int c = sc.nextInt(); 
int cal = (b*b-4*a*c);
System.out.println("The value is: "+cal/2*a);


  }
}
