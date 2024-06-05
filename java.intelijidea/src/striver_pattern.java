import java.util.Scanner;

public class striver_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //pattern 1
       /*
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/


        //pattern 2

        /*
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        //pattern 3

//        int n=sc.nextInt();
//
//        for(int i=1;i<=n;i++){
//
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //pattern 4

        /*
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        */



        //pattern 5
//           * * * * *
//           * * * *
//           * * *
//           * *
//           *

        /*
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */



        //pattern 6
        /*
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        */


        //pattern 7

//    *
//   ***
//  *****
// *******
//*********

        /*
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){

            //spaces=n-i
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars= 2*i-1
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        */



        //pattern 8

//*********
// *******
//  *****
//   ***
//    *

         /*
        int temp=n;
        for(int i=1;i<=n;i++){

             for(int j=1;j<=i-1;j++){
                 System.out.print(" ");
             }
             for(int j=1;j<=2*temp-1;j++){
                 System.out.print("*");
             }
             temp--;
             System.out.println();
        }
        */

        //another way
        /*
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */




        //pattern 9
//        *
//       ***
//      *****
//     *******
//    *********       -->this pattern is for n=5
//    *********
//     *******
//      *****
//       ***
//        *

        /*int n=sc.nextInt();

        for(int i=1;i<=n;i++){

            //spaces=n-i
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars= 2*i-1
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }


        int temp=n;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*temp-1;j++){
                System.out.print("*");
            }
            temp--;
            System.out.println();
        }*/



        //pattern 10
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=n-1;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //pattern 11

//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

        /*
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
        */

    }
}
