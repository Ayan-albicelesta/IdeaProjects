// package margaya.collegeWalleh_strings_lecture_49;

import java.util.Scanner;

public class lecture_49_Strings_college_wallah {
    public static void main(String[] args) {
        //basics
           Scanner sc=new Scanner(System.in);
           
//        String name=sc.nextLine();
//        System.out.println(name);
//        String name1=sc.nextLine();
//        System.out.println(name1);


        //some functions
        String str="rahgav garg";
        String gtr="demon";
        String gh="demon";
        System.out.println(str.compareTo(gtr));//gives 0 or positive or negetive according to "lexographically" value
        System.out.println(gtr.compareTo(gh));

        System.out.println(str.contains("gav "));
        System.out.println(str.contains("rag"));
        // System.out.println(str.replace("ga", "okk"));

        System.out.println(str.startsWith("r"));
        System.out.println(str.startsWith("rah"));
        System.out.println(str.endsWith("arg"));

        System.out.println(gtr.toUpperCase());
        String j="JAI MODI JI";
        System.out.println(j.toLowerCase());
        System.out.println(j.concat(" jai sree ram"));
        //remember all these functions does not modify the original String as Strings are immutable*/


        //concatinate
        // String name="auan";
        //  int num=7347;
        // System.out.println(name+num);

        //**VVI--tricks
        String d="abc";
        System.out.println(d+36+75);
        System.out.println(10+40+d);


        //print all substrings
        String name="abcd";
        int k=name.length();
        for(int i=0;i<name.length();i++){

            for (int J=i;J<name.length();J++){
                System.out.print(name.substring(i,J+1)+" ");
            }
        }

    }
}


