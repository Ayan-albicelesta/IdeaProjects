// package margaya.collegeWalleh_strings_lecture_49;

public class  Q3_change_cases {
    public static void main(String[] args) {
        //question 3-->change cases
        //PHysIcS-->phYSiCS

        //WITH STRINGS
        /*Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String newStr="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String s=String.valueOf(ch);
            int digit=(int) ch;//this will give the ASCII value of the charater
            if(digit<=90){
                newStr=newStr+s.toLowerCase();
            }
            else if(digit>=97){
                newStr=newStr+s.toUpperCase();
            }
        }
        System.out.println(newStr);*/

        //with StringBuilders
        /*Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int digit=(int) ch;
            if(digit<=90){
                char x= (char) (ch+32);//changing capital to small AS 97-65=32--> 'A' strts from 65 and 'a's starts from 97
                str.setCharAt(i,x);
            }
            else{
                char x= (char) (ch-32);//changing small to capital
                str.setCharAt(i,x);
            }
        }
        System.out.println(str);*/


        //question 4

    }
}
