import java.util.Scanner;

public class Uniqueno {
    public static int takeint(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        int n ;
        try{
            n = sc.nextInt();
            if(n < 0){
                System.out.println("Please enter a positive number! ");
                n = takeint(msg);
            }
        }catch (Exception e){
            System.out.println("Sorry but there was a error,try again");
            System.out.println("Error is "+e);
            n = takeint(msg);

        }
        return n;
    }
    public static boolean uniqueno(int num){
        boolean [] numbers = new boolean[]{false, false, false, false, false, false, false, false, false, false};
        while(num > 0){
            int temp = num %10;
            if(numbers[temp] != false ){
                return false;
            }
            numbers[temp] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = takeint("Please enter a 8 digit positive number : ");
        System.out.println((uniqueno(number))?"It is a unique number":"It is not a unique number");

    }
}
