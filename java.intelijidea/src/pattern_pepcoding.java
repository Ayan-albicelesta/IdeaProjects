import java.util.Scanner;

public class pattern_pepcoding {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();


        //pattern 3, follow alternate way below
//        for(int i=x;i>0;i--){
//
//            int c=0;
//            for(int j=1;j<i;j++){
//                System.out.printf(" ");
//                c++;
////                System.out.println(c);
//            }
//            for(int k=1;k<=x-c;k++){
//                System.out.printf("*");
//            }
//            System.out.println();
//        }




  //patter 3 alternate way
//        for(int i=1;i<=x;i++){
//
//            for(int j=1;j<=x-i;j++){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



        //pattern 4

//        for(int i=x;i>0;i--){
//
//            for(int k=1;k<=x-i;k++){
//                System.out.print(" ");
//            }
//
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
     
 

        //pattern 5
        // int n=x;
        // int sp=n/2;
        // System.out.println(sp);
        // int st=1;
        // System.out.println(st);

        // for(int i=1;i<=x;i++){

        //     //for firt half space
        //     for(int m=1;m<=sp;m++){
        //          System.out.print(" ");
        //     }

        //     //for first half star
        //     for(int p=1;p<=st;p++){
        //         System.out.print("*");
        //     }
             
        //     if(i<=x/2){
        //        sp--;
        //        st+=2;
        //     }
        //     else{
        //         sp++;
        //         st-=2;
        //     }
        //     System.out.println();
        // }
       



        //pattern 6
        // int sp=1;
        // int st=x/2+1;
        // int n=x;
        // for(int i=1;i<=x;i++){

          
        //  for(int j=1;j<=st;j++){
        //     System.out.print("*");
        //  }

        //  for(int k=1;k<=sp;k++){
        //     System.out.print(" ");
        //  }

        //  for(int l=1;l<=st;l++){
        //     System.out.print("*");
        //  }
        //  System.out.println();


        //     if(i<=n/2){
        //         sp+=2;
        //         st--;
        //     }
        //     else{
        //         sp-=2;
        //         st++;
        //     }
        // }


        //pattern 7
        // for(int i=1;i<=x;i++){

        //     for(int j=1;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=1;k++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        //patten 7 --- optimised
        // for(int i=1;i<=x;i++){
        //     for(int j=1;j<=x;j++){

        //         if(i==j){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //pattern 8
        // for(int i=1;i<=x;i++){

        //     for(int j=1;j<=x-i;j++){
        //        System.out.print(" ");
        //     }

        //     for(int k=1;k<=1;k++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }


        //pattern 8 --optimised
        // for(int i=1;i<=x;i++){
        //     for(int j=1;j<=x;j++){

        //         if(i+j==x+1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }



        //pattern 9
        // for(int i=1;i<=x;i++){
        //      for(int j=1;j<=x;j++){
        //         if(i==j || i+j==x+1){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //      }
        //      System.out.println();
        // }


         
        //pattern 10
        // int os=x/2;
        // int is=-1;

        // for(int i=1;i<=x;i++){
            
        //     for(int j=1;j<=os;j++){
        //         System.out.print(" ");
        //     }
        //     System.out.print("*");
        //     for(int k=1;k<=is;k++){
        //         System.out.print(" ");
        //     }

        //     if(i>1 && i<x){
        //         System.out.print("*");
        //     }

        //     System.out.println();

        //     if(i<=x/2){
        //        os--;
        //        is+=2;
        //     }
        //     else{
        //         os++;
        //         is-=2;
        //     }

        // }



        //pattern 11
        // int count=1;
        // for(int i=1;i<=x;i++){

        //     for(int j=1;j<=i;j++){
        //         System.out.print(count+" ");
        //         count++;
        //     }
        //     System.out.println();
        // }


        //pattern 12
        //  int a=0,b=1;
        //  for(int i=0;i<x;i++){

        //     for(int j=0;j<=i;j++){
        //        int c=a+b;
        //        a=b;
        //        b=c;
        //        System.out.print(a+" ");
        //     }
        //     System.out.println();
        //  }



        //pattern 13
         


        //pattern 14
        // for(int i=1;i<=10;i++){
        //      System.out.println(x+"*"+i+"="+x*i);
        // }


        //pattern 15
        // int sp=x/2;
        // int di=1;
        // int temp=1;
        //  for(int i=1;i<=x;i++){
        //   int temp1=temp;

        //   for(int j=1;j<=sp;j++){
        //     System.out.print("  ");
        //   }

        //   for(int k=1;k<=di;k++){
        //     System.out.print(temp1+" ");

        //     if(k<=di/2){
        //       temp1++;
        //     }
        //     else{
        //       temp1--;
        //     }
        //   }

        //   if(i<=x/2){
        //     sp--;
        //     di+=2;

        //     temp++;
        //   }
        //   else{
        //     sp++;
        //     di-=2;

        //     temp--;
        //   }

        //   System.out.println();
        //  }




        //pattern 16

        




















        //pattern ( problem created by me)
        // 1         6
        //   2     7
        //      3
        //   8     4
        // 9         5


        // int count=1;
        // int count2=x+1;

         
        // for(int i=0;i<x;i++){

        //   for(int j=0;j<x;j++){

        //     if(i==j){
        //       System.out.print(count+" ");
        //       count++;
        //     }
        //     if(i+j==x-1){
        //        if(i==j){
        //         break;
        //        }
        //       System.out.print(count2+" ");
        //       count2++;
        //     }
        //     if(i!=j && i+j!=x-1){
        //       System.out.print("  ");
        //     }
          // }

        //   System.out.println();
        // }


        //pattern (problem created by me)
        // 1    6
        //  2   7
        //   3  8
        //    4 9
        //      5
        // int count=1;
        // int count2=x+1;
        // for(int i=0;i<x;i++){

        //   for(int j=0;j<x;j++){
            
        //         if(i==j){
        //           System.out.print(count+" ");
        //           count++;
        //         }
        //         if(j==x-1){
        //           if(i==j){
        //             break;
        //           }
        //           System.out.print(count2+" ");
        //           count2++;
        //         }
        //         if(i!=j && j!=x-1){
        //           System.out.print("  ");
        //         }
        //   }
        //   System.out.println();
        // }
         
    }
}
