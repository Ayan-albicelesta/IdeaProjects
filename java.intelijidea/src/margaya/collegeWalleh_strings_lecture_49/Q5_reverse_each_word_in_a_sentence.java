// package margaya.collegeWalleh_strings_lecture_49;

import java.util.Scanner;

public class Q5_reverse_each_word_in_a_sentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String sub="";
        String newstr="";

        //strong the reversed part of the last substring part of the main String after the very last blank place
        int n=str.length()-1;
        char c=str.charAt(n);
        int d=(int) c;
        String x="";
        while (d!=32){
            x+=c;
            n--;
            c=str.charAt(n);
            d=(int) c;
        }
        //System.out.println(x);

        //reversing seach part excet the last substring
           for(int i=0;i<str.length();i++){
               char ch=str.charAt(i);
               int digit=(int) ch;
               //if alphabates
               if((digit<=90 && digit>=65) || (digit>=97&&digit<=122)){
                   sub=sub+ch;
               }
               //if spaces
               if (digit == 32) {
                   StringBuilder br=new StringBuilder(sub);
                   br.reverse();
                   newstr=newstr+br+" ";
                   sub="";
               }
           }

           newstr+=x;//now adding the last substring
        System.out.println(newstr);
    }
}
