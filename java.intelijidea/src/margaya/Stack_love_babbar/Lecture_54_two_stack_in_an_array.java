package margaya.Stack_love_babbar;

import java.util.Scanner;

public class Lecture_54_two_stack_in_an_array {
    int capacity;
    int arr[];
    int top1=-1;
    int top2;

    class myStack{
         myStack(int c){
             capacity=c;
             arr=new int[capacity];
             top2=capacity;
         }
    }
    public static void main(String[] args) {
        Lecture_54_two_stack_in_an_array obj=new Lecture_54_two_stack_in_an_array();
        Scanner sc=new Scanner(System.in);
        System.out.println("take length of the stack");
        int n=sc.nextInt();
        Lecture_54_two_stack_in_an_array.myStack ob=obj.new myStack(n);//oops concept->creating object of a non-static inner class



        obj.pop1();
        System.out.println(obj.isEmpty());
        obj.push1(10);
        obj.push1(20);
        obj.push1(30);
        obj.push2(11);
        obj.push2(22);
        obj.push2(33);
        obj.push2(44);
        obj.push1(40);
        obj.push1(50);
        obj.push1(60);
        obj.pop1();
        obj.push2(111);
        System.out.println(obj.peak1());
        System.out.println(obj.peak2());
        System.out.println(obj.length());

        System.out.println("\t");
        obj.print1();
        obj.print2();


    }

    public void push1(int data){
        if(top2-top1==1){
            System.out.println("no space available to push");
            return;
        }
        top1++;
        arr[top1]=data;
    }

    public void push2(int data){
        if(top2-top1==1){
            System.out.println("no space available to push");
            return;
        }
        top2--;
        arr[top2]=data;
    }

    public int pop1(){
        if(top1==-1){
            System.out.println("underflow, can't remove element");
            return Integer.MIN_VALUE;
        }
        int res=arr[top1];
        top1--;
        return res;
    }

    public int pop2(){
        if(top2==capacity){
            System.out.println("underflow, can't remove element");
            return Integer.MIN_VALUE;
        }
        int res=arr[top2];
        top2++;
        return res;
    }

    public int peak1(){
        if(top1==-1){
            System.out.println("no element is present");
            return Integer.MIN_VALUE;
        }
        return arr[top1];
    }
    public int peak2(){
        if(top2==capacity){
            System.out.println("no element is present");
            return Integer.MIN_VALUE;
        }
        return arr[top2];
    }

    public int length(){
        return (capacity-top2)+(top1+1);
    }

    public boolean isEmpty(){
        return top2-top1== 1;
    }

    public void print1(){
        for(int i=0;i<=top1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void print2(){
        for (int i=capacity-1;i>=top2;i--){
            System.out.print(arr[i]+" ");
        }
    }

}
