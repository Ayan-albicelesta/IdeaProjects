package margaya.LinkedList_College_wallah_interview_questions;

public class Q8_Linkedlist_cycle_2 {
   Node head=null;
   public  static class  Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static void main(String[] args) {
        Q8_Linkedlist_cycle_2 ob=new Q8_Linkedlist_cycle_2();
         Node a=new  Node(10);
         Node b=new  Node(20);
         Node c=new  Node(30);
         Node d=new  Node(40);
         Node e=new  Node(50);
         Node f=new  Node(60);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=d;
        Node ans=returnCyclePoint(a);
        System.out.println(ans.data);
    }

    private static Node returnCyclePoint(Node a) {
       if (a==null || a.next==null){
           return null;
       }
       Node fast=a;Node slow=a;
       while (fast!=null){
           if(fast.next==null){
               return null;
           }
           fast=fast.next.next;
           slow=slow.next;
           if(slow==fast){
               Node temp=a;
               while (temp!=slow){
                   temp=temp.next;
                   slow=slow.next;
                   if(temp==slow){
                       return temp;
                   }
               }
           }
       }
       return null;
    }
}
