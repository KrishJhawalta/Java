import java.util.Scanner;

public class subject {
    public static void main (String[]args){
        System.out.println("Calculation of subjetcs");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers of sub 1: ");
        int a = sc.nextInt();
        System.out.print("enter number of sub 2: ");
        int b = sc.nextInt();
        System.out.print("number for su 3: ");
        int c = sc.nextInt();
    int cgpa = (a+b+c)/3;
    System.out.println("The cgpa is "+cgpa);


    }

    
}