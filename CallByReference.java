public class CallByReference{
    public static void main(String[] args){

    int primitiveValue=100;
    int[] intArray=new int[10];
    callByValue(primitiveValue);
    System.out.println("The value of primitiveValue after execution:"+primitiveValue);
    callByRefernce(intArray);
    System.out.println("The value of array element after execution:"+intArray[0]);
    }

    public static void callByValue(int value){
        value=value-1;
    }


        public static void callByRefernce(int[] intArray){
            System.out.println("Within callByReference method the value of array is before execution"+intArray[0]);
            intArray[0]=15;
            System.out.println("Within callByReference method the value of array is after execution"+intArray[0]);

        
    }


}