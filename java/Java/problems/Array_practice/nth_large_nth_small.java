public class nth_large_nth_small {
    public static int[] sort(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int k=0;
                if(a[i]>a[j]){
                    k=a[i];
                    a[i]=a[j];
                    a[j]=k;
                }
            }
        }
        return a;
    }

    public static int nth_large(int a[],int p){
        if(p<=a.length){
        a=sort(a);
        return a[a.length-p];
        }
        else{
            return 0;
        }
    }

    public static int nth_small(int a[], int p){
        if(p<=a.length){
            a=sort(a);
            return a[p];
            }
            else{
                return 0;
            }
    }
    public static void main(String[] args){
        int a[]={1,4,2,5,3,6,8,4};

        for(int i=1;i<a.length;i++){
            System.out.println(nth_large(a, i));
        }

        System.out.println("=====================================");
        for(int i=1;i<a.length;i++){
            System.out.println(nth_small(a, i));
        }
    }
}



/*
 
for(int i=0;i<a.length;i++){
            
        for(int j=i+1;j<a.length;j++){
            int temp=0;
            if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        }

 */
