// package margaya.collegeWalleh_strings_lecture_49;

public class Q4_palindrome_in_substrings {
    public static void main(String[] args) {
        String str="abcdcba";
        int count=0;
        for(int i=0;i<str.length();i++){

            for(int j=i;j<str.length();j++){
                boolean ans=checkpalindrome(str.substring(i,j+1));
                if(ans==true){
                    count++;
                    System.out.println(str.substring(i,j+1));
                }
            }
        }
        System.out.println(count);
    }
    public static boolean checkpalindrome(String str){
        boolean flag=true;
        int i=0,j=str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return  false;
            }
            i++;
            j--;
        }
        return  flag;
    }

}
