package margaya.pepcoding_recursion;

import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=facto(n);
        System.out.println(ans);
    }

    private static int facto(int n) {
        if(n==1){
            return 1;
        }
        return n*facto(n-1);
    }
}
