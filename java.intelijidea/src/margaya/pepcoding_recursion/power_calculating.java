package margaya.pepcoding_recursion;

import java.util.Scanner;

public class power_calculating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give the  number");
        int num=sc.nextInt();
        System.out.println("give the  power");
        int pow=sc.nextInt();
        int ans=calculatePower(num,pow);
        System.out.println(ans);
    }

    private static int calculatePower(int num,int pow) {
        if(pow==0){
            return 1;
        }
        return num*calculatePower(num,pow-1);
    }

}
