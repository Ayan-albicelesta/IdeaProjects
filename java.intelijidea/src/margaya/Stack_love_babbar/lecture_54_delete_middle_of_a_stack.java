package margaya.Stack_love_babbar;

import java.util.Stack;

public class lecture_54_delete_middle_of_a_stack {
    public static void main(String[] args) {
        Stack<Integer> obj=new Stack<>();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);

        int s=obj.size();
        deleteMiddle(obj,s,0);

        int s1=obj.size();//this size after deleting the middle
        System.out.println("after deleting the middle");
        for(int i=0;i<s1;i++){
            System.out.println(obj.peek());
            obj.pop();
        }
    }

    private static void deleteMiddle(Stack<Integer> obj, int size,int start) {
        if(start==size/2){
            obj.pop();
            return;
        }
        int x=obj.pop();
        deleteMiddle(obj,size,start+1);
        obj.push(x);
    }
}
