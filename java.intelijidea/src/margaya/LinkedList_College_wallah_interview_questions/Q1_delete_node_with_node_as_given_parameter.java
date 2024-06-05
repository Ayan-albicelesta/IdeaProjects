package margaya.LinkedList_College_wallah_interview_questions;


public class Q1_delete_node_with_node_as_given_parameter {
    Node head=null;
    Node tail=null;
    int size=0;
    public  class  Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static void main(String[] args) {
        Q1_delete_node_with_node_as_given_parameter ob=new Q1_delete_node_with_node_as_given_parameter();
        ob.append(10);
        ob.append(20);
        ob.append(30);
        ob.append(40);
        ob.append(50);
        ob.printlist();


        System.out.println("\t");
        ob.deleteGivenNode(ob.head.next.next);
        ob.printlist();

        System.out.println("\t");
        System.out.println(ob.head.data);




    }

    public void append(int data) {
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            size++;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        size++;
    }

    public void printlist(){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data+" -> ");
            ptr=ptr.next;
        }
        System.out.println("end");
    }

    private void deleteGivenNode(Node temp){
        temp.data=temp.next.data;
        temp.next=temp.next.next;
    }


}
