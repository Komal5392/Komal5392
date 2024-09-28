import java.util.*;

public class ArraysCC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[50];
        arr[0] = sc.nextInt();// phy
        arr[1] = sc.nextInt();// chem
        arr[2] = sc.nextInt();// math
        System.out.println("Phy" + arr[0] + "Chem" + arr[1] + "Math" + arr[2]);
    }
}