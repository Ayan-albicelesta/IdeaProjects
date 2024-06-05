import java.util.Scanner;

public class recursion_question2_college_wallah_29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //find sum of all digits
        /*int n=sc.nextInt();
        int ans=findSumOfAllDigits(n);
        System.out.println(ans);*/


        //find power
        System.out.println("take num");
        int num=sc.nextInt();
        System.out.println("take power");
        int power=sc.nextInt();
        //approach1
        System.out.println("ans from approach 1");
        int ans=findPower(num,power);
        System.out.println(ans);
        //approach2
        System.out.println("ans from approach 2");
        int ans2=findpower(num,power);
        System.out.println(ans2);

    }

    private static int findpower(int num, int power) {
        if(power==0){
            return 1;
        }
        if(power%2==0){
            return findPower(num,power/2)*findPower(num,power/2);
        }
        else {
            return num*findPower(num,power/2)*findPower(num,power/2);
        }
    }

    private static int findPower(int num, int power) {
        if(power==0){
            return 1;
        }
        return num*findPower(num,power-1);
    }

    private static int findSumOfAllDigits(int n) {
        if(n==0){
            return 0;
        }
        int rem=n%10;
        return rem+findSumOfAllDigits(n/10);
    }
}
