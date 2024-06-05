package margaya.college_wallah_binary_search;

public class binary_search_problem2_lecture47 {
    public static void main(String[] args) {
//find element in 2D array-> integers are sorted in each row,
//and first number of each row is greater than the last integer of previous row
        /*int arr[][]={{1,3,5,7},{10,11,16,17},{23,30,37,56}};
        int target=56;
        boolean ans=findTargetIn2DArray(arr,target);
        System.out.println(ans);*/


 //find element in an array->each row is sorted and each column is also sorted
        /*int arr[][]={{2,4,5,7,43},
                     {3,9,15,19,53},   //-->written for better understanding
                     {5,17,21,23,60}};
        int target=60;
        boolean ans=findElementIn2DArray(arr,target);
        System.out.println(ans);*/

        //find peak element
        /*int arr[]={1,3,88,2,0,-1,8,9,34,45,67,78,90,100,4,2,0};
        //this array consist of two peak element, and the below code written give either one of two peaks
        int ans=findPeakkElement(arr);
        System.out.println("peak element is "+ans);*/
    }

    private static  boolean findElementIn2DArray(int[][] arr,int target) {
        int rowNumber=arr.length;int colNumber=arr[0].length;
        int i=0;int j=colNumber-1;
        while(i<arr.length && j>=0){
            if(target==arr[i][j]){
                return true;
            }
            else if(target>arr[i][j]){
                i++;
            }
            else {
                j--;
            }
        }
        return false;
    }

    private static boolean findTargetIn2DArray(int[][] arr, int target) {
        int rowNumber=arr.length;
        int colNumber=arr[0].length;
 //**VVI**-->to find the i and j in 2D array(where number of row is 'r' and number of col is 'c') of an element
 //and index of that element is 'x'(in imaginary 1D array) i=(x/c) and j=(x%c)

        int s=0;int e=rowNumber*colNumber-1;
        int mid=s+(e-s)/2;
        while (s<=e){
           int midElement=arr[mid/colNumber][mid%colNumber];
           if(target==midElement){
               return true;
           }
           else if(target>midElement){
               s=mid+1;
           }
           else {
               e=mid-1;
           }
           mid=s+(e-s)/2;
        }
        return false;
    }

    private static int findPeakkElement(int[] arr) {
        int s=0;int e=arr.length-1;
        int mid=s+(e-s)/2;
        while(s<=e){
            if(arr[mid]>arr[mid+1]){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        return  arr[mid];
    }

}
