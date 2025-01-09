public class LearningClass { //a java program will always need a class to run
    int x=23;
    static  String str="Aatif";

    public static void main(String[] args) { //method shld always be inside class
        System.out.println("Hello World");

        LearningClass obj1=new LearningClass(); //creating object
//        func()
        obj1.func();
        System.out.println("value of x " + obj1.x);
        func2(23);
        System.out.println(str);

    }

    public void func(){ //method 1 without static
    System.out.println("Inside the class");
    }

    public static void func2(int a){ //method 2 with static keyword
        System.out.println(a);
    }
}

//public void func(){
//    System.out.println("Outside the class");
//}
