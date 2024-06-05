public class Recursion_question5_college_wallah_32 {
    public static void main(String[] args) {
        //print all values in an array
        /*//way1
        int arr[]={2,54,-4,0,35};
        System.out.println("by passing the first index");
        printAllArrayElements(arr,0);
        //way2
        System.out.println("by passing the last index");
        printAllArrayElements2(arr,arr.length-1);*/


        //find maximum value in an array
        /*int arr[]={3,10,3,60,50};
        //approach 1
        int element=arr[0];
        int ans=findMaxValue(arr,1,element);
        System.out.println("from approach1 "+ans);
        //approach 2
        int ans2=findMaxValue2(arr,0);
        System.out.println("from approach2 "+ans2);*/

        //find the sum of all elements in an array
        /*//way1
        int arr[]={2,3,5,20,1};
        int ans1=sumOfAllelemnts(arr,0,0);
        System.out.println("using approach1 "+ans1);
        //another way
        int ans2=sumOfAllelemnts2(arr,0,0);
        System.out.println("using approach2 "+ ans2);*/
    }


    private static int sumOfAllelemnts2(int[] arr, int index, int sum) {
        if(index==arr.length-1){
            return arr[index];
        }
        int ans=sumOfAllelemnts2(arr,index+1,sum);
        return sum=sum+arr[index]+ans;
    }

    private static int sumOfAllelemnts(int[] arr, int index,int sum) {
        if(index==arr.length){
            return sum;
        }
        sum=sum+arr[index];
        return sumOfAllelemnts(arr,index+1,sum);
    }

    private static  int findMaxValue2(int[] arr, int index) {
        if(index==arr.length-1){
            return arr[index];
        }

        int x= findMaxValue2(arr,index+1);
        if(arr[index]>=x){
            return arr[index];
        }
        else {
            return x;
        }

    }

    private static  int findMaxValue(int[] arr, int index,int element) {
        if(index==arr.length){
            return element;
        }
        if(element<=arr[index]){
            return findMaxValue(arr,index+1,arr[index]);
        }
        else {
            return findMaxValue(arr,index+1,element);
        }
    }


    private static void printAllArrayElements(int[] arr, int index) {
        if(index==arr.length){
            return;
        }
        System.out.println(arr[index]);
        printAllArrayElements(arr,index+1);
    }

    private static void printAllArrayElements2(int[] arr, int index) {
        if(index==0){
            System.out.println(arr[index]);
            return;
        }
        printAllArrayElements2(arr,index-1);
        System.out.println(arr[index]);
    }
}
