package margaya.LinkedList_College_wallah_interview_questions;

public class Q6_delete_middle_of_the_linkedlist {
    Node head=null;
    public  class  Node{
        int data;
         Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static void main(String[] args) {
        Q6_delete_middle_of_the_linkedlist ob=new Q6_delete_middle_of_the_linkedlist();
        ob.append(10);
        ob.append(20);
        ob.append(30);
        ob.append(40);
        ob.append(50);
        ob.append(60);
        ob.printlist();

        ob.deleteMiddleOfList(ob.head);
        System.out.println("\t");
        ob.printlist();
    }
    private void deleteMiddleOfList(Node head) {
         Node fast=head;
         Node slow=head;
         Node prevSlow=null;
        while (fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            prevSlow=slow;
            slow=slow.next;
        }

        if(slow.next==null ){
            this.head=null;
            return;
        }
        else if(slow.next.next==null){
            this.head=head.next;
        }
        else {
            prevSlow.next=prevSlow.next.next;
        }
    }

    public void append(int data) {
         Node newnode=new  Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        //here we are not using tail
         Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    public void printlist(){
         Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+" -> ");
            ptr=ptr.next;
        }
        System.out.println("end");
    }
}
