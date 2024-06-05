import java.util.*;

public class striver_maths_for_dsa {
    public static void main(String[] args) {

        //count number of digits in N, which evenly divides N
        /*int N=22074;
         int temp=N;
         int count=0;
         while(temp>0){
           int rem=temp%10;
             if(rem!=0 && N%rem==0){//**VVI-->(N%rem==0 && rem!=0)this will give error for rem=0,as N%rem==0 will give exception first if rem==0
                 count++;
             }
             temp=temp/10;
         }
        System.out.println(count);*/


        //reverse a number
        /*int n=456;
        //first count digits
        int temp=n;
        int count=0;
        while (temp>0){
            count++;
            temp=temp/10;
        }
        System.out.println(count);
        int sum=0;
        while (count>0){
            int rem=n%10;
            sum=sum+rem*(int)Math.pow(10,count-1);
            count--;
            n=n/10;
        }
        System.out.println(sum);*/


        //check palindrome
        /*int n=123;

        //count digits
        int count=0;
        int temp=n;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        //reverse the number
        int sum=0;
        int temp1=n;
        while (count > 0) {
            int rem=temp1%10;
            sum=sum+rem*(int)Math.pow(10,count-1);
            count--;
            temp1=temp1/10;
        }
        if(n==sum){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }*/


        //GCD,LCM
        /*int x=30;
        int y=90;
        int temp1=x;
        int temp2=y;
        while (x!=0 && y!=0) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        if(x==0){
            System.out.println("gcd is "+y);
        }
        else {
            System.out.println("gcd is "+x);
        }
        int z=x>y?x:y;
        System.out.println(z);
        int LCM=(temp1*temp2)/z;
        System.out.println(LCM);*/


        //print all divisors
        /*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        List<Integer> ans=printDivisors(n);
        System.out.println(ans);*/

        int[] originalArray = {1, 2, 3, 4, 5};

        // Copy a range of elements from index 1 (inclusive) to index 4 (exclusive)
        int[] copiedArray = Arrays.copyOfRange(originalArray, 0,originalArray.length);

        // Print the copied array
        System.out.println(Arrays.toString(copiedArray));

    }

    public static List< Integer > printDivisors(int n) {
        List<Integer> obj=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                obj.add(i);
                if(i!=n/i){
                    obj.add(n/i);
                }
            }
        }
        Collections.sort(obj);
        return obj;
    }


}
