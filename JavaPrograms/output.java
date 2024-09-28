public class output {
    public static void main(String[] args) {
        int a[][]={{1,2},{3,4}};
        System.out.println("The elements of an array");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                //System.out.println(a[i][j]);
                System.out.println(a[j][j]);
            }
        }
    }
}
