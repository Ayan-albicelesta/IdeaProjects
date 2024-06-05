package margaya.LinkedList_College_wallah_interview_questions;



//in this code whatever we are doing, we are not using tail,and size to calculate basic things, just using head
public class Q2_find_nth_node_from_end  {
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
        Q2_find_nth_node_from_end ob=new Q2_find_nth_node_from_end();
        ob.append(10);
        ob.append(20);
        ob.append(30);
        ob.append(40);
        ob.append(50);
        ob.printlist();

        ob.printlist();

        System.out.println("\t");
        int size=ob.sizeofList();

        //brute force way
        Node ans=ob.returnGivenLastIndexNode(ob.head,size,5);
        System.out.println("from optimised way");
        System.out.println(ans.data);

        System.out.println("\t");
        //optimised way-->using slow and fast pointer, optimised as we dont need size, so we don't have to terverse the whole list
        Node ans2=ob.returnGivenLastIndexNode2(ob.head,5);
        System.out.println("from optimised way");
        System.out.println(ans2.data);

    }

    private Node returnGivenLastIndexNode2(Node head, int index) {
        Node fast=head,slow=head;
        for(int i=0;i<index;i++){
            fast=fast.next;
        }
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public Node returnGivenLastIndexNode(Node head,int size,int lastIndex){
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
