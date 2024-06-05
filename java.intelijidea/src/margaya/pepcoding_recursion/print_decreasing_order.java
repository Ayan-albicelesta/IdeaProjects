package margaya.pepcoding_recursion;

import java.util.Scanner;

public class print_decreasing_order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDecreasing(n);
    }


    private static void printDecreasing(int i) {
        if(i==0){
            return;
        }
        System.out.println(i);
        printDecreasing(i-1);
    }
}
