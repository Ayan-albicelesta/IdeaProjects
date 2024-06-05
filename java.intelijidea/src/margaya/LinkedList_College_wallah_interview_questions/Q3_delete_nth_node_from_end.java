package margaya.LinkedList_College_wallah_interview_questions;

public class Q3_delete_nth_node_from_end {
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
        Q3_delete_nth_node_from_end  ob=new Q3_delete_nth_node_from_end ();

        //this is for basic knowledge
         // Node x=new Node(78);-->//VVI-->this is how to create object for inner static class
          Q3_delete_nth_node_from_end.Node y= ob.new Node(90);//vvi-->this is how to create object for inner non static class


        ob.append(10);
        ob.append(20);
        ob.append(30);
        ob.append(40);
        ob.append(50);
        ob.printlist();

        ob.printlist();

        System.out.println("\t");
        int size=ob.sizeofList();


        ob.returnGivenLastIndexNode2(ob.head,5);
        System.out.println("after deleting the node from last");
        ob.printlist();

    }

    private  void returnGivenLastIndexNode2( Node temphead, int index) {
         if(index==sizeofList()){
             this.head=temphead.next;//***VVI***-->understanf this line
             return;
         }
         Node fast=head,slow=head;
         Node prevSlow=null;
        for(int i=0;i<index;i++){
            fast=fast.next;
        }
        while (fast!=null){
            prevSlow=slow;
            slow=slow.next;
            fast=fast.next;
        }
        prevSlow.next=prevSlow.next.next;//handled exception for beginning node at first
    }

    public  Node returnGivenLastIndexNode( Node head, int size, int lastIndex){
        if(lastIndex>size){
            System.out.println("wrong index given");
            return null;
        }

        for(int i=0;i<=size-lastIndex-1;i++){
            head=head.next;
        }
        return head;
    }


    public  int sizeofList(){
        Node ptr=head;
        int count=0;
        while (ptr!=null){
            count++;
            ptr=ptr.next;
        }
        return count;
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
