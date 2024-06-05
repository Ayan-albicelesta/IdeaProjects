import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_question6_college_wallah_33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //return if exist or not
        /*int arr[] = {2, 54, 8, 9, -9, 34, 8};
        int target=sc.nextInt();
        exist(arr,0,target);*/

        //return the index of the element
        /*int arr[]={2,45,34,-34,8,12};
        int target=12;
        int ans=findIndex(arr,0,target);
        System.out.println(ans);*/

        //print all indexes of an element
        /*int arr[]={1,3,9,9,4,9,0};
        int target=9;
        findAllIndexes(arr,target,0);*/


        //return all indexes of element with an arraylist, by passing A arraylist in argument
        /*ArrayList<Integer> obj=new ArrayList<>();
        int arr[]={23,4,90,4,-45,56,4};
        int target=4;
        ArrayList<Integer> ans=allIndexes(arr,0,target,obj);
        System.out.println(ans);*/


        //return all indexes of element with an arraylist,without passing A arraylist in argument
        /*int arr[]={2,45,6,2,4,-8,0,2};
        int target=2;
        ArrayList<Integer> ans=findallIndexes(arr,target,0);
        System.out.println(ans);*/

    }

    private static ArrayList<Integer> findallIndexes(int[] arr, int target, int index) {
        ArrayList<Integer> obj=new ArrayList<>();
        //base case
        if(index==arr.length){
            return obj;
        }
        if(target==arr[index]){
            obj.add(index);
        }
        ArrayList<Integer> ans=findallIndexes(arr,target,index+1);
        obj.addAll(ans);
        return  obj;
    }

    private static ArrayList<Integer> allIndexes(int[] arr, int index, int target, ArrayList<Integer> obj) {
        if(index==arr.length){
            return obj;
        }
        if(arr[index]==target){
            obj.add(index);
        }
        return allIndexes(arr,index+1,target,obj);
    }

    private static void findAllIndexes(int[] arr, int target, int index) {
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            System.out.println(index);
        }
        findAllIndexes(arr,target,index+1);
    }

    private static int findIndex(int[] arr, int index, int target) {
         if(index==arr.length){
             return -1;
         }
         if(arr[index]==target){
             return index;
         }
         return  findIndex(arr,index+1,target);
    }

    private static void exist(int[] arr, int index,int target) {
        if(index==arr.length){
            System.out.println("does not exist");
            return;
        }
        if(target==arr[index]){
            System.out.println(target+" exist in the array");
            return;
        }
        exist(arr,index+1,target);

    }
}
