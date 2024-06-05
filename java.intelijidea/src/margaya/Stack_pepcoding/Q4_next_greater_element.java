package margaya.Stack_pepcoding;

import java.util.Stack;

public class Q4_next_greater_element {
    public static void main(String[] args) {
        int arr[]={2,5,9,3,1,12,6,7,8};
        int arr2[]=new int[arr.length];
        Stack<Integer> ob=new Stack<Integer>();

        findResult(arr,arr2,ob);

        for(int i:arr2){
            System.out.print(i+" ");
        }
    }

    private static void findResult(int[] arr, int[] arr2,Stack<Integer> ob) {
         ob.push(arr[arr.length-1]);
         arr2[arr.length-1]=-1;
        for (int i=arr.length-2;i>=0;i--){
            while (!ob.isEmpty() && arr[i]>ob.peek()){
                ob.pop();
            }
            if(ob.isEmpty()){
                arr2[i]=-1;
                ob.push(arr[i]);
            }
            else {
                arr2[i]=ob.peek();
                ob.push(arr[i]);
            }
        }
    }
}
