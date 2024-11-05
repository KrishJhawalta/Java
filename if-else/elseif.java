import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age>50){
            System.out.println("You have experienced half life great");
        }else if (age > 60){
            System.out.println("Youre great, You have experienced a lot ");
        } else if(age <18){
            System.out.println("Oh youre under teenager life");

        }else if(age > 18){
            System.out.println("Your're about to experience a lot");
        } else if(age > 80){
            System.out.println("Youre a knowledgeful person");
        }else {
            System.out.println("Person doesn't exists you are  a program");
        }

    }
}