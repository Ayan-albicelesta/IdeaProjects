package margaya.Stack_pepcoding;

import java.util.Stack;

public class Q11_postfix_Expression {
    public static void main(String[] args) {
        String input="264*8/+3-";
        //convert this postfix to infix and prefix




        //this is not what in the question, question is to "convert this postfix to infix and prefix"
        int ans=MathematicalAnswer(input);
        System.out.println(ans);
    }

    private static int MathematicalAnswer(String input) {
        Stack<Integer> operand=new Stack<>();
        Stack<Character> operator=new Stack<>();

        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);

            //if character is digit
             if(Character.isDigit(ch)){
                 int n=ch-'0';
                 operand.push(n);
             }
             else if(ch=='*'||ch=='/'||ch=='+'||ch=='-'){
                 int y=operand.pop();
                 int x=operand.pop();
                 int ans=operation(x,y,ch);
                 operand.push(ans);
             }
        }
        return operand.peek();
    }

    public static int operation(int x,int y,char ch){
        if(ch=='-')
            return x-y;
        else if(ch=='+')
            return x+y;
        else if(ch=='*')
            return x*y;
        else
            return x/y;

    }
}
