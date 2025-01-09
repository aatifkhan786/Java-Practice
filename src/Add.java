//import java.util.Scanner; // Import Scanner class for input
//
//public class Add {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); // Initialize Scanner
//        System.out.println("Enter first number: ");
//        int a = sc.nextInt(); // Read first number
//        System.out.println("Enter second number: ");
//        int b = sc.nextInt(); // Read second number
//
//         // Create an object of the Add class
//        func1(a, b); // Call the method and pass the arguments
//
//        sc.close(); // Close Scanner
//    }
//
//    public static void func1(int a, int b) { // Non-static method with arguments
//        int sum = a + b; // Calculate sum
//        System.out.println("Addition= " + sum); // Print result
//    }
//}
//
////public class Adds {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in); // Initialize Scanner
////        System.out.println("Enter first number: ");
////        int a = sc.nextInt(); // Read first number
////        System.out.println("Enter second number: ");
////        int b = sc.nextInt(); // Read second number
////
////        func1(a, b); // Call the static method and pass the arguments
////
////        sc.close(); // Close Scanner
////    }
////
////    public static void func1(int a, int b) { // Static method with arguments
////        int sum = a + b; // Calculate sum
////        System.out.println("Addition= " + sum); // Print result
////    }
////}
import java.util.Scanner;

public class Add{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        Add obj2=new Add();
        obj2.func1(a,b);
        sc.close();
    }
    public void func1(int a,int b){
        int mul;
        mul=a*b;
        System.out.println("Area of rectangle: "+mul);
    }
}