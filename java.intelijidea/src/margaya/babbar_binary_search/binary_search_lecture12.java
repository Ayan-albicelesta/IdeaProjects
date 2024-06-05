package margaya.babbar_binary_search;

import java.util.Scanner;

public class binary_search_lecture12 {
    public static void main(String[] args) {
        int []arr={1,3,5,6,8,14,45};
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int index=findElement(arr,key);
        System.out.println(index);
    }

    private static int findElement(int[] arr, int key) {
        int s=0;
        int e=arr.length-1;
        int mid=s+(e-s)/2;
         while (s<=e){
             if(arr[mid]==key){
                 return mid;
             }
             if(key>arr[mid]){
                 s=mid+1;
             }
             else {
                 e=mid-1;
             }
             mid=s+(e-s)/2;
         }
         return -1;
    }
}
