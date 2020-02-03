public class TwoDimensionalArray{
        static int rowCount=4;
        static int colCount=4;
        static int value=10;
        static int twoDimensionalArray[][]=new int[rowCount][colCount];

        static void populateArray()
        {
              for(int row=0; row < rowCount; row++){
            for (int col=0; col < colCount; col++){
                twoDimensionalArray[row][col]=value++;
            }
        }
        }

        static void displayArray()
        {
             for(int row=0; row < rowCount; row++){
            for (int col=0; col < colCount; col++){
                System.out.print(twoDimensionalArray[row][col]+" \t");

            }
            System.out.println();
             }
        }
    public static void main(String[] args){
       

      populateArray();
      displayArray();
       
    }
}