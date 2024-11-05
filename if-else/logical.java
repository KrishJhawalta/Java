import javax.crypto.spec.PSource;

public class logical {
    public static void main(String[] args) {
        System.out.println("This is a program for logical operators ");
        // for and operator "&&" (it means the condition should have true properly then it will becomes true otherwise not)
        boolean a = true;
        boolean b = true;
        if (a && b ==true){
            System.out.println("Yes it is true");

        }else {
            System.out.println("No its is not true ");
        }
    // for OR operator "||" (when one condition is true then the whole condition will becomes true)
        System.out.println("THis is for or operator");
        boolean j = true;
        boolean k = true;
        if(j || k){
            System.out.println("false");

        }else {
            System.out.println("True");
        }


    }
}

