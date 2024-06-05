// package margaya.Stack_pepcoding;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Q7_sliding_window_maximum {
    public static void main(String[] args) {
        int []arr={2,9,3,8,1,7,12,6,14,4,32,0,7,19,8,12,6};
        int [] nextGreater=new int[arr.length];
        Stack<Integer> ob=new Stack<>();
        

        NextGreater(arr, nextGreater,ob);
        for(int i:nextGreater){
            System.out.print(i+" ");
        }
        System.out.println();

        Scanner sc=new Scanner(System.in);
        System.out.println("take window size");
        int n=sc.nextInt();
        ArrayList<Integer> obj=new ArrayList<>();
        int ans[]=findWindowMax(arr,nextGreater,obj,n);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }

    private static int[] findWindowMax(int[] arr, int[] nextGreater, ArrayList<Integer> obj,int winSize) {
        int []greaterInWindow=new int[arr.length-(winSize-1)];
        int k=arr.length-winSize;
        for(int i=0;i<=k;i++){
            int n=i;
            int ans=Integer.MAX_VALUE;
            for(int j=i;j<i+winSize;j++){
                if(nextGreater[n]==arr[j]){
                    ans=nextGreater[n];
                    n++;
                }
            }
            if(ans==Integer.MAX_VALUE){
                 greaterInWindow[i]=arr[i];
            }
            else {
                 greaterInWindow[i]=ans;
            }
        }
        return  greaterInWindow;
    }

    private static void NextGreater(int[] arr, int[] nextGreater, Stack<Integer> ob) {
         nextGreater[arr.length-1]=arr[arr.length-1];
        ob.push(arr[arr.length-1]);

        for(int i=arr.length-2;i>=0;i--){
            while (!ob.isEmpty() && arr[i]>ob.peek()){
                ob.pop();
            }
            if(ob.isEmpty()){
                nextGreater[i]=-1;
                ob.push(arr[i]);
            }
            else {
                nextGreater[i]=ob.peek();
                ob.push(arr[i]);
            }
        }
    }

}
