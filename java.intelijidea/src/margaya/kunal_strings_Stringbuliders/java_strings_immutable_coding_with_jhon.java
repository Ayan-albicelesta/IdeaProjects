package margaya.kunal_strings_Stringbuliders;

public class java_strings_immutable_coding_with_jhon {
    public static void main(String[] args) {
        String name="jhon";
        String anothername="jhon";
        //"name" and "anothername" both will point to the same object in the string pool

        String thirdname=new String("jhon");//by using new we are creating difereent "jhon" object
        // in memory outside of the string pool

        System.out.println(name==anothername);
        System.out.println(name==thirdname);//both object are diffrent, but their value is same

        System.out.println(name.equals(thirdname));//.equals only checks the value not the object in the memory


        //immubility of strings
        String x="ayan";
        x="khan";//in memmory this will not modify the "ayan" object, but it will create another "khan" obnject
        //and  will point to "khan"
        String y="khan";//now x and y both will point to the "khan" object

        y="delhi";//jodi string immutable na hoto tahole y ke change korar sathe sathe x change hoto karon dutoi same
        //object "khan" ke point korche but string immutable so, y will point to another object "delhi" but x will still
        // be pointing to the "khan" object


//        x.charAt(0)='h';-->this line will give error as we cannot modify strings,as they are immutable


    }
}
