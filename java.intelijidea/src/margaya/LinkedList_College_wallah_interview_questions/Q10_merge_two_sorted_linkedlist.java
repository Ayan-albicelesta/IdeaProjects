package margaya.LinkedList_College_wallah_interview_questions;

public class Q10_merge_two_sorted_linkedlist {
    node head;
  static   class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
         Q10_merge_two_sorted_linkedlist ob=new Q10_merge_two_sorted_linkedlist();
        ob.insertend(1);
        ob.insertend(6);
        ob.insertend(8);
        ob.insertend(17);
        ob.insertend(19);
        ob.insertend(100);
        ob.printList();

         Q10_merge_two_sorted_linkedlist obj=new Q10_merge_two_sorted_linkedlist();
        obj.insertend(2);
        obj.insertend(4);
        obj.insertend(66);
        obj.insertend(88);
        obj.insertend(90);
        obj.insertend(120);
        obj.printList();


        node head1=ob.head;
        node head2=obj.head;

         node st=new node(100);
         node temp=st;
        while(ob.head!=null && obj.head!=null){
             if(ob.head.data<obj.head.data){
                 temp.next=ob.head;
                 temp=temp.next;
                 ob.head=ob.head.next;
             }
             else {
                 temp.next=obj.head;
                 temp=temp.next;
                 obj.head=obj.head.next;
             }
        }
        if(ob.head==null){
            temp.next=obj.head;
        }
        if (obj.head==null){
            temp.next=ob.head;
        }

        System.out.println("print sorted list");
        node ptr=st.next;
        while (ptr!=null){
            System.out.print(ptr.data+"-->");
            ptr=ptr.next;
        }
        System.out.println("end");
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
