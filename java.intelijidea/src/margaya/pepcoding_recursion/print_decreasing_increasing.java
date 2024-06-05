package margaya.pepcoding_recursion;

import java.util.Scanner;

public class print_decreasing_increasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        printDecreaseIncrease(a);
    }

    private static void printDecreaseIncrease(int a) {
        if(a==0){
            return;
        }
        System.out.println(a);//this will execute while making the recursive call
        printDecreaseIncrease(a-1);
        System.out.println(a);//this will execute while returning from recursive call
    }
}
