package margaya.college_walllah_HashMap;

import java.util.HashMap;

public class lecture_61_anagram_string {
    public static void main(String[] args) {
        String s="silent";
        String t="listen";
        HashMap<Character,Integer> ob=putHashValue(t);
        ans(s,t,ob);

        String m="ayan";
        String n="anya";
        HashMap<Character,Integer> ob1=putHashValue(n);
        ans(m,n,ob1);

        String x="barca";
        String y="caara";
        HashMap<Character,Integer> ob2=putHashValue(y);
//        System.out.println(ob2.entrySet());
        ans(x,y,ob2);

    }

    private static void ans(String s, String t, HashMap<Character, Integer> ob) {
        if(s.length()!=t.length())
            System.out.println(false);
        else {
            boolean ans = angram(s, ob);
            System.out.println(ans);
        }
    }

    private static HashMap<Character,Integer>  putHashValue(String t) {
        HashMap<Character,Integer> ob=new HashMap();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(ob.containsKey(ch)){
                int x=ob.get(ch);
                ob.put(ch,x+1);
            }
            else {
                ob.put(ch,1);
            }
        }
        return  ob;
    }

    private static boolean angram(String s, HashMap<Character,Integer> ob) {

         if(s.length()==0){
             return true;
         }
            char ch=s.charAt(0);
            if( !ob.containsKey(ch)){
                return false;
            }
            int x=ob.get(ch);
            if(x!=1){
                return false;
            }
            else {
               return angram(s.substring(1), ob);
            }

    }
}
