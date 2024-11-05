import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        System.out.println("Converter for kilometer for miles");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kilometers:");
        int a  = sc.nextInt();
        System.out.println("The value is: "+a*0.621);
    }
    
    
}
