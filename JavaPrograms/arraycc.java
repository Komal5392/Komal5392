import java.util.*;

public class arraycc {
    public static void update(int marks[]) {
        // Scanner sc = new Scanner(System.in);
        // marks[] = sc.nextInt();
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = { 51, 52, 53 };

        update(marks);
        // print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}