import java.util.*;

public class Main{

    public static void printMyName(){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);
        return;
    }

    public static void main (String[] args){
        //calling the function.
        printMyName();
    }
}