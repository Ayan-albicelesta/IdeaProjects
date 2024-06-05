package margaya.LinkedList_kunal;

public class linkedlist_basic_implementation_with_head_only {
    node head;
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void main(String[] args) {
        linkedlist_basic_implementation_with_head_only obj=new linkedlist_basic_implementation_with_head_only();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60);
        obj.printData();


        obj.insertAtLast(100);
        obj.printData();
        System.out.println(obj.getLength());


        obj.afterGivenNode(obj.head.next.next.next,56);
        obj.afterGivenNode(obj.head.next.next.next.next,57);
        obj.printData();

        obj.atGivenIndex(790,2, obj.getLength());
        obj.atGivenIndex(791,3,obj.getLength());
        obj.printData();


        System.out.println("\t");


    }

    public void push(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
        return;
    }

    public void insertAtLast(int data){
        node newnode =new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        node ptr=head;
        while (ptr.next!=null){
            ptr=ptr.next;
        }
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
        ptr.next=newnode;
    }

    public void afterGivenNode(node target,int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        node ptr=head;
        while (ptr!=target){
            ptr=ptr.next;
        }
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

    public void printData(){
        if(head==null){
            System.out.println("no node available to print");
            return;
        }
        node ptr=head;
        while (ptr!=null){
            System.out.print(ptr.data+"-->");
            ptr=ptr.next;
        }
        System.out.println("end");
    }

}
