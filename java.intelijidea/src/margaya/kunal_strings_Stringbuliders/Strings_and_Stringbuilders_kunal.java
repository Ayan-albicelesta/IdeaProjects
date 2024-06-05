package margaya.kunal_strings_Stringbuliders;


import java.util.ArrayList;
import java.util.Arrays;

public class Strings_and_Stringbuilders_kunal {
    public static void main(String[] args) {
        //cool stufs
        System.out.println(Arrays.toString(new int[]{2,4,5}));

        float a=34.6374f;
        System.out.printf("formated number is %.2f ",a);//it also rounds off the number
        System.out.println();
        System.out.printf("pie is %.3f ",Math.PI);
        System.out.println();

        //conacatination in strings
        System.out.println('a'+'b');//this will sum up the ascaii value of 'a' and 'b'

        //concatination
        System.out.println("a"+"b");//this will concatinate
        System.out.println("a"+4);//this will concatinate the String and integer
        System.out.println("avd"+new ArrayList<>());//this will concatinate the String and empty list
        String ans=" "+new ArrayList<>();//this will concatinate the String and empty list


        //string palindrome or not
        String name="abcdcba";
        int i=0,j=name.length()-1;
        boolean flag=true;
        while (i<j){
            if(name.charAt(i)==name.charAt(j)){
                i++;
                j--;
            }
            else{
                flag=false;
                break;
            }
        }
        if(flag==true)
            System.out.println("palindreome");
        else
            System.out.println("not palindrome");
    }
}
