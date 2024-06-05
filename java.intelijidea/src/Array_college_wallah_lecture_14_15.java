import java.util.*;
public class Array_college_wallah_lecture_14_15{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//       <---- these codes from lecture 14 ---->


        //2d array
        /*int arr[][]={{1,26,7},{1},{33,-9,56,67}};//this is jagged array which has 3 rows,that means in this 2d array 3 inner 1d array is present
        //printing 2d array
        for(int i=0;i<arr.length;i++){  //here i=3
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/



        //sum of all elements in an array
        /* System.out.println("take length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("take input");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of all elements is "+sum); */



        //max value in an array
        /*System.out.println("take length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("take input");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("max num is "+max);*/




        //search element in array
        /*System.out.println("take length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("take input");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("give number to search");
        int imposter=sc.nextInt();
        //search
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            if(imposter==arr[i]) {
//                System.out.println(imposter + " is present in " + i + " index");
//                break;
//            }
//            count++;//notice count++ must be written after if codition,suppose count++ was above if condition,so there element present at last index would have printed both
//        }
//        if(count==arr.length){
//            System.out.println(-1);
//        }

        //another way
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(imposter==arr[i]){
                ans=i;
                break;
            }
        }
        System.out.println(ans);*/




 //       <---- these codes from lecture 15 ---->

        //.clone(), shallow copy and deep copy
        int arr[]={1,5,3};
        int arr2[]=arr;
        //we know in above example if an array copied from another array then any changes made via any array,will also change another array,this is shallow copy
        //in shallow copy no new memory is created,instead both point to the same memory

        //to avoid this shared memory we use .clone()
        int arr3[]={3,4,5,6};
        int arr4[]=arr3.clone();
        //this will allocate new heap memory with the same value,so no array can't change the another array




        //count the number of occurrence
        /*System.out.println("take length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("take input");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("give the number");
        int target=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                count++;
            }
        }
        System.out.println(target+" is present "+count+" times");*/




        //last occurance of an element
        /*System.out.println("take length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("take input");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("give number to search");
        int imposter=sc.nextInt();
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(imposter==arr[i]){
                ans=i;
            }
        }
        System.out.println(imposter+"'s last occurance is at index "+ans);*/




        //count the number of elements trictly greater than value x
        /*System.out.println("take length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("take input");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("give number to search");
        int imposter=sc.nextInt();
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(imposter<arr[i]){
                 count++;
            }
        }
        System.out.println("ans is "+count);*/



        //if an array is sorted or not
        /*System.out.println("take length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("take input");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

//        int count=0;
//        for(int i=0;i<arr.length-1;i++){  //**VVI**-->here we are making 1 less comparision to avoid array index out of bound exceptioin
//            if(arr[i]<arr[i+1]){
//                count++;
//            }
//        }
//        if(count==arr.length-1){
//            System.out.println("array is sorted");
//        }
//        else {
//            System.out.println("not sorted");
//        }
        //another way
        boolean check=true;
        for(int i=0;i<arr.length-1;i++){  //**VVI**-->here we are making 1 less comparision to avoid array index out of bound exceptioin
            if(arr[i]>arr[i+1]){
                check=false;
                break;
            }
        }
        System.out.println(check);//true means sorted and false means false*/



        //return an array consist of smallest and largest element in an array
        /*System.out.println("take length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("take input");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //new array
//        int newarr[]=new int[2];//size two as only consist smallest and largest element
//        int max=arr[0];
//        int min=arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        newarr[0]=min;
//        newarr[1]=max;
//
//        for(int i:newarr){
//            System.out.print(i+" ");
//        }

        //another way
        Arrays.sort(arr);//this will sort the acctual array
        int newarr[]=new int[2];
        newarr[0]=arr[0];
        newarr[1]=arr[arr.length-1];

        for(int i:newarr){
            System.out.print(i+" ");
        }*/



    }
}
