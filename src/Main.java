import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
 *    Pattern Problem : 0
 *        * * * * *
 *        * * * * *
 *        * * * * *
 *        * * * * *
 *        * * * * *
 * */