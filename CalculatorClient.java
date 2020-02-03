public class CalculatorClient{
    public static void main(String[] args){
       // data-type variable-name=new Data-Type();
       Calculator calculator=new Calculator();
       int a=8;
       int b=2;
       System.out.println("Addition=:"+calculator.add(a,b));
       System.out.println("Difference=:"+calculator.subtract(a,b));
       System.out.println("product=:"+calculator.product(a,b));
       System.out.println("division=:"+calculator.divide(a,b));
       System.out.println("modulo=:"+calculator.modulo(a,b));
       
    }
}