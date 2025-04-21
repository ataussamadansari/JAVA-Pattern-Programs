import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num - 1; j >= i; j--) {
                System.out.print("  "); //double space
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *"); // prefix space
            }
            System.out.println();
        }
    }
}

/*
     Pattern Program : 3
                 *
               * *
             * * *
           * * * *
         * * * * *
*/