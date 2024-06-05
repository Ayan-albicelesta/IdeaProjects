package margaya.Stack_pepcoding;

import java.util.Scanner;
import java.util.Stack;

public class Q3_balanced_brackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        Stack<Character> obj=new Stack<>();

        boolean ans=blancedParenthesis(input,obj);
        System.out.println(ans);
    }

    private static boolean blancedParenthesis(String input, Stack<Character> obj) {
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);

            if(ch=='(' || ch=='{'|| ch=='['){
                obj.push(ch);
            }
            else if(ch==')' || ch=='}'|| ch==']'){
                if(obj.isEmpty()){
                    return false;
                }
                else if(ifMatched(ch,obj.peek())){
                    obj.pop();
                }
                else {
                    return false;
                }
            }
        }


        if(obj.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }

    private static boolean ifMatched(char ch,char peek) {
        if((ch==')' && peek=='(') || (ch=='}' && peek=='{') || ch==']' && peek=='['){
            return true;
        }
        else {
            return  false;
        }
    }
}
