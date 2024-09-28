import java.util.*;

public class Half_Pyramid_Patten {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = scanner.nextInt();
        int space=n-1;
        for (int i = 0; i < space; i++) {
            if (i <= (n - 1))
                System.out.print(" ");
            else
                System.out.print("*");
        }
        System.out.println();
        // star++;
        n--;
        // number_of_line++;

        // int star = 1;
        // int space = n - 1;
        // int number_of_line = 1;

        /*
         * while (number_of_line <= n) {
         * // print space
         * for (int j = 0; j < space; j++) {
         * System.out.print("   ");
         * }
         * for (int j = 0; j < star; j++) {
         * System.out.print("  *");
         * }
         */
    }
}