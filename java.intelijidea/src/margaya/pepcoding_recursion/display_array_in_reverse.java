package margaya.pepcoding_recursion;

public class display_array_in_reverse {
    public static void main(String[] args) {
        int arr[]={1,-2,56,0,90,59,9};
//        displayArrayReverse(arr,arr.length-1);
        reverseAnotherway(arr,0);
    }

    private static void reverseAnotherway(int[] arr, int i) {
        if(i==arr.length-1){
            System.out.println(arr[i]);
            return;
        }
        reverseAnotherway(arr,i+1);
        System.out.println(arr[i]);
    }

    private static void displayArrayReverse(int[] arr, int index) {
        if(index<0){
            return;
        }
        System.out.println(arr[index]);
        displayArrayReverse(arr,index-1);
    }
}
