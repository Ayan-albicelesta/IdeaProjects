package margaya.LinkedList_College_wallah_interview_questions;

public class Q12_odd_even_linkedlist {
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
        Q12_odd_even_linkedlist ob=new Q12_odd_even_linkedlist();
        ob.insertend(3);
        ob.insertend(5);
        ob.insertend(4);
        ob.insertend(1);
        ob.insertend(2);
        ob.insertend(15);
        ob.insertend(13);
        ob.insertend(8);

        node ans=oddEvenList(ob);
        node ptr=ans;
        while (ptr!=null){
            System.out.print(ptr.data+"-->");
            ptr=ptr.next;
        }
    }

    private static node oddEvenList(Q12_odd_even_linkedlist ob) {

        Q12_odd_even_linkedlist.node temp1=ob.new node(1001);
        Q12_odd_even_linkedlist.node temp2=ob.new node(1000);
        node st1=temp1;
        node st2=temp2;

        while ( ob.head!=null){
            if( ob.head.data%2!=0){//for odd
                temp1.next= ob.head;
                temp1=temp1.next;
                 ob.head= ob.head.next;
            }
            else {
                temp2.next= ob.head;
                temp2=temp2.next;
                 ob.head= ob.head.next;
            }
        }
        temp1.next=st2.next;

         st1=st1.next;

         //without returning we can print the values also here
//         node ptr=st1;
//         while (ptr!=null){
//             System.out.print(ptr.data+"-->");
//             ptr=ptr.next;
//         }
//        System.out.println("end");

        return st1;

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
