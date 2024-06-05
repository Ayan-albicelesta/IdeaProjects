package margaya.babbar_binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class binary_search_lecture15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int student=sc.nextInt();
//        int books=sc.nextInt();
        int arr[]={10,20,30,40};
        int sum=0;
        for(int i:arr){
            sum=sum+i;
        }
        int s=0;int e=sum;
        int mid=s+(e-s)/2;
        int ans=-1;
        while (s<=e){

            if(isPossibleSolution(mid,arr,student)){
                ans=mid;
                e=mid-1;
            }
            else {
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        System.out.println(ans);
    }

    private static boolean isPossibleSolution(int mid,int[] arr, int student) {
          int stud=1;
          int TotalPage=0;
          for(int i=0;i<arr.length;i++){
              if(arr[i]>mid){
                  return false;
              }
              if(TotalPage+arr[i]<mid){
                  TotalPage=TotalPage+arr[i];
              }
              else {
                  stud++;
                  TotalPage=arr[i];
              }
          }
          if(stud>student){
              return false;
          }
          else {
              return true;
          }
    }

}
