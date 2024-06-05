import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_questioin4_coillege_wallah_31 {
    public static void main(String[] args) {

        //gcd,lcm
        Scanner sc=new Scanner(System.in);
        //way 1
        /*int x=sc.nextInt();
        int y=sc.nextInt();
        int ans=findGCD(x,y);
        System.out.println(ans);*/

        //another way
        /*int x=sc.nextInt();
        int y=sc.nextInt();
        int ans=findGCD2(x,y);
        System.out.println(ans);
        int lcm=(x*y)/ans;
        System.out.println("lcm is "+lcm);*/

    }

    private static int findGCD2(int x, int y) {
        if(x==0){
            return y;
        }
       return findGCD2(y%x,x);
    }

    private static int findGCD(int x, int y) {
        //base case 1
        if(x==0){
            return y;
        }
        //base case 2
        if(y==0){
            return x;
        }

        if(x>=y){
            return findGCD(x-y,y);
        }
        else {
            return findGCD(x,y-x);
        }
    }
}
