package margaya.LinkedList_College_wallah;

public class basic_LL_lecture_51 {
    public  static class  Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);// 10 20 30 40

        //now connecting the nodes manually
        System.out.println(a.next);//null
        System.out.println(b);//node1@58372a00

        a.next=b;//10->20 30 40
        //now the value of a.next and b is same
        System.out.println(a.next);//node1@58372a00
        System.out.println(b);//node1@58372a00

        b.next=c;//10->20->30 40
        c.next=d;//10->20>30->40

        //printing the values manually
        System.out.println(a.data);
        System.out.println(a.next.data);//or b.data
        System.out.println(a.next.next.data);//or c.data
        System.out.println(a.next.next.next.data);//or d.data


        //printing the values
        Node temp=a;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("end");


        //printing the values recursively
        System.out.println("displaying recursively");
        displayNodes(a);


        //find length
        int len=findLengthOfList(a);
        System.out.println("length of the list is "+ len);

    }

    private static int findLengthOfList(Node head) {
        int count=0;
        while (head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    private static void displayNodes(Node head) {
        if(head==null){
            return;
        }
        System.out.println(head.data);
        displayNodes(head.next);
    }
}
