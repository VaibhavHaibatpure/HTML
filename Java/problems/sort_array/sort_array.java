import java.util.*;
public class sort_array {
    
    public static void main(String abc[]){
        int a[]={1,6,4,3,5,2};
        //System.out.println(sort(a));
        //int z[]=a.sort();
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
