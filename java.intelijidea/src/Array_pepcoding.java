import java.util.Scanner;

public class Array_pepcoding {

    
    public  static void main(String[] args) {
       

        Scanner sc=new Scanner(System.in);

        Array_pepcoding ob=new Array_pepcoding();
        //span of an array
        /*int n=sc.nextInt();
        int arr[]=new int[n];
        //input
        System.out.println("take input");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int ans=span(arr);
        System.out.println("span of the array is "+ans);*/


        //find element in an array
        /*int n=sc.nextInt();
        int arr[]=new int[n];
        //input
        System.out.println("take input");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("take the number to find from the arrray");
        int target=sc.nextInt();
        int ans=findelement(arr,target);
        System.out.println(ans);*/



        //bar chart
        /*int n=sc.nextInt();
        int arr[]=new int[n];
        //input
        System.out.println("take input");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //find maximum element
        int max=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        ob.printBar(arr,max);*/



        //sum of two array
        /*System.out.println("size of array 1");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("take input for array 1");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("size of array 2");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        System.out.println("take input for array 2");
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        sumofTwoArray(arr1,arr2);*/



        //diffrence of two arrays
        /*System.out.println("size of array 1");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("take input for array 1");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("size of array 2");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        System.out.println("take input for array 2");
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        diffrenceOfTwoarrays(arr1,arr2);*/




        //reverse an array
        /*int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("take input");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        rerverseArray(arr);
        System.out.println("print after reversing");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        */



        //inverse of an array
        /*int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("take input");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       int INVERSEDARRAY[]=inverseArray(arr);
        System.out.println("inversed array is");
        for(int i=0;i<INVERSEDARRAY.length;i++){
            System.out.print(INVERSEDARRAY[i]+" ");
        }*/


        //subarrays of an array
        /*int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("take input");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        subarray(arr);*/





    }

    //function for subarray of an array
    /*private static void subarray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }*/


    //function for-->inverse of an array
    /*private static int[] inverseArray(int[] arr) {
        int newarr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            newarr[temp]=i;
        }
        return newarr;
    }*/


    //function for-->reverse an array
    /*private static int[] rerverseArray(int[] arr) {
        int i=0;
        int j=arr.length-1;
//        while (i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
        for(int k=0;k<arr.length/2;k++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }*/


    //function for-->diffrence of two arrays
    /*private static void diffrenceOfTwoarrays(int[] arr1, int[] arr2) {
        int newarr[]=new int[arr1.length>arr2.length?arr1.length:arr2.length];
        int newArrLength=newarr.length;

        int i=arr1.length-1;
        int j= arr1.length-1;
        int carry=0;
        for(int k=newArrLength-1;k>=0;k--){
            int sum=0;
            if(carry+arr1[i]>=arr2[j]){
                sum=carry+arr1[i]-arr2[j];
                carry=0;
            }
            else {
                sum=carry+arr1[i]+10-arr2[j];
                carry=-1;
            }
            newarr[k]=sum;
            i--;
            j--;
        }

    }*/


    //function of-->sum of two array
    /*private static void sumofTwoArray(int[] arr1, int[] arr2) {

        int newarr[]=new int[arr1.length>arr2.length?arr1.length:arr2.length];//this is tricky,using ternary
        int newArrLength=newarr.length;

        int i=arr1.length-1;
        int j=arr2.length-1;
        int carry=0;
        for(int k=newArrLength-1;k>=0;k--){
             int sum=carry;
             if(i>=0){
                 sum=sum+arr1[i];
             }
             if(j>=0){
                 sum=sum+arr2[j];
             }
             carry=sum/10;// if greter than 9 then it will give the carry 1
             sum=sum%10;//if greter than 9 then it will give th raminder

            newarr[k]=sum;
            i--;
            j--;
        }
        if(carry!=0){
            System.out.print(carry+" ");
        }
        for(int num:newarr){
            System.out.print(num+" ");
        }
    }*/


    //function for-->bar chart
    /*private  void printBar(int[] arr, int max) {
        for(int floor=max;floor>=1;floor--){
            for(int j=0;j<=arr.length-1;j++){
                if(floor>arr[j]){
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        
    }*/


    // function for -->find element in an array
    /*private static int findelement(int[] arr,int target) {
        for(int i=0;i<=arr.length-1;i++){
            if(target==arr[i]){
               return i;
            }
        }
         return -1;
    }*/



    //function for -> span of an array
    /*private static int span(int[] arr) {
         int max=Integer.MIN_VALUE;
         int min=Integer.MAX_VALUE;

         int i=0;
         while (i<arr.length) {
             if(arr[i]>max)
             max=arr[i];
             if(arr[i]<min)
             min=arr[i];
             i++;
         }
         return max-min;
    }*/



}
