import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enetr number to check leap year or not");
        int year = scan.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not leap year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not leap year");

        }
    }
}
