import java.util.*;
public class Factorial {
    public static int fact(int a){
        if (a!=0 && a>0){
            return a*fact(a-1);
        }
        else{
            return 1;   
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int a =sc.nextInt();
        System.out.println(fact(a));
    }
}
