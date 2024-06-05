package margaya.Stack_pepcoding;

import java.util.Stack;

public class Q5_stock_span_problem {
    public static void main(String[] args) {
        int arr[]={3,4,6,2,5,1,2,3,9,7,4,3,4,6,8,5};
        int arr2[]=new int[arr.length];
        Stack<Integer> ob=new Stack<Integer>();

        findStockSpan(arr,arr2,ob);

        for(int i:arr2){
            System.out.print(i+" ");
        }
    }

    private static void findStockSpan(int[] arr, int[] arr2, Stack<Integer> ob) {
        //see here we have to find the previous greater element
        arr2[0]=1;
        ob.push(0);
        for(int i=1;i<arr.length;i++){
            while (!ob.isEmpty() && arr[i]>arr[ob.peek()]){
                ob.pop();
            }
            if(ob.isEmpty()){
                arr2[i]=i+1;
                ob.push(i);
            }
            else {
                arr2[i]=i-ob.peek();
                ob.push(i);
            }
        }
    }
}
