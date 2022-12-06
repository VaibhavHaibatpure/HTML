import java.util.*;

public class Count {
    public static int [] append(int a[],int b){
        int l=a.length;
        int new_[]=new int[l+1];
        if(l==0){
            int k=0;
            new_[0]=b;
        }
        else{
        for(int i=0;i<l;i++){
            new_[i]=a[i];
        }
        new_[l]=b;
    }
        return new_;
    }
    public static void main(String[]a){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter length of array :");
        int ln= s.nextInt();
        int if_odd[]={};
        int if_even[]={};
        int if_neg[]={};
        int count=0;
        for(int i=0;i<ln;i++){
            System.out.print("enter number :");
            int sc=s.nextInt();
            if (sc>0){
                if (sc%2==0){
                    if_even=append(if_even, sc);
                }
                else{
                    if_odd=append(if_odd, sc);
                }
            }
            else if(sc==0){
                count+=1;
            }
            else{
                if_neg=append(if_neg, sc);
            }
            
        }
            System.out.println("Even numbers :");
            for(int j :if_even){
                System.out.print(j+" ");
            }
            System.out.println("\n\nOdd numbers :");
            for(int k : if_odd){
                System.out.print(k+" ");
            }
            System.out.println("\n\nNegative numbers :");
            for(int i: if_neg){
                System.out.print(i+" ");
            }
            System.out.println("\n\nNumber of zeros : "+count);

    }

}

