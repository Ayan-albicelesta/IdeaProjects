package margaya.pepcoding_recursion;

public class find_maximum_in_array {
    public static void main(String[] args) {
        int arr[]={20,45,-9,90,46,456,-5,10};
         int ans=findMax(arr,0);
        System.out.println(ans);
    }

    private static int findMax(int[] arr,int index) {
        if(index==arr.length-1){
            return arr[index];
        }
         int max= findMax(arr,index+1);

        return  Math.max(max,arr[index]);
    }
}
