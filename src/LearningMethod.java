public class LearningMethod {
    public static void main(String[] d){
        System.out.println("learning java");
        LearningMethod obj1=new LearningMethod();
        obj1.func(5,6);
        func2(7,8);
    }
    public void func(int a, int b){
//        int c=a+b;
        System.out.println(a+b);
        String str=func3();
        System.out.println(str);
        LearningClass obj2=new LearningClass();
        obj2.func();
        LearningClass.func2(5);
        func2(6,7);
    }
    public static void func2(int a, int b){
//        int c=a+b;
        System.out.println(a+b);
        LearningClass obj2=new LearningClass();
        obj2.func();
        LearningClass.func2(5);

    }
    public String func3(){
        return "aatif";
    }
}
