package margaya.LinkedList_College_wallah_interview_questions;

public class  Q00_VVI_BASIC_HAVE_A_LOOK {
    //here head is static,every time we create new list, it will not create new head, instead they will be using the same static head.
    /* static node head;//here head is static so we will not be able to create two diffrent list with diffrent head, list will have same head
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        VVI_BASIC_HAVE_A_LOOK ob=new VVI_BASIC_HAVE_A_LOOK();
        ob.insertend(1);
        ob.insertend(3);
        ob.insertend(5);
        ob.insertend(7);
        ob.insertend(9);
        ob.printList();

        VVI_BASIC_HAVE_A_LOOK obj=new VVI_BASIC_HAVE_A_LOOK();
        obj.insertend(2);
        obj.insertend(4);
        obj.insertend(6);
        obj.insertend(8);
        obj.insertend(90);
        obj.printList();

        System.out.println("\t");
        obj.check(obj);
        System.out.println("in main head "+obj.head.data);//this will acctually change the head
        obj.printList();


        System.out.println("\t");
        ob.checkk(ob.head);//this will not change the acctual head as  we are not passing the entire object, we are just passing the head node
        System.out.println("in main head "+ob.head.data);
        ob.printList();



    }

    private void checkk(node head) {
         head=head.next.next;
        System.out.println("in function head "+head.data);
    }

    private void check(VVI_BASIC_HAVE_A_LOOK obj) {
        obj.head=obj.head.next.next.next;
        System.out.println("in function head "+head.data);
    }


    private static void printNewList(node temphead) {
        node ptr=temphead;
        while (ptr!=null){
            System.out.print(ptr.data+"-->");
            ptr=ptr.next;
        }
        System.out.println("end");
    }


    public void insertend(int data) {
        node newnode=new node(data);
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
    }*/

    //here head is non static , all created lists will create their own head, so we will avoid making the head static
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
        Q00_VVI_BASIC_HAVE_A_LOOK ob=new Q00_VVI_BASIC_HAVE_A_LOOK();
        ob.insertend(1);
        ob.insertend(3);
        ob.insertend(5);
        ob.insertend(7);
        ob.insertend(9);
        ob.insertend(10);
        ob.insertend(11);
        ob.printList();

        Q00_VVI_BASIC_HAVE_A_LOOK obj=new Q00_VVI_BASIC_HAVE_A_LOOK();
        obj.insertend(2);
        obj.insertend(4);
        obj.insertend(6);
        obj.insertend(8);
        obj.insertend(90);
        obj.printList();



        System.out.println("\t");
        obj.check(obj);
        System.out.println("in main head for obj here we are passing the entire object "+obj.head.data);//this will acctually change the head
        obj.printList();


        System.out.println("\t");
        ob.checkk(ob.head);//this will not change the acctual head as  we are not passing the entire object, we are just passing the head node
        System.out.println("in main head for ob "+ob.head.data);
        ob.printList();


        System.out.println("\t");
        ob.checkkkkk(ob.head);
        System.out.println("in main head for ob "+ob.head.data);
        ob.printList();




    }

    private void checkk(node head) {
        head.data=890;//this is working, it is actually making effect on the head;
        head=head.next.next;// this will not change the exect head of the linkedkist
        System.out.println("in function head "+head.data);
    }

    private void check(Q00_VVI_BASIC_HAVE_A_LOOK obj) {
        obj.head=obj.head.next.next.next;
        System.out.println("in function head "+head.data);
    }

    private  void checkkkkk(node head){
        head.next=head.next.next.next.next;
        System.out.println("in function head "+head.data);
    }



    private static void printNewList(node temphead) {
        node ptr=temphead;
        while (ptr!=null){
            System.out.print(ptr.data+"-->");
            ptr=ptr.next;
        }
        System.out.println("end");
    }


    public void insertend(int data) {
        node newnode=new node(data);
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
// https://chat.openai.com/share/f90e0e51-efd6-45c3-8bc3-a90d6d32b90f  //this is link of the summery of the second code(non static head) in gpt
/*In the provided code, the checkk method is unable to change the head to
 head.next.next because Java is a pass-by-value language for objects. When you pass an
 object to a method, the reference to the object is passed by value. This means that a copy of
 the reference to the object is created and passed to the method, not the actual object itself.

 Let's go through the checkk method and understand what happens step by step:

 1. private void checkk(node head): In this method, you pass the reference to the head node of the linked list.

 2.head.data = 890;: This statement modifies the data field of the head node, which
 works as expected. Since the reference to the actual head node was passed, any changes
 made to the node's properties will be reflected in the original linked list.

 3.head = head.next.next;: Here, you are updating the local reference head to point to
 the third node in the linked list (head.next.next). This change is local to the checkk
 method and does not affect the original head reference in the main method.

When the checkk method returns, the change made to the head reference is lost, and the original head reference in the main method remains unchanged.

On the other hand, in the check method:

1. private void check(VVI_BASIC_HAVE_A_LOOK obj): In this method, you pass the entire
 object obj, not just the head reference.

 2. obj.head = obj.head.next.next.next;: Here, you are updating the head reference
 of the object obj to point to the fourth node in the linked list
 (obj.head.next.next.next). Since you are modifying the head reference of the
 original object directly, this change will be visible in the main method.


 In summary, when you pass the entire object to the method (check method),
 you can change the head reference of the original object directly.
 But when you pass just the reference to the object (checkk method), any changes to the reference
 itself will not affect the original reference in the caller method.
 However, changes to the object properties through the passed reference will be reflected in the original object.*/
