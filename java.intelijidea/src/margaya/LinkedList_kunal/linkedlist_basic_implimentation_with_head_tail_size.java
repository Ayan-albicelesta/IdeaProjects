package margaya.LinkedList_kunal;

public class linkedlist_basic_implimentation_with_head_tail_size {
  Node head=null;
        Node tail=null;
        int size=0;
        public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public static void main(String[] args) {
        linkedlist_basic_implimentation_with_head_tail_size ob=new linkedlist_basic_implimentation_with_head_tail_size();
        ob.insertAtEnd(10);
        ob.insertAtEnd(20);
        ob.insertAtEnd(30);
        ob.insertAtEnd(40);
        ob.insertAtEnd(50);
        ob.insertAtEnd(100);
        System.out.println("size is "+ob.size);
        ob.printValuesList();

        System.out.println("\t");
        ob.push(11);
        ob.push(12);
        ob.push(13);
        ob.push(14);
        System.out.println("size is "+ob.size);
        ob.printValuesList();


        System.out.println("\t");
        ob.atGivenIndex(555,4,ob.size);
        ob.atGivenIndex(666,5, ob.size);
        System.out.println("size is "+ob.size);
        ob.printValuesList();


        System.out.println("\t");
        ob.afterGivenNode(ob.head.next,67);
        ob.afterGivenNode(ob.tail, 76);
        System.out.println("size is "+ob.size);
        ob.printValuesList();



    }
    public void push(int data){
      Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            size++;
            return;
        }
        newnode.next=head;
        head=newnode;
        size++;
        return;
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

    public void atGivenIndex(int data,int index,int length){
         Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            size++;
            return;
        }
        if(index<0 || index>length+1){
            System.out.println("not posiible to add");
            return;
        }
        Node ptr=head;
        if(index==0){
            push(data);
            return;
        }
        for(int i=0;i<index-2;i++){
            ptr=ptr.next;
        }
        newnode.next=ptr.next;
        ptr.next=newnode;
        size++;
    }

    public void afterGivenNode(Node target, int data){
       Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            size++;
            return;
        }
        if(target==tail){
            tail.next=newnode;
            tail=newnode;
            size++;
            return;
        }
        Node ptr=head;
        while (ptr!=target){
            ptr=ptr.next;
        }
        newnode.next=ptr.next;
        ptr.next=newnode;
        size++;
    }

     private void printValuesList() {
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("end");
    }
}
