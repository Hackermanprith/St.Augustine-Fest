import java.util.Scanner;

public class spaciousmatrix {
    public static int takeint(boolean isMatrix,String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        int n ;
        try{
            n = sc.nextInt();
            if(n < 0){
                System.out.println("Please enter a positive number! ");
                n = takeint(isMatrix,msg);
            }
            if(isMatrix){
                if(n < 3 || n > 6){
                    System.out.println("Please enter a pos number between 3 and 6! ");
                    n = takeint(isMatrix,msg);
                }
            }
        }catch (Exception e){
            System.out.println("Sorry but there was a error,try again");
            System.out.println("Error is "+e);
            n = takeint(isMatrix,msg);

        }
        return n;
    }
    public static boolean isSpacious(int[][]matrix,int column,int row){
        int noofzeros = 0;
        for(int i = 0;i< column;i++){
            for(int j = 0;j<row;j++){
                if(matrix[i][j] == 0){
                    noofzeros += 1;
                }
            }
        }
        int percentage = (noofzeros/(column*row)) * 100;
        if(percentage < 50){
            return false;
        }

        return true;

    }
    public static void main(String[] args) {
        int row = takeint(true,"Enter the number of rows: ");
        int column = takeint(true,"Enter the number of columns: ");
        int [] [] matrix = new int[row][column];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                matrix [i][j] = takeint(false,"Give the data for "+i+","+j+" :");
            }
        }
        System.out.println((isSpacious(matrix,row,column))?"It is spacious":"It is not spacious");

    }
}
