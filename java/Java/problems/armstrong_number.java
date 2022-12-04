import java.util.*;
public class armstrong_number {
    public static int lenght_(int a){
        int l=0;
        int z=a;
        while(a>0){
            l+=1;
            a/=10;
        }
        a=z;
        return l;
    }
    public static int power(int a,int b){
        int pow=0;
        while (b>0){
            a*=a;
            b-=1;
        }
        return pow;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter number :");
        int a= s.nextInt();
        int len=lenght_(a);
        System.out.println(len);
        int arms=0;
        while(a>0){
            int i=a%10;
            a/=10;
            arms=arms+power(i,len);
        }
        System.out.println(arms);

    }
    
}
