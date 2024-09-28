import java.util.Scanner;

public class NaturalNumber {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 1;
        while (count <= n) {
            int m = 0;
            m = m + count;
            count++;
        }
        System.out.print(m + " ");
    }
}