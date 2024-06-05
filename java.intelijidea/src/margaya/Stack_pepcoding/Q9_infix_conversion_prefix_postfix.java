package margaya.Stack_pepcoding;

import java.util.Stack;

public class Q9_infix_conversion_prefix_postfix {
    public static void main(String[] args) {
        String input="a*(b-c)/d+e";//double digits are not allowed

        Stack<String > pref=new Stack<>();
        Stack<String > post=new Stack<>();
        Stack<Character> operator=new Stack<>();

        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);

            if(ch=='('){
                operator.push('(');
            }
            else if(ch==')'){
                while (operator.peek()!='('){
                    String  y=pref.pop();
                    char op=operator.pop();
                    String  x=pref.pop();
                    String Prefans=op+x+y;
                    pref.push(Prefans);

                    String y1=post.pop();
                    String x1=post.pop();
                    String Postans=x1+y1+op;
                    post.push(Postans);

                }
                operator.pop();
            }
            else if((ch<='9' && ch>='0')||(ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
                 String ans=String.valueOf(ch);
                 pref.push(ans);
                 post.push(ans);
            }

            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/') {
                if(operator.isEmpty()){
                    operator.push(ch);
                }
                else if(operator.peek()=='('){
                    operator.push(ch);
                }
                else if(precedence(ch)>precedence(operator.peek())){
                    operator.push(ch);
                }

                else if (precedence(operator.peek()) >= precedence(ch)) {
                    String  y=pref.pop();
                    char op=operator.pop();
                    String  x=pref.pop();
                    String Prefans=op+x+y;
                    pref.push(Prefans);


                    String y1=post.pop();
                    String x1=post.pop();
                    String Postans=x1+y1+op;
                    post.push(Postans);

                    operator.push(ch);
                }

            }
        }

        while (operator.size()!=0){
            String  y=pref.pop();
            char op=operator.pop();
            String  x=pref.pop();
            String Prefans=op+x+y;
            pref.push(Prefans);


            String y1=post.pop();
            String x1=post.pop();
            String Postans=x1+y1+op;
            post.push(Postans);
        }

        System.out.println(pref.peek());
        System.out.println(post.peek());

    }

    private static int operation(int x, int y, char ope) {
        if(ope=='+'){
            return x+y;
        } else if (ope == '-') {
            return x-y;
        }
        else if(ope=='/'){
            return x/y;
        } else {
            return x*y;
        }
    }

    public static int precedence(char oper){
        if(oper=='+')
            return 1;
        else if(oper=='-')
            return 1;
        else if (oper=='*')
            return 2;
        else
            return 2;
    }
}
