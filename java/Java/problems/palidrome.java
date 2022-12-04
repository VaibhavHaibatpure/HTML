import java.util.*;
public class palidrome {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number :");
        int a=s.nextInt();
        int copy=a;
        int new_num=0;
        
        while(a>0){
            int z=a%10;
            new_num+=z;
            new_num*=10;
            a/=10;
        }
        if(copy==new_num/10){
            System.out.println("** YES Palidrome **");
        }
        else{
            System.out.println("** NOT Palidrome **");
        }
    }
}
