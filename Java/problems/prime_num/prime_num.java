public class prime_num {
    public static boolean prime(int a){
        int k=0;
        for (int i=2;i<a;i++){
            if (a%i==0){
                k=1;
                break;
            }
        }
        if (k==1){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String args[]){
        System.out.println(prime(5));
    }
}
