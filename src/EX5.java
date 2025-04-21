import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
     Pattern Problem : 5
            *
           * *
          * * *
         * * * *
        * * * * *
 */
