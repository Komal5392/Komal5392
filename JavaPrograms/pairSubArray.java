import java.util.*;
public class pairSubArray {
    public static void printSubarray(int numbers[]){
        int sum=0;
        int tp=0;
        for (int i=0;i<numbers.length;i++){
            int start=i;
            for (int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.println("numbers[" + k + "]=" + numbers[k]);
                    sum = sum + numbers[k];
                }
                System.out.println("sum=" + sum);
                sum=0;
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print(tp);
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
       printSubarray(numbers);

    }
}
