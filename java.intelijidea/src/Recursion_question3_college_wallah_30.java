import java.util.Scanner;

public class Recursion_question3_college_wallah_30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //print k multiple
        /*int num=sc.nextInt();
        int times=sc.nextInt();
        printKMultple(num,times);*/

        //sum of all natural numbers till n but with alternate number
        /*int n=sc.nextInt();
        int ans=sumWithAlternateNumber(n);
        System.out.println(ans);*/
    }

    private static int sumWithAlternateNumber(int n) {
        //base case
        if(n==0){
            return 0;
        }

        if(n%2==0){
            return -n+sumWithAlternateNumber(n-1);
        }
        else {
            return n+sumWithAlternateNumber(n-1);
        }
    }

    private static void printKMultple(int num, int times) {
        if(times==0){
            return;
        }
        printKMultple(num,times-1);
        System.out.println(num+"*"+times+"="+num*times);
    }
}
