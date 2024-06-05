package margaya.babbar_sort;

public class babbar_selection_sort {
    public static void main(String[] args) {
        int arr[]={64,25,12,22,11};
        SelectionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

//    private static void SelectionSort(int[] arr) {
//        for(int i=0;i<arr.length-1;i++){
//            int min=arr[i];int count=i;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j]<=min){
//                    min=arr[j];
//                    count=j;
//                }
//            }
//        int temp=arr[i];
//        arr[i]=arr[count];
//        arr[count]=temp;
//        }
//
//    }

    //see the upper code for better understanding,logic same,described more
    private static void SelectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int count=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[count]){
                    count=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[count];
            arr[count]=temp;
        }
    }



}
