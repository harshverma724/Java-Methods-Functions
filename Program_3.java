import java.util.*;

public class Main {

    public static void n_No_Sum() {
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total no. of digits here: ");
        int b = sc.nextInt();

        for (int i = 1; i <= b; i++) {
            System.out.println("Enter no " + i + " here: ");
            int num = sc.nextInt();
            sum = sum + num;
        }
        System.out.println("Sum of " +b + " digits is: " + sum);
        sc.close();


    }

    public static void n_No_Product() {
        int product = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total no. of digits here: ");
        int b = sc.nextInt();

        for (int i = 1; i <= b; i++) {
            System.out.println("Enter no " + i + " here: ");
            int num = sc.nextInt();
            product = product * num;

        }
        System.out.println("Sum of " + b + " digits is: " + product);
        sc.close();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = "y";
        String pass;
        while (ch.equals("y")) {
            System.out.print("Press 1 for Sum.\nPress 2 for Product.\nEnter your choice here: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                n_No_Sum();
            } else if (choice == 2) {
                n_No_Product();
            } else {
                System.out.println("Invalid Choice.");
            }
            System.out.print("Do you want to repeat ? yes or no : ");
            ch = sc.next();
            
            System.out.println("You chose exit");
        }sc.close();
        

    }
}
