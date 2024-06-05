package margaya.Stack_pepcoding;

import java.util.Scanner;
import java.util.Stack;

public class Q2_duplicate_bracket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();

        Stack<Character> obj=new Stack<>();
        boolean ans=diplicateOrNot(obj,input);
        System.out.println(ans);
    }

    private static boolean diplicateOrNot(Stack<Character> obj,String input) {
        //way 1
        /*for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch==')' && obj.peek()=='('){
                return true;
            }
            if(ch!=')'){
                obj.push(ch);
            }
            else {
                while (obj.peek()!='('){
                    obj.pop();
                }
                obj.pop();
            }
        }
        return false;*/

        //way 2
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch != ')'){
                obj.push(ch);
            }
            else {
                if(obj.peek()=='('){
                    return true;
                }
                while (obj.peek()!='('){
                    obj.pop();
                }
                obj.pop();
            }
        }
        return  false;
    }
}
