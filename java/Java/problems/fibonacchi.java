import java.util.*;
public class fibonacchi{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a= s.nextInt();
        int sum=0;
        int sum1=1;
        int z=0;
        for(int i=0;i<=a;i++){
            z=sum+sum1;
            System.out.print(z+" ");
            sum=sum1;
            sum1=z;
        } 

    }
}