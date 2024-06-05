package margaya.pepcoding_recursion;

public class display_array_elements {
    public static void main(String[] args) {
        int arr[]={1,2,34,5,0};
        int StIndex=0;
        displayArray(arr,StIndex);

    }

    private static void displayArray(int[] arr,int st) {
        if(st==arr.length){
            return;
        }
        System.out.println(arr[st]);
        displayArray(arr,st+1);
    }
}
