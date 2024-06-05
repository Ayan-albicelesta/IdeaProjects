package margaya.pepcoding_recursion;

import java.util.Scanner;

public class last_index_of_element_in_Array {
    public static void main(String[] args) {
        int arr[]={1,2,1,90,0,-34,3};
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(lastIndex(arr,arr.length-1,num));
    }

    private static int lastIndex(int[] arr, int i,int num) {
        if(i<0){
            return  -1;
        }
        else if(arr[i]==num){
            return i;
        }

        return lastIndex(arr,i-1,num);

    }
}
