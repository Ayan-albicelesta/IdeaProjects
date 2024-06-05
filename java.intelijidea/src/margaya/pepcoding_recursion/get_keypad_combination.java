package margaya.pepcoding_recursion;

import java.util.ArrayList;
import java.util.Scanner;

//this is the ans of that 24 min video, another approach from pepcoding of 13 min is done in kunal's same problem
public class get_keypad_combination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> ans=phoneKeypad(str);
        System.out.println(ans);
    }

    static String[] codes={"",".,","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    private static ArrayList<String> phoneKeypad(String str) {
        if(str.length()==0){
            ArrayList<String> arj=new ArrayList<>();
            arj.add("");
            return arj;
        }
        char ch=str.charAt(0);
        int digit=ch-'0';

        ArrayList<String> ans=phoneKeypad(str.substring(1));
        ArrayList<String> obj=new ArrayList<>();

        String childcode=codes[digit];
        for(int i=0;i<childcode.length();i++){
            char eachChar=childcode.charAt(i);
            for(  String s:ans){
                obj.add(eachChar+s);
            }
        }
        return obj;
    }
}
