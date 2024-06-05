package margaya.LinkedList_College_wallah_interview_questions;

public class Q15_reverse_a_linkedlist_iterative {
   node head;
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Q15_reverse_a_linkedlist_iterative ob=new Q15_reverse_a_linkedlist_iterative();
        ob.insertend(3);
        ob.insertend(5);
        ob.insertend(4);
        ob.insertend(1);
        ob.insertend(2);

        ob.printList();
        ob.reverse(ob);
        ob.printList();
    }

    private void reverse(Q15_reverse_a_linkedlist_iterative ob) {
        node prev=null;
        node temp=ob.head;
        while(ob.head.next!=null){
            ob.head=ob.head.next;
            temp.next=prev;
            prev=temp;
            temp=head;
        }
        temp.next=prev;

    }

    public void insertend(int data) {
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            newnode.next=null;
            return;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }


    public void printList(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("End");
    }
}
