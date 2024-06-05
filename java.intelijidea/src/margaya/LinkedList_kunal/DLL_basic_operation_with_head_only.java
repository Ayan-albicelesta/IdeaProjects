package margaya.LinkedList_kunal;

public class DLL_basic_operation_with_head_only {
    node head;
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
           DLL_basic_operation_with_head_only dll=new DLL_basic_operation_with_head_only();
           dll.insertAtLast(10);
           dll.insertAtLast(20);
           dll.insertAtLast(30);
           dll.insertAtLast(40);
           dll.insertAtLast(50);
           dll.insertAtLast(60);
           dll.printForward();


           System.out.println("\t");
           dll.push(11);
           dll.push(22);
           dll.push(33);
           dll.push(44);
           System.out.println("forward");
           dll.printForward();
           System.out.println("backward");
           dll.printBackward();


           System.out.println("\t");
           dll.atGivenIndex(111,3,dll.getLength());
           dll.atGivenIndex(222,4,dll.getLength());
           dll.printForward();


           System.out.println("\t");
           dll.afterGivenNode(dll.head.next.next.next,101);
           dll.afterGivenNode(dll.head.next.next.next.next,201);
           System.out.println("forward");
           dll.printForward();
           System.out.println("backward");
           dll.printBackward();
           System.out.println("size is "+dll.getLength());


           System.out.println("\t");
           dll.deleteFromFirst();
           dll.printForward();


           System.out.println("\t");
           dll.deleteFromLast();
           dll.printForward();

    }

    private void deleteFromLast() {
        if(head==null){
            System.out.println("no node to delete");
            return;
        }
        node ptr=head;
        node prev=null;
        while (ptr.next!=null){
            prev=ptr;
            ptr=ptr.next;
        }
        prev.next=null;
        ptr.prev=null;
    }

    private void deleteFromFirst() {
        if(head==null){
            System.out.println("no node to delete");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        head=head.next;
        head.prev=null;
    }

    public void push(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }

    public void insertAtLast(int data){
        node newnode=new node(data);
        if(head==null){
             head=newnode;
             return;
        }
        node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        newnode.prev=ptr;
        ptr.next=newnode;
    }

    public void atGivenIndex(int data,int index,int length){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
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
    }

    public void afterGivenNode(node target, int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
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
