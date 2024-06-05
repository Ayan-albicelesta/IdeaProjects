// package margaya.collegeWalleh_strings_lecture_49;

public class Lecture_49_StringBuilders {
    public static void main(String[] args) {
       StringBuilder str=new StringBuilder("hellow world is  the basic thing a programmer prints in language");
        //we cannot concatinate in stringbuilders
        //unlike Strings Stringbuilders are mutable, we can manupulate stringbuilders
        str.setCharAt(0,'m');

        //basic opearations
        str.append(" in very first days");
        str.append(true);
        System.out.println(str);

        str.setCharAt(5,'W');

        str.insert(6," hellow");
        str.insert(0,113);
        System.out.println(str);

        str.delete(14,18);//first and last index
        System.out.println(str);

        System.out.println(str.indexOf("thing"));
        System.out.println(str.indexOf("1"));
        System.out.println(str.lastIndexOf("1"));
        System.out.println(str.lastIndexOf("s"));

        str.deleteCharAt(2);
        System.out.println(str);

        str.reverse();//reverse the original string
        System.out.println(str);
        str.reverse();
        System.out.println(str);
    }
}
