package margaya.Stack_love_babbar;

import java.util.Stack;

public class lecture_54_insert_an_element_at_its_bottom {
    public static void main(String[] args) {
        Stack<Integer> obj=new Stack<>();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);

        int s=obj.size();
        int element=90;
        insertAtBottom(obj,s,0,90);
        int newSize=obj.size();

        for(int i=0;i<newSize;i++){
            System.out.println(obj.peek());
            obj.pop();
        }
    }

    private static void insertAtBottom(Stack<Integer> obj, int size,int start,int element) {
        if(start==size){
            obj.push(element);
            return;
        }
        int x=obj.pop();
        insertAtBottom(obj,size,start+1,element);
        obj.push(x);
    }
}
