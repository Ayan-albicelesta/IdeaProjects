package margaya.LinkedList_College_wallah_interview_questions;

public class Q13_remove_duplicates_from_linkedlist {
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
        Q13_remove_duplicates_from_linkedlist ob=new Q13_remove_duplicates_from_linkedlist();
        ob.insertend(1);
        ob.insertend(1);
        ob.insertend(1);
        ob.insertend(2);
        ob.insertend(2);
        ob.insertend(15);
        ob.insertend(15);
        ob.insertend(15);
        ob.insertend(23);
        ob.insertend(87);
//        ob.insertend(23);

        ob.removeDuplicates(ob.head);


//        node ptr= ob.head;
//        while (ptr!=null){
//            System.out.print(ptr.data+" ");
//            ptr=ptr.next;
//        }
//        System.out.println("end");
        ob.printList();
    }

    private void removeDuplicates(node headd) {

         node temp=headd;
         while (temp.next!=null){
             if(temp.data!=temp.next.data){
                 temp=temp.next;
                 continue;
             }
             node ptr=temp;
             while (ptr.data==ptr.next.data){
                 ptr=ptr.next;
             }
             temp.next=ptr.next;
             temp=temp.next;
         }
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
