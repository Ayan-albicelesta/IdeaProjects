package margaya.college_walllah_HashMap;

import java.util.HashMap;

public class lecture_61_two_sum {
    public static void main(String[] args) {
        int[]arr={3,3};
        int target=6;
        HashMap<Integer,Integer> ob=new HashMap<>();//num,index
        for(int i=0;i<arr.length;i++){
            ob.put(arr[i],i);
        }

        for(int i=0;i<arr.length;i++){
                int num=target-arr[i];
                if(ob.containsKey(num) && ob.get(num) != i && ob.get(num)>i){
                    System.out.println(i+" "+ob.get(num));

                }
        }
    }
}
