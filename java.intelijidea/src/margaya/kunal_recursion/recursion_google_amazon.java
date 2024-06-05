package margaya.kunal_recursion;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

public class recursion_google_amazon {
    static String[] codes={"",".,","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static int []arr={1,2,3,4,5,6};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //print keypad combination
        //this approach is from pepcoding from that 13 min video
        /*String str=sc.next();
        printKeypadCombination("",str);*/



        //dice problem
        int input=sc.nextInt();//input must be under or equal 6
        String inputString=String.valueOf(input);
        //approach1
        System.out.println("from approach 1");
        dice( "",inputString);
        //approach2
        System.out.println("from approach 2");
        dice2("",input);

    }

    private static void dice2(String processed, int input) {
        if(input==0){
            System.out.print(processed+" ");
            return;
        }
        for(int i=1;i<=input;i++){
            dice2(processed+i,input-i);
        }
    }

    private static void dice(String processed, String unprocessed) {
        if(unprocessed.charAt(0)=='0'){
            System.out.print(processed+" ");
            return;
        }
        char ch=unprocessed.charAt(0);
        int digit=ch-'0';
        for(int i=1;i<=digit;i++){
            String strProcessed=String.valueOf(i);
            String  strUnprocessed=String.valueOf(digit-i);
            dice(processed+strProcessed,strUnprocessed);
        }
    }

    private static void printKeypadCombination(String processed, String unprocessed) {
        if(unprocessed.length()==0){
            System.out.print(processed+" ");
            return;
        }

        char ch=unprocessed.charAt(0);
        int  digit=ch-'0';
        String codeword=codes[digit];
        for(int i=0;i<codeword.length();i++){
            printKeypadCombination(processed+codeword.charAt(i),unprocessed.substring(1));
        }
    }
}
