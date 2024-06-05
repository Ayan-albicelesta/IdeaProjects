import java.util.Scanner;

public class Array_college_wallah_lecture_16_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//<----- ***** these problems from lecture 16 ***** ----->

        //pair sum
        /*System.out.println("take length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("take input");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("give target to find pair sum");
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){// i<arr.length-1, that will work also as,(i<arr.length) in this condition for i=arr.length, the j will not satisfy the condition to enter inner loop
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("pairs are "+arr[i]+" and "+arr[j]);
                }
            }

        }*/



        //triplet sum
        /*System.out.println("take length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("take input");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //find triplet
        System.out.println("give target");
        int count=0;
        int target=sc.nextInt();
        for(int i=0;i<arr.length-2;i++){ // i<arr.length;-->that will also work,as for last two comparision j,k will not satisfy the condition to enter their respective loops
            for(int j=i+1;j<arr.length-1;j++){ //
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]+" are making pair");
                        count++;
                    }
                }
            }
        }
        System.out.println("total triplets available to make "+target+" is "+count);*/



        //find unique element in an array where all other elements are repeated twice
        /*int arr[]={1,2,3,4,2,1,3,0};// 4 and 0 only unique

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==0){
                System.out.println(arr[i]);
            }
        }*/



        //find second largest
        /*//first find the largest element.
        int arr[]={0,-2,0,-3,0,-4};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //replace all the max values with Integer.MIN_VALUE.
        for(int i=0;i<arr.length;i++){
             if(max==arr[i]){
                 arr[i]=Integer.MIN_VALUE;
             }
        }
        //now find the largest element,which will give the second largest element actually
        int newmax=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>newmax){
                newmax=arr[i];
            }
        }
        System.out.println(newmax);*/



        //find first repeating value
        /*boolean check=false;
        int arr[]={1,5,3,4,6,3,4};
        for(int i=0;i<arr.length;i++){
             check=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    check=true;
                    break;
                }
            }
            if(check==true){
                System.out.println(arr[i]);
                break;
            }
        }
        if(check==false){
            System.out.println("no repeating value is present");
        }*/


//<----- ***** these problems from lecture 17 ***** ----->

        //reverse an array--here we not going to reverse the original array by swapping



        //rotate an array by "k" steps, where k is non-negetive
        /*//this is done by me
        int arr[]={11,22,33,44,55,111,222,333};
        System.out.println("rotete with");
        int rotate=sc.nextInt();
        rotate=rotate%arr.length;// in case the value of rotation is greater than the length of the length of the array , it will decrease the value under the length of the array
        int newarr[]=new int[arr.length];
        //first putting the roaated elements in new array
        int k=rotate;

        int index=0;
        for(int i=arr.length-k;i<arr.length;i++){
            newarr[index]=arr[i];
             index++;
        }
//        now place remaining elements to their position
        int k1=rotate;
        for(int i=0;i<arr.length-rotate;i++){
            newarr[k1]=arr[i];
            k1++;
        }
        //printing the newarray
        for(int i:newarr){
            System.out.print(i+" ");
        }*/



        //rotate an array by "k" steps, where k is non-negative without using extra space, hat means we have do operations on the original array
        /*int arr[]={1,2,3,4,5,6,7};
        System.out.println("rotete with");
        int rotate=sc.nextInt();
        rotate=rotate%arr.length;

        //rotate first part
        int i=0,j=arr.length-rotate-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        //rotate second part
        int m=arr.length-rotate,n=arr.length-1;
        while(m<n){
            int temp=arr[m];
            arr[m]=arr[n];
            arr[n]=temp;
            m++;
            n--;
        }
        //now rotate the whole array
        int p=0,q=arr.length-1;
        while(p<q){
            int temp=arr[p];
            arr[p]=arr[q];
            arr[q]=temp;
            p++;
            q--;
        }
        //print the array
        for(int k:arr){
            System.out.print(k+" ");
        }*/

 
       
    }
}
