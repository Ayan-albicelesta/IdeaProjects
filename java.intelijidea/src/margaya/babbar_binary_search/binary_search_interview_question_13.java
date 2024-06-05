package margaya.babbar_binary_search;

public class binary_search_interview_question_13 {
    public static void main(String[] args) {
        //search stating and ending index of an element and also find total number the element present in that array
        int arr[]={1,2,2,2,2,2,3,9};
        int key=2;
        int left=leftsearchInArr(arr,key);
        int right=rightsearchInArr(arr,key);
        System.out.println(left+" "+right);
       //SearchInArr(arr,key);-->bad code complexity O(n^2)

        //number of elements
        if(left>0 && right>0){
        System.out.println(right-left+1);}
        else if(left==right && left>0){
            System.out.println(1);
        }
        else if(left<0 && right<0){
            System.out.println(-1);
        }


        //find peak element in mountain array
        // int arr[]={1,3,7,9,11,55,222,90};
        // findPeakelement(arr);

    }

     private static void findPeakelement(int[] arr) {
        int s=0; int e=arr.length-1;
        int mid=s+(e-s)/2;
        while (s<e){
            if(arr[mid]>=arr[mid+1]){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        System.out.println(arr[mid]);
    }

    private static int rightsearchInArr(int[] arr, int key) {
        int ans=-1;
        int s=0;int e=arr.length-1;
        int mid=s+(e-s)/2;
        while (s<=e){
            if(key==arr[mid]){
                ans=mid;
                s=mid+1;
            }
            else if(key>arr[mid]){
                s=mid+1;
            }
            else {
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }

    private static int leftsearchInArr(int[] arr, int key) {
        int ans=-1;
        int s=0;int e=arr.length-1;
        int mid=s+(e-s)/2;
        while (s<=e){
            if(key==arr[mid]){
                ans=mid;
                e=mid-1;
            }
            else if(key>arr[mid]){
                s=mid+1;
            }
            else {
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }


    //this is bad code complexity O(n^2)
    private static void SearchInArr(int[] arr, int key) {
        int s=0; int e=arr.length-1;
        int mid=s+(e-s)/2;
        while (s<=e){
            if(key==arr[mid]){
                int mid1=mid;
                while (mid1!=-1 && arr[mid1]==key){
                    mid1--;
                }
                System.out.println(mid1+1);
                int mid2=mid;
                while (mid2!=arr.length && key==arr[mid2]){
                    mid2++;
                }
                System.out.println(mid2-1);
                return;
            }
            if(key>mid){
                s=mid+1;
            }
            else {
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
    }
}
