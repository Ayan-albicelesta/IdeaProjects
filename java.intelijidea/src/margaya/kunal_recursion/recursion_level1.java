package margaya.kunal_recursion;

import java.util.Scanner;

public class recursion_level1 {
    static int sum=0;
    static int countZero=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //sum of n to 1
        /*int n=sc.nextInt();
        int ans=sumof(n);
        System.out.println(ans);*/

        //sum of all digits
        /*int n=sc.nextInt();
        int ans=sumOfAllDigit(n);
        System.out.println(ans);*/

        //reverse a number
        /*
        //approach1
//        int n=sc.nextInt();
//        int temp=n;
//        int totalDigit=0;
//        while (temp!=0){
//            totalDigit++;
//            temp=temp/10;
//        }
//        System.out.println("total digits are "+totalDigit);
//        int ans=reverseNumber(n,totalDigit);
//        System.out.println(ans);
        //approach2
        int n=sc.nextInt();
        reverseeNumber(n);
        System.out.println(sum);*/


        //count zeros

/*//        int n=sc.nextInt();
//        countZeros(n);
//        System.out.println(countZero);

        //another way
        int n=sc.nextInt();
        int ans=countZeros2(n,0);
        System.out.println(ans);*/

        //count steps
        int n=sc.nextInt();
        int ans=countSteps(n,0);
        System.out.println(ans);

    }

    private static  int countSteps(int n, int steps) {
        //base case
        if(n==0){
            return  steps;
        }


        if(n%2==0){
            n=n/2;
            return countSteps(n,steps+1);
        }
        else {
            n=n-1;
            return countSteps(n,steps+1);
        }
    }

    private static int countZeros2(int n,int count) {
        if(n==0){
            return count;
        }
        int rem=n%10;
        n=n/10;
        if(rem==0){
            count=count+1;
            return countZeros2(n,count);
        }
        else {
            return countZeros2(n,count);
        }

    }

    private static void countZeros(int n) {
        if(n==0){
            return;
        }
        int rem=n%10;
        if(rem==0){
            countZero++;
        }
        n=n/10;

       countZeros(n);

    }

    private static void reverseeNumber(int n1) {
        if(n1==0){
            return;
        }
        int rem=n1%10;
        n1=n1/10;
        sum=sum*10+rem;
        reverseeNumber(n1);
    }

    private static  int reverseNumber(int n, int totalDigit) {
        if(n==0){
            return 0;
        }
        int rem=n%10;
        n=n/10;
        return (int) (rem*Math.pow(10,totalDigit-1)+reverseNumber(n,totalDigit-1));
    }

    private static int sumOfAllDigit(int n) {
        if(n==0){
            return 0;
        }
        int rem=n%10;
        n=n/10;
        return rem+sumOfAllDigit(n);
    }

    private static int sumof(int n) {
        //base case
        if(n==0){
            return 0;
        }
        return n+sumof(n-1);
    }
}
