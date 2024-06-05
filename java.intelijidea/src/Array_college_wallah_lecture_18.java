import java.util.*;
public class Array_college_wallah_lecture_18 {
    public static void main(String[] args) {

        //sort an array which consist of 0 and 1
        /*int arr[]={1,0,0,1,0,1,1,0,0};
        //count number of zeroes
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        //print zeroes total count times,so the range of zeros is from 0 to count-1,after count-1 to till last print 1
        for(int i=0;i<arr.length;i++){
            if(i<count){
                arr[i]=0;
            }
            else {
                arr[i]=1;
            }
        }
        System.out.println("sorted array is ");
        for(int i:arr){
            System.out.print(i+" ");
        }*/

        //alternate approach(two pointer) to sort an array which consist of 0 and 1
        /*int arr[]={1,0,0,1,0,1,1,0,0};
        int i=0;int j=arr.length-1;
        while (i<j){
            if(arr[i]==1 && arr[j]==0){
                swap(arr,i,j);
                i++;
                j--;
            }
//            if(arr[i]==0){
//                i++;
//            }
//            if(arr[j]==1){
//                j--;
//            }
            //instead of if using while will be more optimised, both are right
            while(arr[i]==0){
                i++;
            }
            while(arr[j]==1){
                j--;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }*/


        //sort array in basic of even and odd,order does not matter
        /*int arr[]={1,3,4,5,6,8};
        int i=0; int j=arr.length-1;
         while (i<j){
             if(arr[i]%2!=0 && arr[j]%2==0){
                 swap(arr,i,j);
                 i++;
                 j--;
             }
             if (arr[i]%2==0){
                 i++;
             }
             if (arr[j]%2!=0){
                 j--;
             }
         }
         for(int ans:arr){
             System.out.print(ans+" ");
         }*/



        //given an array in non-decreasing order, return an array of their square, returned array have to be non decreasing order also
        //this is using two pointer
        /*int arr[]={-10,-3,-2,1,4,5};
        int left=0; int right=arr.length-1;
        int newarr[]=new int[arr.length];
        int k= newarr.length-1;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                newarr[k]=arr[left]*arr[left];
                k--;
                left++;
            }
            else {
                newarr[k]=arr[right]*arr[right];
                k--;
                right--;
            }
        }
//         reverse(newarr);//should have used reverse if we are inserting the elements from front(k=0)
        for(int ans:newarr){
            System.out.print(ans+" ");
        }*/


        //brute force way
        int arr[]={-10,-3,-2,1,4,5};
        for(int i=0;i<arr.length;i++){   
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for(int ans:arr){
            System.out.print(ans+" ");
        }


    }


    private static int[] reverse(int[] newarr) {
        int i=0; int j= newarr.length-1;
        for(int k=0;k< newarr.length/2;k++){
            int temp=newarr[i];
            newarr[i]=newarr[j];
            newarr[j]=temp;
            i++;
            j--;
        }
        return newarr;
    }


    //swap method
    private static void swap(int[] arr,int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }



}
