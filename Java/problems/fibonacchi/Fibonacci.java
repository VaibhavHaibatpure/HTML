import java.util.Scanner;

public class Fibonacci{
    public static void Fibo(int a){
        int z=0;
        int x=1;
        int sum=0;
        System.out.print(z+" "+x+" ");
        for (int i=0;i<a-2;i++){
            sum=z+x;
            z=sum;
            x=z;
            System.out.print(sum+" ");
            //return (sum);

        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Fibo(a);
    }
}