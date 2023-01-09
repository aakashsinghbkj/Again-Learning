import java.util.Scanner;

public class Multiply {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number");
        int a = sc.nextInt();
        System.out.println("Enetr the secod number");
        int b = sc.nextInt();

        int c = a*b;
        System.out.println("Multiplication of your numbers are " + c);
    }
}
