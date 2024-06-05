package margaya.LinkedList_College_wallah;

public class basic_implementation_LL_lecture_51 {
    //here the functions are inside Node class
    /*static Node head=null;
    static Node tail=null;
    static int size=0;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        Node(){}//explicitly invoing
           void insertAtEnd(int data) {
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                tail=newnode;
                size++;
                return;
            }
            tail.next=newnode;
            tail=newnode;
            size++;
        }
    }

    public static void main(String[] args) {
        Node ob=new Node();//we heve to explicitly invoke the zero argument Node() constructor, as the functions are inside Node class and we have to use the reference of it in order to use function
        ob.insertAtEnd(10);
        ob.insertAtEnd(20);
        ob.insertAtEnd(30);
        ob.insertAtEnd(40);
        ob.insertAtEnd(50);
        printValuesList(head);
        System.out.println(size);
    }

    private static void printValuesList(Node head){
        while (head!=null){
            System.out.print(head.data+"-");
            head=head.next;
        }
        System.out.println("end");
    }*/



    //here head,tail,size are initialized globally but the functions are inside linledlist class
    /*static Node head=null;
    static Node tail=null;
    static int size=0;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public static class Linkedlist{
        void insertAtEnd(int data) {
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                tail=newnode;
                size++;
                return;
            }
            tail.next=newnode;
            tail=newnode;
            size++;
        }
    }


    public static void main(String[] args) {
        Linkedlist ob=new Linkedlist();
        ob.insertAtEnd(10);
        ob.insertAtEnd(20);
        ob.insertAtEnd(30);
        ob.insertAtEnd(40);
        ob.insertAtEnd(50);
        printValuesList(head);
        System.out.println(size);
    }

    private static void printValuesList(Node head) {
        while (head!=null){
            System.out.print(head.data+"-");
            head=head.next;
        }
        System.out.println("end");
    }*/


    //here all head,tail,size and also the functions are initialized in linkedlist class
    /*public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public static class Linkedlistt{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int data) {
           Node newness=new  Node(data);
            if(head==null){
                head=newness;
                tail=newness;
                size++;
                return;
            }
            tail.next=newness;
            tail=newness;
            size++;
        }

        void printValuesList() {
             Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+"-");
                temp=temp.next;
            }
            System.out.println("end");
        }
    }


    public static void main(String[] args) {
       Linkedlistt ob=new Linkedlistt();
        ob.insertAtEnd(10);
        ob.insertAtEnd(20);
        ob.insertAtEnd(30);
        ob.insertAtEnd(40);
        ob.insertAtEnd(50);
        ob.printValuesList();
        System.out.println(ob.size);
    }*/



     //here head,tail,size are global variable, and functions are inside of the parent class, we could have made functions static here
       /*Node head=null;
        Node tail=null;
        int size=0;
        public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public static void main(String[] args) {
        basic_implementation_LL_lecture_51 ob=new basic_implementation_LL_lecture_51();
        ob.insertAtEnd(10);
        ob.insertAtEnd(20);
        ob.insertAtEnd(30);
        ob.insertAtEnd(40);
        ob.insertAtEnd(50);
        ob.printValuesList();
        System.out.println(ob.size);
        ob.insertAtEnd(100);
        ob.printValuesList();
    }
    private  void insertAtEnd(int data) {
        Node newnode=new  Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            size++;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        size++;
    }

     private void printValuesList() {
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"-");
            temp=temp.next;
        }
        System.out.println("end");
    }*/




    //now let see some other operations

   /* public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public static class Linkedlistt{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int data) {
           Node newness=new  Node(data);
            if(head==null){
                head=newness;
                tail=newness;
                size++;
                return;
            }
            tail.next=newness;
            tail=newness;
            size++;
        }

        void insertAtFirstList(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
                size++;
                return;
            }
            newnode.next=head;
            head=newnode;
            size++;
        }

        void insertAfterGivenIndex(int index,int data){
            if(index==0){
                insertAtFirstList(data);
                size++;
                return;
            }
            else if(index==size){
                insertAtEnd(data);
                size++;
                return;
            }
            else if(index<0 || index>size){
                System.out.println("wrong index given");
                return;
            }
            //for upper cases we have to handle them


            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
                size++;
                return;
            }
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
            size++;
        }

        int getInGivenIndex(int index){
            if(index<0 || index>size){
                System.out.println("wrong index given");
                return -1;
            }
            Node ptr=head;
            for(int i=0;i<index;i++){
                ptr=ptr.next;
            }
            return ptr.data;
        }

        void deleteAtgivenIndex(int index){
            if(index==0){
                head=head.next;
                size--;
                return;
            }
            else if(index<0 || index>=size){
                System.out.println("wrong index given");
                return;
            }

            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }



        void printValuesList() {
             Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("end");
        }
    }


    public static void main(String[] args) {
       Linkedlistt ob=new Linkedlistt();
        ob.insertAtEnd(10);
        ob.insertAtEnd(20);
        ob.insertAtEnd(30);
        ob.insertAtEnd(40);
        ob.insertAtEnd(50);
        ob.printValuesList();
        System.out.println("size is "+ob.size);

        System.out.println("\t");
        ob.insertAtFirstList(-100);
        ob.insertAtFirstList(-200);
        ob.printValuesList();

        System.out.println("\t");
        ob.insertAfterGivenIndex(6,900);
        ob.printValuesList();

        System.out.println("\t");
        int ans= ob.getInGivenIndex(60);
        System.out.println(ans);


        System.out.println("\t");
        ob.deleteAtgivenIndex(6);
        ob.printValuesList();
        System.out.println("size is "+ob.size);


    }*/

}

