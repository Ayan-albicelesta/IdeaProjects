package margaya.Striver_A2Z.sorting;

import java.util.Arrays;

public class inplace_mergeSort {
    public static void main(String[] args) {
        int arr[]={90,23,-34,5,12,-456,0};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSort(int[] arr) {
        int[]ans=helper(arr);
        for(int i=0;i<ans.length;i++){
            arr[i]=ans[i];
        }
    }

    private static int[] helper(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[]left=helper(Arrays.copyOfRange(arr,0,mid));
        int[]right=helper(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int arr[]=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }
            else {
                arr[k]=right[j];
                j++;
                k++;
            }

        }
        while (i<left.length){
            arr[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            arr[k]=right[j];
            j++;
            k++;
        }
        return arr;
    }
}
