public class MethodCallStack{

    public static void main(String[] args){
        System.out.println("Called before executing method1");
        method1();
        System.out.println("Called before executing method1");

    }
    public static void method1(){
        System.out.println("Called before executing method2 from method1 ");
        method2();
        System.out.println("Called after executing method2 from method1 ");
    }
        public static void method2(){
        System.out.println("Called before executing method3 from method3 ");
        method3();
        System.out.println("Called after executing method2 from method2 ");
        }
        public static void method3(){
            System.out.println("Executing method3 from method2");
        }      

}