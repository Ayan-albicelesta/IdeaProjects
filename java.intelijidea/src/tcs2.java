import java.util.*;

class tcs2{
    public static void main(String[]args){

        //input--{4,2,7,1,6,3}--array , 3--subarray size,  output-->7,7,7,6
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();

        System.out.println("take array input");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
   
        ArrayList<Integer> list=ans(arr,k);
        for(int i:list){
            System.out.print(i+" ");
        }
    }

    public static ArrayList<Integer> ans(int[] arr, int k) {
       ArrayList<Integer> ob=new ArrayList<>();

       for(int i=0;i<=arr.length-k;i++){
          int max=-1;
        for(int j=i;j<=i+k-1;j++){
           if(arr[j]>max){
             max=arr[j];
           }
        }
       
        ob.add(max);
       }
       return ob;
 
    }
}
