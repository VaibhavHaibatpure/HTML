import java.util.*;
public class star_pattern{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        /*
        for (int i=0;i<a;i++){      //  Row's
            if (i==0 || i==a-1){
                for (int j=0;j<b;j++){      // First and last Row
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                System.out.print("* ");       // New Row first star
                for (int j=0;j<b-2;j++){        // Column
                    System.out.print("  ");     // blank space in Row
                }
                System.out.print("*");       // new row last star
                System.out.println();           //  println  for new line
            }
        }
         */

         for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                if(j==0 || j==b-1 || i==0 || i==a-1 ){  // row or column are equal to 0 or last (0,last) then *
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

         }
        
    }
}