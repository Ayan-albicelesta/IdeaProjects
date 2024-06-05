package margaya.LinkedList_College_wallah_interview_questions;

public class Q5_find_middle_of_linkedlist {
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
        Q5_find_middle_of_linkedlist ob=new Q5_find_middle_of_linkedlist();
        ob.append(10);
        ob.append(20);
        ob.append(30);
        ob.append(40);
        ob.append(50);
        ob.append(60);
        ob.printlist();

        Node ans=ob.LeftfindMiddleOfList(ob.head);
        System.out.println("left middle is "+ ans.data);

        System.out.println("\t");
        Node ans2=ob.rightMiddle();
        System.out.println("right middle is "+ans2.data);
    }

    private Node rightMiddle() {
            Node fast=head;Node slow=head;
            while (fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;
    }

    private Node LeftfindMiddleOfList(Node head) {
        Node fast=head;Node slow=head;
        while (fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public void append(int data) {
         Node newnode=new Node(data);
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
