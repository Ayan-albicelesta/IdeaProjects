package margaya.Stack_sandeep_jain;

public class stack2_linkedlist_implementation {
    mystack top;//this is head;
    int size;
    class mystack{
       mystack next;
       int data;
       mystack(int data){
           this.data=data;
           this.next=null;
       }
    }

    public static void main(String[] args) {
         stack2_linkedlist_implementation obj=new stack2_linkedlist_implementation();
         obj.peek();
        System.out.println(obj.isEmpty());
         obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60);

        obj.pop();
        System.out.println(obj.peek());
        System.out.println(obj.size);

        System.out.println("\t");
        obj.printStack();

    }

    public  void  push(int data){
         mystack newnode=new mystack(data);
        if(top==null){
             top=newnode;
             size++;
             return;
        }
        newnode.next=top;
        top=newnode;
        size++;
    }

    public int pop(){
        if(top==null){
            System.out.println("underflow, no node to delete");
            return Integer.MIN_VALUE;
        }
        int res=top.data;
        top=top.next;
        size--;
        return res;
    }

    public int peek(){
        if(top==null){
            System.out.println("no element in stack");
            return Integer.MIN_VALUE;
        }
        return top.data;
    }

   public boolean isEmpty(){
        return top==null;
    }

    public void printStack(){
        mystack ptr=top;
        while (ptr!=null){
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
    }





}
