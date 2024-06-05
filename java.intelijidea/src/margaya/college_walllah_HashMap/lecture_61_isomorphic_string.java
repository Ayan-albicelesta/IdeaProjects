package margaya.college_walllah_HashMap;

import java.util.HashMap;

public class lecture_61_isomorphic_string {
    public static void main(String[] args) {
        String m="aabcbc";
        String n="xxyzyz";

       boolean ans= findIsomorohic(m,n);
        System.out.println(ans);

    }

    private static boolean findIsomorohic(String m, String n) {
        if(m.length()!=n.length())
            return false;

        HashMap<Character,Character> ob=new HashMap<>();
        for(int i=0;i<m.length();i++){
            char ch1=m.charAt(i);
            char ch2=n.charAt(i);

            if(ob.containsKey(ch1)){
                if(ch2!=ob.get(ch1)){
                    return  false;
                }

            }
            else {
                if(ob.containsValue(ch2)){
                    return false;
                }
                ob.put(ch1,ch2);
            }
        }
        return true;
    }


}
