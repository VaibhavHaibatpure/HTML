import java.util.*;
public class GCD {

    public static int GDC_num (int a,  int b){
        int z=0;
        int k=0;
        if (a>b){
            k=b;
        }
        else{
            k=a;
        }
        for (int i=1;i<k;i++){
            if (a%i ==0 && b%i==0){
                z=i;
            }
        }
        return z;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(GDC_num(a, b));
    }
}
