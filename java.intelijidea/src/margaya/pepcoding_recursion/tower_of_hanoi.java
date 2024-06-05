package margaya.pepcoding_recursion;

import java.util.Scanner;

public class tower_of_hanoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int T1=sc.nextInt();
        int T2=sc.nextInt();
        int T3=sc.nextInt();
        towerOf(n,T1,T2,T3);
    }

    private static void towerOf(int n, int t1, int t2, int t3) {
        //base case
        if(n==0){
            return;
        }

        towerOf(n-1,t1,t3,t2);
        System.out.println(n+" ["+t1+" to "+t3+" ]");
        towerOf(n-1,t2,t1,t3);
    }
}
