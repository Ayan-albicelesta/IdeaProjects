package margaya.kunal_recursion;

import java.util.ArrayList;

public class recursion_subset_subsequence {
    public static void main(String[] args) {
        //skip a String in a parent string
        /*String fruit="OrangeAppleMango";
        String target="Apple";
        String ans=SkipString(fruit,target);
        System.out.println(ans);*/


        //print all subsets of a string
        /*String str="abc";
        String procesed="";
        Findsubsets(procesed,str);*/


        //store all subsets of a string in anarraylist
        /*String str="abc";
        String procesed="";
        System.out.println(Storesubsets(procesed,str));//here we are not passing an arraylist,rather than we will creat local arraylist
        //passing an arraylist in the argument and returning it would be easy
        */


        //beside printing the sets, also print the ASCII value
        System.out.println(FindsubsetsASCII("","abc"));
    }

    private static ArrayList<String> FindsubsetsASCII(String processed, String unprocessed) {//passing an arraylist in the argument and returning it would be easy
        //here we are not passing an arraylist,rather than we will creat local arraylist
        //base case
        if(unprocessed.length()==0){
            ArrayList<String> obj=new ArrayList<>();
            obj.add(processed);
            return obj;
        }

        char ch=unprocessed.charAt(0);
        ArrayList<String> first=FindsubsetsASCII(processed+ch,unprocessed.substring(1));//for left side recursion
        ArrayList<String> second=FindsubsetsASCII(processed,unprocessed.substring(1));
        ArrayList<String> third=FindsubsetsASCII(processed+(ch+0),unprocessed.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }

    private static ArrayList<String> Storesubsets(String processed, String unprocessed) {//passing an arraylist in the argument and returning it would be easy
        //here we are not passing an arraylist,rather than we will creat local arraylist
        //base case
        if(unprocessed.length()==0){
            ArrayList<String> obj=new ArrayList<>();
            obj.add(processed);
            return obj;
        }

        char ch=unprocessed.charAt(0);
       ArrayList<String> left=Storesubsets( processed+ch,unprocessed.substring(1));//for left side recursion
       ArrayList<String> right=Storesubsets(processed,unprocessed.substring(1));
       left.addAll(right);
       return left;
    }

    private static void Findsubsets(String processed, String unprocessed) {
        //base case
        if(unprocessed.length()==0){
            System.out.println(processed);
            return;
        }

        char ch=unprocessed.charAt(0);
        Findsubsets( processed+ch,unprocessed.substring(1));//left side recursion
        Findsubsets(processed,unprocessed.substring(1));// right side call
    }

    private static  String SkipString(String fruit,String target) {
        if(fruit.length()==0){
            return "";
        }

        if(fruit.startsWith(target)){
           return SkipString(fruit.substring(target.length()),target);
        }
        else {
           return fruit.charAt(0)+SkipString(fruit.substring(1),target);
        }
    }
}
