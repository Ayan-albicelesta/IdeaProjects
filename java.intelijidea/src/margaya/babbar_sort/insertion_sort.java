package margaya.babbar_sort;

public class insertion_sort {
    public static void main(String[] args) {
        int arr[]={76,-3,3,-34,119};
        selectionSort(arr);
        for(int i:arr){
            System.out.println(i+" ");
        }
    }

    private static void selectionSort(int[] arr) {

        for(int i=0;i<arr.length;i++){
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
               int temp=arr[j];
               arr[j]=arr[j-1];
               arr[j-1]=temp;
               j--;
            }
        }
    }
}
