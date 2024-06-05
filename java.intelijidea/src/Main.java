
import java.util.Arrays;
import java.util.Scanner;

public class Main {
     Node head=null;
    public  static class  Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        a.next=b;
        b.next=null;
        System.out.println(b.next);
        System.out.println(a.next.next);
 //System.out.println(b.next.next);//-->whenever we try to access beyond null, it will give null pointer exception,in this case it will give exception
 //System.out.println(a.next.next.next);//-->this will give also null pointer exception
    }
}