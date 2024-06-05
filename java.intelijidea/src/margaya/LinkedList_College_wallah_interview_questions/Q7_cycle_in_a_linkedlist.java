package margaya.LinkedList_College_wallah_interview_questions;

public class Q7_cycle_in_a_linkedlist {
    Node head=null;
    public static class  Node{
        int data;
         Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static void main(String[] args) {
        Q7_cycle_in_a_linkedlist ob=new Q7_cycle_in_a_linkedlist();
        Node a=new Node(10); //  Q7_cycle_in_a_linkedlist.Node a= ob.new Node(10);-->could have written in this format if Node class was non static
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=e;//here we clearly see that it will create a loop
        boolean ans=ob.detectLoopInList(a);
        System.out.println(ans);

         //don't try to print, it will go on to infinity if cycle is present

    }

    private boolean detectLoopInList(Node a) {
         Node fast=a;Node slow=a;
          if(a==null ||a.next==null){
              return false;
          }
         while (fast!=null){
             if(fast.next==null){
                 return false;
             }
             fast=fast.next.next;
             slow=slow.next;
             if(fast==slow){
                 return true;
             }
         }
         return false;
    }

    public void printlist(Node head){
       Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+" -> ");
            ptr=ptr.next;
        }
        System.out.println("end");
    }
}
