import java.util.*;
public class sum_of_number{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number :");
        int a=s.nextInt();
        int sum=0;
        while (a>0){
            int z=a%10;
            sum+=z;
            a/=10;
        }
        System.out.println("sum of given number is :"+sum);
    }
}