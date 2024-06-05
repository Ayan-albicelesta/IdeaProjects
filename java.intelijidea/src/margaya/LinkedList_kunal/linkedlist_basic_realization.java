package margaya.LinkedList_kunal;

 public class linkedlist_basic_realization {
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
        linkedlist_basic_realization obj=new linkedlist_basic_realization();
        obj.insertAtLast(10);
        obj.insertAtLast(20);
        obj.insertAtLast(30);
        obj.insertAtLast(40);
        obj.insertAtLast(50);
        obj.insertAtLast(60);
        obj.printData();


        System.out.println("\t");
        node ans=obj.printFromNode(obj.head);
        node ptr=ans;
        while (ans!=null){
            System.out.print(ans.data+"-->");
            ans=ans.next;
        }
        System.out.println("end");//from this this is proved that if we pass a node in function
        // it is call by copy of the reference, not the original node, it can manupultae the list by changing the connection
        //but the reference in the argument ofn the function, is another pointer, that will also the same node, not the original
        //pointer


        System.out.println("\t");
        obj.printData();//see here the original list remained unchanged though,
    }

     private node printFromNode(node head) {
        head=head.next.next.next;
        return head;
     }

     public void insertAtLast(int data){
          node newnode =new  node(data);
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