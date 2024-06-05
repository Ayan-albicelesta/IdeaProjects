package margaya.college_wallah_binary_search;

import java.util.Scanner;

public class binary_search_on_answer_value_pattern_lecture_48 {
    public static void main(String[] args) {
       int arr[]={5,3,1,4,2};
       Scanner sc=new Scanner(System.in);
       int students=sc.nextInt();
       int ans=findMinimunOfMaximum(arr,students);
       System.out.println(ans);
    }

    private static int findMinimunOfMaximum(int[] arr, int students) {
        int sum=0;
        for(int i:arr){
            sum=sum+i;
        }
        int s=0,e=sum;
        int mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e){
            if(Ispossible(arr,students,mid)){
                ans=mid;
                e=mid-1;
            }
            else {
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }

    private static boolean Ispossible(int[] arr, int students, int mid) {
        int stud=1;int sum=0;
        for (int j : arr) {
            if (mid < j) {
                return false;
            }
            if (sum + j <= mid) {
                sum = sum + j;
            } else {
                stud++;
                sum = j;
            }
        }
        return stud <= students;
    }
}
