package margaya.LinkedList_kunal;

public class DLL_basic_inplementation_with_head_tail_size {
     node head;
     node tail;
     int size;
    class node{
        int data;
         node next;
         node prev;
        node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }

    public static void main(String[] args) {
        DLL_basic_inplementation_with_head_tail_size ob=new DLL_basic_inplementation_with_head_tail_size();
        ob.insertAtLast(10);
        ob.insertAtLast(20);
        ob.insertAtLast(30);
        ob.insertAtLast(40);
        ob.insertAtLast(50);
        ob.insertAtLast(60);
        ob.printForward();
        ob.printBackward();


        System.out.println("\t");
        ob.push(11);
        ob.push(22);
        ob.push(33);
        ob.push(44);
        System.out.println("forward");
        ob.printForward();
        System.out.println("backward");
        ob.printBackward();


        System.out.println("\t");
        ob.atGivenIndex(111,3,ob.getLength());
        ob.atGivenIndex(222,4,ob.getLength());
        ob.printForward();


        System.out.println("\t");
        ob.afterGivenNode(ob.head.next.next.next,101);
        ob.afterGivenNode(ob.head.next.next.next.next,201);
        System.out.println("forward");
        ob.printForward();
        System.out.println("backward");
        ob.printBackward();
        System.out.println("size is "+ob.getLength());
        System.out.println("size is "+ob.size);


        System.out.println("\t");
        ob.deleteFromFirst();
        ob.printForward();


        System.out.println("\t");
        ob.deleteFromLast();
        ob.printForward();

    }

    private void deleteFromLast() {
        if(head==null){
            System.out.println("no node to delete");
            return;
        }
        tail=tail.prev;
        tail.next=null;
        size--;//these three line will do then same work for deletion last node, but by lossing the reference of the last node,
        //acctually we are not pointing the prev of the last node to null, with the prev pointer, it will be linked, but there will be no way
        //to access it, so there will bo non way to access to the last node, it won't be possible

//        node temp=tail;
//        tail=tail.prev;
//        tail.next=null;
//        temp.prev=null;
//        size--;//see in-comparison with the upper three lines here the prev of the last node is actually pointing to the null,
        // so here the last node is actually gets deleted from the memory
    }

    private void deleteFromFirst() {
        if(head==null){
            System.out.println("no node to delete");
            return;
        }
        if(head.next==null){
            head=tail=null;
            size--;
            return;
        }
//        node temp=head;
//        head=head.next;
//        head.prev=null;
//        temp.next=null;
//        size--;

        //these three lines do the same also
        head=head.next;
        head.prev=null;
        size--;

    }

    public void push(int data){
         node newnode=new node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            size++;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        size++;
    }

    public void insertAtLast(int data){
         node newnode=new  node(data);
        if(head==null){
            push(data);
            return;
        }
       tail.next=newnode;
       newnode.prev=tail;
       tail=newnode;
       size++;
    }

    public void atGivenIndex(int data,int index,int length){
         node newnode=new node(data);
        if(head==null){
             push(data);
             return;
        }
        if(index<0 || index>length+1){
            System.out.println("not posiible to add");
            return;
        }
         node ptr=head;
        if(index==0){
            push(data);
            return;
        }
        for(int i=0;i<index-2;i++){
            ptr=ptr.next;
        }
        newnode.next=ptr.next;
        ptr.next.prev=newnode;
        ptr.next=newnode;
        newnode.prev=ptr;
        size++;
    }

    public void afterGivenNode( node target, int data){
         node newnode=new node(data);
        if(head==null){
           push(data);
           return;
        }
         node ptr=head;
        while (ptr!=target){
            ptr=ptr.next;
        }
        ptr.next.prev=newnode;
        newnode.prev=ptr;
        newnode.next=ptr.next;
        ptr.next=newnode;
        size++;
    }
    public int getLength(){
        if(head==null){
            return 0;
        }
         node ptr=head;
        int count=0;
        while (ptr!=null){
            ptr=ptr.next;
            count++;
        }
        return count;
    }

    public void printForward(){
         node ptr=head;
        while (ptr!=null){
            System.out.print(ptr.data+"-->");
            ptr=ptr.next;
        }
        System.out.println("end");
    }

    public void printBackward(){
        if(head==null){
            System.out.println("nod node available ");
            return;
        }
         node tail=head;
        while (tail.next!=null){
            tail=tail.next;
        }

        while (tail!=null){
            System.out.print(tail.data+"-->");
            tail=tail.prev;
        }
        System.out.println("end");
    }
}
