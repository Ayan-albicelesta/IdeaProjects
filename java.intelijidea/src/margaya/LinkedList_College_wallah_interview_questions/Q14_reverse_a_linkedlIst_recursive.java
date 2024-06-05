package margaya.LinkedList_College_wallah_interview_questions;

public class Q14_reverse_a_linkedlIst_recursive {
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
        Q14_reverse_a_linkedlIst_recursive ob=new Q14_reverse_a_linkedlIst_recursive();
        ob.insertend(3);
        ob.insertend(5);
        ob.insertend(4);
        ob.insertend(1);
        ob.insertend(2);


//        ob.reverse(ob.head);
        ob.printList();
    }

    private void reverse(node headd) {

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
