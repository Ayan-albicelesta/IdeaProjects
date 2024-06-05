package margaya.kunal_recursion;

public class intro_to_recursion {
    public static void main(String[] args) {
        int arr[]={1,2,34,45,67,90};
        int target=67;
        int ans=binarySearch(arr,target,0,arr.length-1);
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr,int target, int s, int e) {
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
           return binarySearch(arr,target,s,m-1);
        }
        return binarySearch(arr,target,m+1,e);

    }
}
