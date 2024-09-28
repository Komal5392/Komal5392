import java.util.*;
public class searchArrayFastFood {
    public static int linearSearch(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i].equals(key)){
                return i;//Return the index where key found
            }
        }
        return -1;//Return -1 if key is not found
    }
    public static void main(String args[]){
        String menu[]={"Dosa", "Chole Bhature", "Samosa", "idli"};
        String key="Samosa";

        int index=linearSearch(menu, key);//calling linearSearch with Correct types


        if (index==-1){
            System.out.print("Not Found");
        }
        else{
            System.out.print("key is at index" +index);
        }
    }
}