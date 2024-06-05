// package margaya.collegeWalleh_strings_lecture_49;

public class Q6_compress_string_based_on_their_consecutive_character {
    public static void main(String[] args) {
          String str="aabbbcdddde";//ans-->a2b3cd4e

        // int i=0;
        // int digit=(int)str.charAt(0);
        // int count=1;
        // String newStr="";
        // while (i<str.length()){
        //     char ch=str.charAt(i);
        //     while ( i+1!=str.length() && str.charAt(i)==str.charAt(i+1)){
        //         i++;
        //         count++;
        //     }
        //     if(count>1) {
        //         newStr = newStr+String.valueOf(ch) + count;
        //         count = 1;
        //         i++;
        //     }
        //     else {
        //         newStr=newStr+String.valueOf(ch);
        //         count=1;
        //         i++;
        //     }
        // }
        // System.out.println(newStr);

        // String str="aabbb";
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int count=1;
            while(i+1!=str.length() && str.charAt(i)==str.charAt(i+1)){
                 count++;
                i++;
            }

            if(count>1){
            ans=ans+ch+count;
            }
            else{
                ans=ans+ch;
            }
        }
        System.out.println(ans);
    }
}
