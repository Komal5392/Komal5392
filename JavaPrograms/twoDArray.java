/*Print the number of 7’s that are inthe 2d array.Example :Input - int[][] array = { {4,7,8},{8,8,7} };Output - 2*/
import java.util.*;
public class twoDArray{
    public static void main(String args[]){
        int matrix[][]={{4,7,8},{8,8,7}};

        int countof7=0;

        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==7){
                    countof7++;
                }
            }}
            System.out.println("count of 7 is:"+countof7);
        }
    }