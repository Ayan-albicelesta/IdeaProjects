package margaya.college_wallah_binary_search;

import java.util.Scanner;

public class binary_search_algorithm_lecture_45 {
    public static void main(String[] args) {
        //find first and last occurrence of an element
       /* int arr[]={2,2,2,2,2,3};
        int target=2;
        int ans[]=findFirstAndLastOccurrence(arr,target);
        System.out.println("left and right index are ");
        for(int i:ans){
            System.out.print(i+" ");
        }*/



        //find square root of an element
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ans=findRoot(a);
        System.out.println(ans);
    }

    private static int findRoot(int a) {
        int s=0,e=a;
        int mid=s+(e-s)/2;
        int ans=-1;
        while (s<=e){
            if(mid*mid==a){
                 return mid;
            }
            else if(mid*mid<a){
                ans=mid;
                s=mid+1;
            }
            else {
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }

    private static int[] findFirstAndLastOccurrence(int[] arr,int target) {
//        for left part
        int  s1=0,e1=arr.length-1;
        int mid1= s1+(e1- s1)/2;
        int ans[]=new int[2];//we wil pass the indexes in an array
        int ans1=-1;
        while ( s1<=e1){
            if(target==arr[mid1]){
                ans1=mid1;
                e1=mid1-1;
            }
            else if(target<arr[mid1]){
                e1=mid1-1;
            }
            else {
                 s1=mid1+1;
            }
            mid1= s1+(e1- s1)/2;
        }
        ans[0]=ans1;

        //for right part
        int s2=0,e2=arr.length-1;
        int mid2=s2+(e2-s2)/2;
        int ans2=-1;
        while(s2<=e2){
            if(target==arr[mid2]){
                ans2=mid2;
                s2=mid2+1;
            }
            else if(target<arr[mid2]){
                e2=mid2-1;
            }
            else {
                s2=mid2+1;
            }
            mid2=s2+(e2-s2)/2;
        }
        ans[1]=ans2;

        return ans;
    }
}
