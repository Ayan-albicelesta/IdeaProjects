package margaya.Striver_A2Z.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4_remove_duplicates {
    public static void main(String[] args) {
         ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
         for(int i=0;i<10;i++){
             arr.add(sc.nextInt());
         }
        System.out.println(removeDupli(arr));

        System.out.println(arr);
    }

    private static int removeDupli( ArrayList<Integer> arr) {
         int j=0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(j)!=(arr.get(i))) {
                j++;
                arr.set(j, arr.get(i));
            }
        }
        while (arr.size()>j+1){
            arr.remove(arr.size()-1);
        }
        return j+1;
    }
}
