import java.util.*;

public class Main {

    public static void n_No_Sum(int a) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= a; i++) {
            System.out.println("Enter no " + i + " here: ");
            int num = sc.nextInt();
            sum = sum + num;
        }
        System.out.println("Sum of " + a + " digits is: " + sum);


    }

    public static void n_No_Product(int a) {
        int product = 1;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= a; i++) {
            System.out.println("Enter no " + i + " here: ");
            int num = sc.nextInt();
            product = product * num;
        }
        System.out.println("Sum of " + a + " digits is: " + product);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 1;
        while (ch == 1) {
            System.out.print("Press 1 for Sum.\nPress 2 for Product.\nEnter your choice here: ");
            int choice = sc.nextInt();
            System.out.print("Enter total no. of digits here: ");
            int a = sc.nextInt();

            if (choice == 1) {
                n_No_Sum(a);
            } else if (choice == 2) {
                n_No_Product(a);
            } else {
                System.out.println("Invalid Choice.");
            }
            System.out.print("Do you want to repeat ? 1 for yes || 0 for no : ");
            ch = sc.nextInt();
        }
        

    }
}
