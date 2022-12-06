import java.util.*;
public class create_sort {
    public static int[] sort(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                int temp=0;
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        //int arr[]=new int[n];
        int z[]={5,3,6,3,8,2};
        
        z=sort(z);
        for(int i :z){
            System.out.print(i+" ");
        }


    }
}
