package practiceset;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exloops {
    public static void main(String[] args) {
        System.out.println("This is a excerise: ");

        //q2 write a program to check student is pass of not at least 33% required
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your marks in sub1: ");
//        int a = sc.nextInt();
//        System.out.print("Enter your marks in sub2: ");
//        int b = sc.nextInt();
//        System.out.print("Enter your marks in sub3: ");
//        int c = sc.nextInt();

        //q1
        // int a = 10;
        //if(a=11){sout("Iam 11")}else{sout("iam not 11")}
//        // now calculations for this
//        int calcu = (a+b+c)/3;
//        if(calcu>=33 && a>=33 && b>=33 && c>=33){
//            System.out.println("Congrats you are pass");
//        }else{
//            System.out.println("Fuck!! Man your'e fail");
//        }

//        //q3 calcuate income tax by an eomployee to the govt as per..
//        System.out.print("Enter your in lakh decimal: ");
//        float t1 = sc.nextFloat();
//        if (t1 > 2.5 && t1 < 5.0) {
//            float tax1 = t1 - 0.05f;
//            System.out.println(tax1);
//
//        }
        // this is  a program to find out the number on day
//        int day = sc.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("monday");break;
//            case 2:
//                System.out.println("tuesday");break;
//                case 3:
//                    System.out.println("wednesday");break;
//                    case 4:
//                        System.out.println("thursday");break;
//                        case 5:
//                            System.out.println("friday");break;
//                            case 6:
//                                System.out.println("saturday");break;
//                                case 7:
//                                    System.out.println("sunday");break;
//        }
//        int a = sc.nextInt();
//        if(a%4==0){
//            System.out.println("This is a leap year");
//        }else{
//            System.out.println("This is not a leap year");
//        }
        System.out.print("Enter your website name: ");
        String website = sc.nextLine();
        if(website.endsWith(".com")){
            System.out.println("This is a commercial website");

        }if(website.endsWith(".org")){
            System.out.println("This is a organization website");
        }if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }



    }
    }

