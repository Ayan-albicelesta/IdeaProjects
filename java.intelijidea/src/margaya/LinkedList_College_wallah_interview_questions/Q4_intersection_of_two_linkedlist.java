package margaya.LinkedList_College_wallah_interview_questions;

public class Q4_intersection_of_two_linkedlist {
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
        Q4_intersection_of_two_linkedlist ob=new Q4_intersection_of_two_linkedlist();
        Q4_intersection_of_two_linkedlist ob2=new Q4_intersection_of_two_linkedlist();
        ob.append(10);
        ob.append(20);
        ob.append(30);
        ob.append(40);
        ob.append(50);
        ob.append(60);
        ob.printlist();

        System.out.println("\t");
        ob2.append(100);
        ob2.append(200);
        ob2.append(40);
        ob2.append(50);
        ob2.append(60);
        ob2.printlist();

        System.out.println("\t");
        int size1=ob.sizeofList();
        int size2=ob2.sizeofList();
        System.out.println("both head data of their respective nodes are");
        System.out.println(ob.head.data+" "+ob2.head.data);


        Node ans=findInterSection(ob.head,ob2.head);
        System.out.println("\t");
        System.out.println("intersection is "+ans.data);

        System.out.println("\t");
        ob2.printlist();
//        System.out.println(ob.head.data+" "+ob.head.next.data+" "+ob.head.next.next.data);
        ob2.manupulate(ob2.head);
        ob2.printlist2(ob2.head);
        System.out.println();
        ob2.printlist();
    }

    private void printlist2(Node head) {
        Node ptr=head;
        while (ptr!=null){
            System.out.print(ptr.data+"-->");
            ptr=ptr.next;

        }
    }

    private void manupulate(Node head) {
        Node ptr=head;
        while (ptr!=null){
            ptr.data=ptr.data*2;
            ptr=ptr.next;
        }
    }

    private static Node findInterSection(Node head1, Node head2) {
        int s1=sizeofTheList(head1);
        int s2=sizeofTheList(head2);

        System.out.println("\t");
        System.out.println("size of s1 and s2 is "+s1+" "+s2);

        Node temp1=head1;Node temp2=head2;
        if(s1>=s2){
            for(int i=0;i<s1-s2;i++){
                temp1=temp1.next;
            }
        }
        else {
            for(int i=0;i<s2-s1;i++){
                temp2=temp2.next;
            }
        }

        while (temp1.data!=temp2.data){
            temp2=temp2.next;
            temp1=temp1.next;
        }
        return temp2;
    }

    private static int sizeofTheList(Node head1) {
        int count=0;
        while (head1!=null){
            count++;
            head1=head1.next;
        }
        return count;
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
