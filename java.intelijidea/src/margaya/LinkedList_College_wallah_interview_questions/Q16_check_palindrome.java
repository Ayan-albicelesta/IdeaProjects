package margaya.LinkedList_College_wallah_interview_questions;

public class Q16_check_palindrome {
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
        Q16_check_palindrome ob=new Q16_check_palindrome();
        ob.insertend(1);
        ob.insertend(2);
        ob.insertend(3);
        ob.insertend(3);
        ob.insertend(2);
        ob.insertend(10);
        ob.printList();

        node middle=ob.leftMiddle();
        System.out.println(middle.data);

        ob.reverseFromMiddle(middle);
        ob.printList();

        boolean ans=ob.isPalindrome(middle);
        System.out.println(ans);
    }

    private  boolean isPalindrome(node middle) {
        node p1=head;
        node p2=middle.next;
        while (p2!=null){
            if(p1.data==p2.data){
                p1=p1.next;
                p2=p2.next;
            }
            else {
                return false;
            }
        }
        return true;
    }

    private void reverseFromMiddle(node middle) {
        node prev=null;
        node temp=middle.next;
        node fixed=temp;
        while (temp!=null){
            fixed=fixed.next;
            temp.next=prev;
            prev=temp;
            temp=fixed;
        }//at last prev will be the last node, fixed and temp will be null
        middle.next=prev;
    }

    private node leftMiddle() {
        node fast=head;
        node slow=head;
        while (fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
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
