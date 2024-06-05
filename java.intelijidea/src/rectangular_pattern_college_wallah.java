import java.util.Scanner;

public class rectangular_pattern_college_wallah {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //rectangular pattern 1
        /*
        int n=sc.nextInt();
        int r=sc.nextInt();
        for(int i=1;i<=n;i++){

            for(int j=1;j<=r;j++){
                System.out.print("* ");
            }
            System.out.println();

        }*/

        /*
        //rectangular pattern 2

        int n=sc.nextInt();//number of rows
        int r=sc.nextInt();//number of column
        for(int i=1;i<=n;i++){

            for(int j=1;j<=r;j++){
                 if(i==1 || i==n || j==1 ||j==r){
                     System.out.print("* ");
                 }
                 else {
                     System.out.print("  ");
                 }
            }
            System.out.println();

        }*/

        //pyramid
    /*    *
        * * *
      * * * * *
    * * * * * * *

     */
//        int n=7;
//        int sp=n-1;//spaces
//        int st=1;//stars
//        for(int i=1;i<=n;i++){
//
//            for(int j=1;j<=sp;j++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=st;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//            sp--;
//            st+=2;
//        }

        //another way

        int n=2;

        for(int i=1;i<=n;i++){

            //spaces=n-i
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //stars= 2*i-1
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        //numerical rectangular number1
        //print this
//        1 2 3 4 5 6 7
//        2 3 4 5 6 7 1
//        3 4 5 6 7 1 2
//        4 5 6 7 1 2 3
//        5 6 7 1 2 3 4
//        6 7 1 2 3 4 5
//        7 1 2 3 4 5 6

        /*
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){

            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }

            for(int j=1;j<=i-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

         */


        //try this
//        1 2 3 4 5 6
//        1 2 3 4 5 6
//        1 2 3 4 5 6
//        1 2 3 4 5 6

//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//
//            for(int j=1;j<=6;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }




        //number pattern-->try this
//        1 2 1 2 1 2
//        2 1 2 1 2 1
//        1 2 1 2 1 2
//        2 1 2 1 2 1

//        int n=sc.nextInt();
//        int r=sc.nextInt();
//
//        for(int i=1;i<=n;i++){
//
//            for(int j=1;j<=r;j++){
//                if((i+j)%2==0){
//                    System.out.print(1+" ");
//                }
//                else {
//                    System.out.print(2+" ");
//                }
//            }
//            System.out.println();
//        }



        //numerical triangle
        //try this
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//            System.out.println();
//        }



        //newmerical pyramid
        //try this
//              1
//            1 2 1
//          1 2 3 2 1
//        1 2 3 4 3 2 1

//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            //spaces=n-i;
//            for(int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            //first number series
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            //last number series
//            for(int j=i-1;j>=1;j--){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }


        //this one from pepcoding pattern 16

        /*
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i-1;j++){
                System.out.print("  ");
            }


            if(i==n){
                for(int j=i-1;j>=1;j--){
                    System.out.print(j+" ");
                }
            }
            else {
                for(int j=i;j>=1;j--){
                    System.out.print(j+" ");
                }
            }
            System.out.println();

        }*/

    }
}
