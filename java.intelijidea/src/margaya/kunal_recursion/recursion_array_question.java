package margaya.kunal_recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class recursion_array_question {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //array sorted or not
        /*int arr[]={1,2,8,-9};
        boolean ans=sortedOrNot(arr,0);
        System.out.println(ans);*/

        //search element in an array
        /*int arr[]={2,64,875,300,-35,8};
        int target=sc.nextInt();
        int ans=searchElement(arr,target,0);
        System.out.println(ans);*/

        //search all index of an elements by storing in arraylist(pass an arraylist in argument)
        /*int arr[]={1,3,5,755,25,5,-65,-2,0,5};
        int target=5;
        ArrayList<Integer> obj=new ArrayList<>();
        searchAllElement(arr,target,obj,0);
        for(Integer i:obj){
            System.out.print(i+" ");
        }*/


        //search all elements by storing in arraylist but dont pass the arraylist in argument
        /*int arr[]={1,3,5,755,25,5,-65,-2,0,5};
        int target=5;
        System.out.println(searchAllElementWithoutPassingArraylist(arr,target,0));*/


        //rotated binary search
        int arr[]={5,6,7,8,9,1,4};
        int target=5;
        int s=0;int e=arr.length-1;
        int pivotIndex=findPivotELem(arr);
        System.out.println("pivot index is "+pivotIndex);
//        int ans=searchInRotatedSortedArray(arr,target,s,e,pivotIndex);
//        System.out.println("index of the target element is "+ans);

    }

//    private static int searchInRotatedSortedArray(int[] arr, int target, int s,int e,int pivotIndex) {
//        int mid=s+(e-s)/2;
//        //base case
//        if(s>e){
//            return -1;
//        }
//        if(s==e){
//            return s;
//        }
//
//        if(arr[mid]==target){
//            return mid;
//        }
//        else if(target>=arr[pivotIndex] && target<=arr[arr.length-1]){
//
//        }
//        else {
//
//        }
//    }

    private static int findPivotELem(int[] arr) {
        int s=0,e=arr.length-1;
        int mid=s+(e-s)/2;
        int ans=-1;
        while (s<=e){
            if(arr[mid]>arr[0]){
                s=mid+1;
            }
            else {
                ans=mid;
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }

    private static ArrayList searchAllElementWithoutPassingArraylist(int[] arr, int target, int index) {
        ArrayList<Integer> obj=new ArrayList<>();
        //base case 1
        if(index==arr.length){
            return obj;
        }
        if(arr[index]==target){
            obj.add(index);
        }
        ArrayList<Integer> ansfromBelowCalls= searchAllElementWithoutPassingArraylist(arr,target,index+1);
        obj.addAll(ansfromBelowCalls);
        return obj;
    }

    private static ArrayList searchAllElement(int[] arr, int target,ArrayList obj, int index) {
        //base case 1
        if(index==arr.length){
            return obj;
        }
        if(arr[index]==target){
            obj.add(index);
        }
        return searchAllElement(arr,target,obj,index+1);
    }

    private static  int searchElement(int[] arr, int target, int index) {
        //base case 1
        if(index==arr.length){
            return -1;
        }
        //base case 2
        if(arr[index]==target){
            return index;
        }
        return searchElement(arr,target,index+1);
    }

    private static boolean sortedOrNot(int[] arr, int index) {
        //base case
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]<=arr[index+1]){
           return sortedOrNot(arr,index+1);
        }
        else {//this is also a base case
            return  false;
        }
    }
}
