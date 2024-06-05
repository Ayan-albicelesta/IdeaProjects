package margaya.kunal_recursion;

import java.util.ArrayList;

public class recursion_permutation {
    public static void main(String[] args) {
        //printing the permutation
        /*String str="abc";
        String processed="";
        printPermutation(processed,str);*/


        //returning the permutation with arraylist(not passing the list in argument)
        /*String str="abc";
        String processed="";
        ArrayList<String > ans= returnPermutation(processed,str);
        System.out.println(ans);*/


        //counting number of permutation
        /*String str="abcd";
        String processed="";
        System.out.println(countPermutation(processed,str));*/


    }

    private static int countPermutation(String processed, String unprocessed) {
        if(unprocessed.length()==0){
            System.out.println(processed);
            return 1;
        }
        int count=0;
        for(int i=0;i<unprocessed.length();i++){
            char ch=unprocessed.charAt(i);
           count=count+countPermutation(processed+ch,unprocessed.substring(0,i)+unprocessed.substring(i+1));
        }
         return count;
    }

    private static ArrayList<String> returnPermutation(String processed, String unprocessed) {
        if(unprocessed.length()==0){
            ArrayList<String> obj=new ArrayList<>();
            obj.add(processed);
            return obj;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<unprocessed.length();i++){
           char ch=unprocessed.charAt(i);
           ans.addAll(returnPermutation(processed+ch,unprocessed.substring(0,i)+unprocessed.substring(i+1)));
        }
        return  ans;
    }


    private static void printPermutation(String processed, String unprocessed) {
        //this code approach is from pep-coding
        if(unprocessed.length()==0){
            System.out.println(processed);
            return;
        }
         for(int i=0;i<unprocessed.length();i++){
             char ch=unprocessed.charAt(i);
             printPermutation(processed+ch,unprocessed.substring(0,i)+unprocessed.substring(i+1));
         }
    }
}
