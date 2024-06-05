import java.util.Scanner;

public class Recursion_college_wallah_28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //find factorial of nth number
        /*int n=sc.nextInt();
        int ans=findFactorial(n);
        System.out.println(ans);*/


        //find nth fibonachi number
        /*int n=sc.nextInt();
        int ans= fibonachiCollege(n);
        System.out.println(ans);*/

    }

    private static int findFactorial(int n) {
        if(n==1){
            return 1;
        }
        return n*findFactorial(n-1);
    }

    private static int fibonachiCollege(int n) {
        if(n<2){
            return n;
        }
        return fibonachiCollege(n-1)+fibonachiCollege(n-2);
    }
}
