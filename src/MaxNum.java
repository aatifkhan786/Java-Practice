import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println("First greatest number is a, second is b, third is c");
            } else {
                System.out.println("First greatest number is a, second is c, third is b");
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println("First greatest number is b, second is a, third is c");
            } else {
                System.out.println("First greatest number is b, second is c, third is a");
            }
        } else {
            if (a >= b) {
                System.out.println("First greatest number is c, second is a, third is b");
            } else {
                System.out.println("First greatest number is c, second is b, third is a");
            }
        }

        sc.close();
    }
}
