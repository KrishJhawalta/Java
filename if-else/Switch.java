import java.util.Scanner;

public class Switch
{
    public static void main(String[] args) {
        System.out.println("Switch Statment");
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("brother your'e under age only 1 year left");
                break;
            case 20:
                System.out.println("yeahee you'e able to drive enjoy just take the peoples down in road xd");
                break;
            case 12:
                System.out.println("Youre a kid don't worry just grew and study");
            default:
                System.out.println("Enjoy your life");
        }
    }
}
