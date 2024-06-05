import java.util.Scanner;

public class maths_for_dsa_love_babbar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        //seive of eratosthencs-->prime number

        /*int n=sc.nextInt();

        int count=0;
         for(int i=2;i<=n;i++){
             if(isPrime(i)==true){
                 count++;
                 for(int j=1;i*j<=n;j++){
                     boolean b = isPrime(i * j) == false;  //this algorythm is called seive of eratosthencs
                 }
             }
         }
        System.out.println(count);*/




        //gcd,lcm
        // int x=sc.nextInt();
        // int y=sc.nextInt();
        //  int ans=gcd(x,y);
        // System.out.println("gcd is "+ans);
        // int lcm=(x*y)/gcd(x,y);
        // System.out.println("lcm is "+lcm);


    }


    //using recurtion
    // public static int gcd(int x,int y){
    //      if(x==y){
    //         return x;
    //      }

    //      if(x>y){
    //         return gcd(x-y,y);
    //     }
    //      else{
    //         return gcd(x,y-x);
    //      }
    // }


    //using ecluid's algo
    /*private static int  gcd(int x, int y) {
        if(x==0){
            return y;
        }
         if(y==0){
            return  x;
        }
         while (x!=y){z
             if(x>y){
                 x=x-y;
             }
             else {
                 y=y-x;
             }
         }
       return y;
    }*/


    /*private static boolean isPrime(int n) {
        int count=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            return  true;
        }
        else {
            return  false;
        }
    }*/

}
