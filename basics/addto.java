import java.util.Scanner;

public class addto {
  public static void main (String[]args){
    System.out.println("Hello This is a program to add two numners");
  /*  // here is the main code
    int a = 5;
    int b = 6;
    int sum = (a+b);
    System.out.println(sum);*/

  // For user input
 Scanner sc  = new Scanner(System.in);
System.out.println("Enter you numer: ");
  int a = sc.nextInt();
  System.out.println("enter number: ");
  int b = sc.nextInt();
  int sum = a+b;
  System.out.println(sum);
 }
}
