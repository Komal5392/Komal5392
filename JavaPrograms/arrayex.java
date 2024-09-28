import java.util.*;
public class arrayex {
    public static void main(String args[]){
        int marks[]=new int[100];
        Scanner scan=new Scanner(System.in);
        marks[0]=scan.nextInt();
        marks[1]=scan.nextInt();
        marks[2]=scan.nextInt();
        System.out.println("Phy :" +marks[0]);
        System.out.println("Chem :"+marks[1]);
        System.out.println("Math :"+marks[2]);
        int avg= (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Avg marks is :" +avg );
    }
    
}
