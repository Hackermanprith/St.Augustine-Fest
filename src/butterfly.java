import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int n= word.length();
        char[] wordarray = word.toCharArray();
        for(int i = 1;i <= n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(wordarray[j-1]);
            }
            int spaces = 2 * (n-i);
            for(int k = 1;k<=spaces;k++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print(wordarray[j-1]);
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(wordarray[j - 1]);
            }
            int spaces = 2 * (n - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            // print the opposite side of the first pattern
            for (int j = i; j >= 1; j--) {
                System.out.print(wordarray[j - 1]);
            }
            System.out.println();
        }

    }
}
