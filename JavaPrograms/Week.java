import java.util.*;

public class Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
                break;

        }
    }
}

/*
 * Integer.parseInt(scanner.nextLine());
 * int[] numbers = new int[n];
 * for (int i = 0; i < n; i++) {
 * numbers[i] = Integer.parseInt(scanner.nextLine());
 * }
 * Arrays.sort(numbers);
 * for (int i = 0; i < n; i++) {
 * System.out.print(numbers[i] + " ");
 * }
 * System.out.println();
 * for (int i = n - 1; i >= 0; i--) {
 * System.out.print(numbers[i] + " ");
 * }
 * System.out.println();
 * for (int i = 0; i < n; i++) {
 * System.out.print(numbers[i] + " ");
 * }
 */