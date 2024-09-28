import java.util.*;

public class Solid_Rhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            // Print Spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // print Stars
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}