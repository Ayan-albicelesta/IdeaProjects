package margaya.Stack_pepcoding;

import java.util.Stack;

public class Q6_largest_histogram_area {
    public static void main(String[] args) {
        int arr[]={6,2,5,4,5,1,6};

        int leftSmaller[]=new int[arr.length];
        Stack<Integer> ob=new Stack<>();



        int righSmaller[]=new int[arr.length];
        Stack<Integer> obj=new Stack<>();
        righSmaller[arr.length-1]=arr.length;
        obj.push(arr.length-1);

        for(int i=arr.length-2;i>=0;i--){
            while (!obj.isEmpty() && arr[i]<arr[obj.peek()]){
                obj.pop();
            }
            if(obj.isEmpty()){
                 righSmaller[i]=arr.length;
                 obj.push(i);
            }
            else {
                righSmaller[i]=obj.peek();
                obj.push(i);
            }
        }

        int maxArea=0;
        for(int i=0;i<arr.length;i++){
            int width=righSmaller[i]-leftSmaller[i]-1;
            int area=width*arr[i];
            if(area>maxArea){
                maxArea=area;
            }
        }
        System.out.println(maxArea);
    }
}
