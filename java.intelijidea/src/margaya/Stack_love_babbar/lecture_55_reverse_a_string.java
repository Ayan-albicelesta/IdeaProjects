package margaya.Stack_love_babbar;

import java.util.Stack;

public class lecture_55_reverse_a_string {
    public static void main(String[] args) {
        String name="Ayan Khanra";
        revrseAstring(name);
    }

    private static void revrseAstring(String name) {
        Stack<Character> ob=new Stack<>();
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            ob.push(ch);
        }
        String ans="";
        while (!ob.isEmpty()){
            ans=ans+ob.peek();
            ob.pop();
        }
        System.out.println(ans);
    }
}
