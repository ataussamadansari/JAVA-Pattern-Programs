import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        for (int i = num; i > 0; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
   Pattern Problem : 2
        * * * * *
        * * * *
        * * *
        * *
        *
 */