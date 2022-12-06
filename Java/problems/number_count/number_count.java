import java.util.*;

//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
public class number_count {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        int t_pos=0;
        int t_neg=0;
        int t_zero=0;

        System.out.println("for quite type : 1122");    // Create New variable k=1 if k==1 then continue or k==0 to break 
        //      variable can be created out side or before the loop and same varible input should be taken in out side or after the loop    it can reset the variable value for next step
        while(true){
            int a=sc.nextInt();
            if (a==1122){           
                break;
            }
            if (a>0){
                t_pos+=1;
            }
            else if(a<0){
                t_neg+=1;
            }
            else if (a==0){
                t_zero+=1;
            }
            
        }
        
        System.out.println("less than 0 :"+t_neg+"\n"+"greater than 0 :"+t_pos+"\n"+"equal to zero :"+t_zero);
    }

    }

