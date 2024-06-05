package margaya.college_wallah_binary_search;

public class search_in_rotated_sorted_array_lecture_46 {
    public static void main(String[] args) {

        //SearchPivot
        int arr[]={8,11,2};
        int ans=searchPivot(arr);
        System.out.println("index of pivot is "+ans);

        //find element in a rotated and sorted array (duplicete element)
        /*int arr[]={1,1,1,1,6,8,90,1,1};
        int target=6;
        int ans=findddelement(arr,target);
        System.out.println("index of target element is "+ans);*/
    }

    private static int findddelement(int[] arr, int target) {
        int s=0;int e=arr.length-1;
        int mid=s+(e-s)/2;
        int ans=-1;
        while (s<=e){
            if(arr[mid]>arr[arr.length-1]) {
                s = mid + 1;
            }
            else {
                ans=mid;
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        int pivot=mid;
        System.out.println("index of poivot is "+pivot);
        if(target>=arr[pivot] && target<=arr[arr.length-1]){
            return searchElem(pivot,arr.length-1,arr,target);
        }
        else {
            return searchElem(0,pivot-1,arr,target);
        }
    }

    private static int searchElem(int s, int e, int[] arr, int target) {
        int mid=s+(e-s)/2;
        while (s<=e){
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
            else {
                e=mid-1;
            }
            mid=s+(e-s)-2;
        }
        return -1;
    }

    private static  int searchPivot(int[] arr) {
        int s=0;int e=arr.length-1;
        int mid=(e+s)/2;
        int ans=-1;
        while (s<e){
             if(arr[mid]>arr[0]){
                 s=mid+1;
             }
             else {
                 e=mid-1;
             }
            mid=(e+s)/2;
        }
        return mid;
    }
}
