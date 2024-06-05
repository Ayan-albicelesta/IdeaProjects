package margaya.Stack_sandeep_jain;

import java.util.Scanner;
class mystack{
    int  capacity;
    int top=-1;
    int arr[];
    mystack(int  c){
        this. capacity= c;
        arr=new int[c];
    }

    //we could have created all the functions in below class also by creating mystack class inside stack1_array_implementation class
    void push(int data){
        if(top+1==capacity){
            System.out.println("overflow, cannot add element");
            return;
        }
        top++;
        arr[top]=data;
    }
    int  pop(){
        if(top==-1){
            System.out.println("underflow, can't remove element");
            return Integer.MIN_VALUE;
        }
        int res=arr[top];
        top--;
        return res;
    }

    int peek(){
        if(top==-1 || top>= capacity){
            System.out.println("no element to return");
            return Integer.MAX_VALUE;
        }
        return arr[top];
    }
    int length(){
        return top+1;
    }

    boolean isEmpty(){
        return top==-1;
    }

    void printStackElement(){
        for(int i=0;i<length();i++){
            System.out.print(arr[i]+" ");
        }
    }

}


public class stack1_array_implementation {
    public static void main(String[] args) {
        System.out.println("give size of stack");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        mystack ob=new mystack(10);
        System.out.println(ob.isEmpty());
        System.out.println("\t");
        ob.pop();
        ob.push(10);
        ob.push(20);
        ob.push(30);
        ob.push(40);
        ob.push(50);
        ob.push(60);
        ob.push(70);
        ob.push(80);
        ob.push(90);
        ob.push(100);
        ob.push(30);
        ob.pop();
        System.out.println("\t");
        ob.printStackElement();

        System.out.println("\t");
        System.out.println(ob.peek());

        System.out.println("\t");
        System.out.println(ob.length());


    }

}
