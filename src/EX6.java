import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        for (int i = num; i >= 1; i--) {
            for (int j = i; j <= num; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
         Pattern Problem : 6
            * * * * *
             * * * *
              * * *
               * *
                *
 */
