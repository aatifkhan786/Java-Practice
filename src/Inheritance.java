import java.util.Scanner;
public class Inheritance extends C {
    public static void main(String[] args) {
//        B obj=new B();
//        C obj2=new C();
//        obj.func1();
//        obj.func2();
//        obj2.func3();
//        obj.func2();
        Inheritance obj = new Inheritance();
        obj.func4();

    }


    public  void func4() {
       func1();
       func2();
       func3();
    }
}
class A {
    int a, b;

    public void func1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        a = sc.nextInt();
        b = sc.nextInt();
    }
}

class B extends A {
    int c;
    public void func2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter another integer:");
        c = sc.nextInt();
        System.out.println("Sum: " + (a + b + c));
    }
}
class C extends B{
    int d;
    public void func3(){
//        System.out.println(b);
        Scanner sc = new Scanner(System.in);
        System.out.println("Multiple Inheritance: Enter another integer:");
        d = sc.nextInt();
        System.out.println("Sum: " + (a + b + c+ d));
    }
}