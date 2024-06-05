import java.util.Scanner;

public class Recursion_question7_college_wallah {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //skip the character
        /*String str=sc.nextLine();
        String ans="";
        char target='a';
        String x=SkipCharracter(str,ans,0,target);
        System.out.println("from approach1-->"+x);
        String y=SkipCharracter2(str,0,target);
        System.out.println("from approach2-->"+y);
        String z=SkipCharracter3(str,target);
        System.out.println("from approach3-->"+z);*/

        //this is just for basic knowledge
//        String cv="ascdf";
//        System.out.println(cv.substring(cv.length()-1));
//        System.out.println(cv.substring(0,cv.length()-1));

        //reverse a string
        String str="abcde";
        String x=reverseStiring(str);
        System.out.println(x);


        //check palindrome
        /*String str="abcbz";
        String ans=reverseStiring(str);
        if(str.equals(ans)){
            System.out.println("this is palindrome");
        }
        else {
            System.out.println("not palindrome");
        }*/

    }

    private static String reverseStiring(String str) {
        if(str.length()==0){
            return str;
        }
        String ans=str.substring(str.length()-1);
        char ch=ans.charAt(0);
        //char ch=str.substring(str.length()-1).charAt(0);//upper two line can be written in this short form
        return ch+reverseStiring(str.substring(0,str.length()-1));
    }

    private static String SkipCharracter3(String str,char target) {
        if(str.length()==0){
            return "";
        }
        char ch=str.charAt(0);
        if(ch!=target){
//            String x=SkipCharracter3(str.substring(1),target);
//            return ch+x;
            //instead of upper both line we can do this instead
           return ch+SkipCharracter3(str.substring(1),target);
        }
        else {
            return SkipCharracter3(str.substring(1),target);
        }
    }

    private static String SkipCharracter2(String str, int i, char target) {
           String ans="";
           if(i==str.length()){
               return ans;
           }
           if(str.charAt(i)!=target){
               ans=ans+str.charAt(i);
           }
           String x=SkipCharracter2(str,i+1,target);
           return ans+x;
    }

    private static String SkipCharracter(String str, String ans,int index,char target) {
        if(index==str.length()){
            return ans;
        }
        if(str.charAt(index)==target){
         return SkipCharracter(str,ans,index+1,target);//here ans=ans
        }
        else {
            return  SkipCharracter(str,ans+str.charAt(index),index+1,target);//here ans=ans+str.charAt(index)
        }
    }
}
