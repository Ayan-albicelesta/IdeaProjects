package margaya.babbar_binary_search;

import java.util.Scanner;

public class binary_search_interview_question_14 {
    public static void main(String[] args) {
        //find pivot element
        /*int arr[]={6,67,89,4};
        System.out.println( "pivot index is "+findPivot(arr));*/

        //search and rotated and sorted array
        int arr[]={7,9,1,2,4};
        int target=1;
        int index=searchInRotatedAndSortdArray(arr,target);
        System.out.println("index is "+index);


        //square root
        /*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int index=findSqureRoot(n);
        System.out.println(index);*/


    }

    static int val=-1;
    private static  int findSqureRoot(int n) {
        int s=0;int e=n;
        int mid=s+(e-s)/2;
        while(s<=e){
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid>n){
                e=mid-1;
            }
            else {
                val=mid;
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return  val;
    }

    private static  int searchInRotatedAndSortdArray(int[] arr, int target) {
        int s=0;int e=arr.length-1;
        int mid=s+(e-s)/2;
        while (s<e){
            if(arr[mid]>=arr[0])
                s=mid+1;
            else
                e=mid;
            mid=s+(e-s)/2;
        }
        int pivotIndex=s;
        if(arr[arr.length-1]>=target && target>=arr[pivotIndex] ){
           return doBinarySearch(pivotIndex,arr.length-1,target,arr);
        }
        else {
           return doBinarySearch(0,pivotIndex-1,target,arr);
        }
    }

    private static int doBinarySearch(int s, int e, int target,int []arr) {
        int start=s;
        int end=e;
        int mid=s+(e-s)/2;
        while(s<=e){
            if (target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
            else {
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return -1;
    }

//    private static  int findPivot(int[] arr) {
//        int s=0; int e=arr.length-1;
//        int mid=s+(e-s)/2;
//
//        while (s<=e) {
//            if(arr[mid]>=arr[0])
//                s=mid+1;
//            else
//                e=mid-1;
//            mid=s+(e-s)/2;
//        }
//        return s;
//    }

    //upper code can be written in this form also-->approach college wallah
    private static  int findPivot(int[] arr) {
        int s=0;int e=arr.length-1;
        int mid=s+(e-s)/2;
        int ans=-1;
        while (s<=e){
            if(arr[mid]>arr[arr.length-1]) {
                s = mid + 1;
            }
            else {
                ans=mid;
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }
}
