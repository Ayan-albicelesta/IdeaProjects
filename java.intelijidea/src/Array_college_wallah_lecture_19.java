import java.util.Arrays;
import java.util.Scanner;

public class Array_college_wallah_lecture_19 {
    public static void main(String[] args) {
        //find prefix sum
       /*int[]arr={2,1,3,4,5};
       prefixSum(arr);
       for(int i:arr){
           System.out.print(i+" ");
       }*/


        //find sum of a perticular array portion
         /*Scanner sc=new Scanner(System.in);
         System.out.println("take input");
         int n=sc.nextInt();
         int arr[]=new int[n+1];
        System.out.println("take array input");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        findSumInPortion(arr);*/


        //check if we can partion an array in two equal part so that their sum is equal
        // int[] arr={5,3,-9,-6,3,2};
        // int pre[]=prefixSum(arr);
        // int suf[]=suffixSum(arr);

        // boolean flag=false;
        // for(int i=0;i<arr.length-1;i++){
        //     if(pre[i]==suf[i+1]){
        //         flag=true;
        //     }
        // }
        // System.out.println(flag);




        //optimised way--here we dont have to calcylate suffixarray and also do not have to create a new array to calculate prefix array, just calculate prefix sum and calculate sumffixsum, (suffixsum=totalsum-prefixsum)
        int[] arr={5,3,-9,-6,3,2};

        //find total sum of array
        int totalsum=0;
        for(int element:arr){
            totalsum=totalsum+element;
        }
        boolean flag=false;
        int prefSum=0;
        for(int i=0;i<arr.length;i++){
            prefSum=prefSum+arr[i];
            int suffSum=totalsum-prefSum;
            if(prefSum==suffSum){
             flag=true;
            }
        }
        System.out.println(flag);
    }


    private static void findSumInPortion(int[] arr) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many times to take input");
        int n=sc.nextInt();
        int i=1;
        while (i<=n){
            System.out.println("take start");
            int s=sc.nextInt();
            System.out.println("take end");
            int e=sc.nextInt();
            int[] ansArr=prefixSum(arr);
            System.out.println("ans is");
            System.out.println(ansArr[e]-ansArr[s-1]);
            i++;
        }

    }

    private static int[] suffixSum(int[] arr) {
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }

        for(int i=ans.length-2;i>=0;i--){
            ans[i]=ans[i]+ans[i+1];
        }
        return ans;
    }

    private static int[] prefixSum(int[] arr) {
        //changing the original array
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum=sum+arr[i];
        //     arr[i]=sum;
        // }
        // return arr;   



        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }
        //way 1---this is done by me, complexity O(n)
         /* int sum=0;
        for(int i=0;i<ans.length;i++){
            sum=sum+ans[i];
            ans[i]=sum;
        }*/
        //way 2-->here also the complexity is O(n)
        for(int i=1;i<ans.length;i++){
            ans[i]=ans[i-1]+ans[i];
        }

        return ans;

     
    }


    //brute force way,bad complexity-->O(n*n)
//    private static void prefixSum(int[] arr) {
//        for(int i=arr.length-1;i>=0;i--){
//            int sum=0;
//            for(int j=0;j<=i;j++){
//                sum=sum+arr[j];
//            }
//            arr[i]=sum;
//        }
//    }
}
