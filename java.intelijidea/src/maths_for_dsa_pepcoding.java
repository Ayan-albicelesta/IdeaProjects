import java.util.Scanner;
public class maths_for_dsa_pepcoding {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //is a number prime -->pepcoding 11
        /*
        int n=sc.nextInt();
        int count =0;
        for(int i=2;i*i<=n;i++){
             if(n%i==0){
                 count++;
             }
        }
        if(count>0){
            System.out.println("not a prime number");
        }
        else {
            System.out.println("prime number");
        }
        */



        //print all prime numbers till n

        /*int low=sc.nextInt();
        int high=sc.nextInt();
        for(int i=low;i<=high;i++){
            int count=0;
             for(int j=2;j*j<i;j++){
                 if(i%j==0){
                    count++;
                    break;
                 }
             }
             if(count==0){
                 System.out.println(i);
             }
        }*/



        //print all fibonachi number till n
        /*int n=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }*/



        //count digits of  a number

//        int a=sc.nextInt();
//        int count=0;
//        for(;a!=0;){  //this is tricky, actually it is a similar syntax of while loop,so the same code can be written in while loop
//            a=a/10;
//            count++;
//        }
        /*
        int a=sc.nextInt();
        int count=0;
        while(a!=0){
            a=a/10;
            count++; //just see how this is done with upper for loop,quite tricky and awesome
        }
        System.out.println(count);
        */



        //print all digits of a number
//        int a=sc.nextInt();
//
//        //first count the digits
//        int count=0;
//        int temp=a;
//        while (temp!=0){
//            temp=temp/10;
//            count++;
//        }
//        System.out.println(count);

//        for(int i=1;i<=4;i++){
//            int digit=a/(int)Math.pow(10,count-1);
//            System.out.println(digit);
//            a=a%(int)Math.pow(10,count-1);
//            count--;
//        }

        //this is done in while loop
        /*while(count>0){
            int digit=a/(int)Math.pow(10,count-1);
            System.out.println(digit);
            a=a%(int)Math.pow(10,count-1);
            count--;
        }*/





        //reverse a number

        /*int n=sc.nextInt();

        //first count digits
        int count=0;
        int temp=n;
        while (temp!=0){
            count++;
            temp=temp/10;
        }
        System.out.println(count);

        //now reverse
        int sum=0;
        int lastdigit;
        while (count>0){
             lastdigit=n%10;
            sum=sum+(int)(lastdigit*Math.pow(10,count-1));
            n=n/10;
            count--;
        }
        System.out.println(sum);*/




        //inverse a number(interchange index and number, number should be identical and have to be in sequence from 1)
        /*int n=21453;

        int count=1;
        int reverseNumber=0;
        int rem;
        while (n!=0){

             rem=n%10;
            reverseNumber=reverseNumber+(count*(int)Math.pow(10,rem-1));
            n=n/10;
            count++;
        }
        System.out.println(reverseNumber);*/




        //rotate a number
        //  int n=sc.nextInt();
        // //first count digits
        // int count=0;
        // int temp=n;
        // while (temp!=0){
        //     count++;
        //     temp=temp/10;
        // }
        // System.out.println(count);


        // //now rotate part
        // int rotate=sc.nextInt();
        // System.out.println("rotate with "+rotate);

        // int rotatedNum=0;
        // int rem=n%(int)Math.pow(10,rotate);
        // int result=n/(int)Math.pow(10,rotate);
        // rotatedNum=rotatedNum+(rem*(int)Math.pow(10,count-rotate))+result;
        // System.out.println(rotatedNum);     
          
    }
}
