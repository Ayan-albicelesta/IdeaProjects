package margaya.Stack_pepcoding;

import java.util.Stack;

public class Q8_infix_evaluation {
    public static void main(String[] args) {
         String input="2+(5-3*6/2*6)*2";//double digits are not allowed

        Stack<Integer> operand=new Stack<>();
        Stack<Character> operator=new Stack<>();
         for(int i=0;i<input.length();i++){
             char ch=input.charAt(i);

             if(ch=='('){
                operator.push('(');
             }
             else if(ch==')'){
                while (operator.peek()!='('){
                    int y = operand.pop();
                    char oper = operator.pop();
                    int x = operand.pop();
                    int ans = operation(x, y, oper);
                    operand.push(ans);
                }
                operator.pop();
             }
             else if(Character.isDigit(ch)){
                   int n=ch-'0';
                   operand.push(n);
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
                          int y = operand.pop();
                          char oper = operator.pop();
                          int x = operand.pop();
                          int ans = operation(x, y, oper);
                          operand.push(ans);
                          operator.push(ch);//have to push the higher precedence operator at the end
                      }

             }
         }

             while (operator.size()!=0){
                 int y = operand.pop();
                 char oper = operator.pop();
                 int x = operand.pop();
                 int ans = operation(x, y, oper);
                 operand.push(ans);
             }

        System.out.println(operand.peek());

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
