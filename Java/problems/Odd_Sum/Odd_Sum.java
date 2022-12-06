//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;

public class Odd_Sum {
    public static int oddsum(int a){
        int sum =0;
        for (int i=1;i<=a;i=i+2){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(oddsum(a));;
    }
}
