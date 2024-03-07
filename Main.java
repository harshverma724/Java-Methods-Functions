import java.util.*;

public class Main{
    public static int product(int a, int b){
        int product = a*b;
        System.out.println("Sum of "+a+" and "+b+" is "+product);
        return product;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 here: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2 here: ");
        int b = sc.nextInt();

        //operation.
        product(a,b);
    }
}