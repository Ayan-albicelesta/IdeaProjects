import java.util.*;

class tcs{
    public static void main(String[] args) {
        int[] arr ={1,1,2,-4,2,2,4};
        int l=arr.length;
        System.out.println(l);

        Stack<Integer> obj=new Stack<>();
         

        int x=4;
        for(int i=0;i<l;i++){
            int sum=0;
//   System.out.println(i);
          for(int j=i;j<l;j++){
              
              sum=sum+arr[j];
            //   System.out.println(j+" "+sum);
              obj.push(arr[j]);
              if(sum==x){
                 int []arr2=new int[obj.size()];
                 for(int k=obj.size()-1;k>=0;k--){
                    arr2[k]=obj.get(k);
                 }
                 System.out.println(Arrays.toString(arr2));
              }
          }
          obj.clear();
        }
        
    }
}