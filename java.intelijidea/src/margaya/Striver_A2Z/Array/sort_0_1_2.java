package margaya.Striver_A2Z.Array;

public class sort_0_1_2 {
    public static void main(String[] args) {
        int arr[]={0,2,1,1,0,2};
        sortTheArryAccording(arr);
    }

    private static void sortTheArryAccording(int[] arr) {
        int c1=0,c2=0,c3=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
             c1++;
            else if(arr[i]==1){
                c2++;
            }
            else
              c3++;
        }
        System.out.println(c1+""+c2+""+c3);
        for(int i=0;i<c1;i++){
            arr[i]=0;
        }
        for(int i=c1;i<c1+c2;i++){
            arr[i]=1;
        }
        for(int i=c1+c2;i<c1+c2+c3;i++){
            arr[i]=2;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
