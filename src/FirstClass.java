public class FirstClass {
    public static void main(String[] args){
        func1(7,8);
        FirstClass aat1=new FirstClass();
        aat1.func2(5,6);
    }
    public static void func1(int a,int b){
        if(a>b){
            System.out.println("A is greater than b");
        }
        else{
            System.out.println("B is greater than A");
        }
    }
    public void func2(int a,int b){
        System.out.println(a+b);
    }
}
