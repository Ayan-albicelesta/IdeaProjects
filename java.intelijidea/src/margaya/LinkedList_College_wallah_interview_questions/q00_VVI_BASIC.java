package margaya.LinkedList_College_wallah_interview_questions;

public class q00_VVI_BASIC {
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
        q00_VVI_BASIC obj=new q00_VVI_BASIC();
        obj.insertend(2);
        obj.insertend(4);
        obj.insertend(6);
        obj.insertend(8);
        obj.insertend(90);
        obj.printList();

        node prev=obj.head;
        obj.head=obj.head.next.next.next;
        obj.printList();

//        node temp=prev;
//        while (temp!=null){
//            System.out.print(temp.data+"-->");
//            temp=temp.next;
//        }

    }
    public void insertend(int data) {
        node newnode=new  node(data);
        if(head==null){
            head=newnode;
            newnode.next=null;
            return;
        }
         node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }


    public void printList(){
       node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("End");
    }

}
