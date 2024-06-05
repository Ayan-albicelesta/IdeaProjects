package margaya.college_walllah_HashMap;

import java.util.HashMap;

public class lecture_60_maxFrequency {
    public static void main(String[] args) {
        int[]arr={1,2,5,90,4,2,2,5,7,4,5,2,2};
        HashMap<Integer ,Integer> ob=new HashMap<>();

        for (int el : arr) {
            if (!ob.containsKey(el)) {
                ob.put(el, 1);
            } else {
                int x = ob.get(el);
                ob.put(el, x + 1);
            }
        }
        System.out.println(ob.entrySet());

        int keyForMax=Integer.MIN_VALUE;
        int Maxfreq=0;

        //by traversing on the keyset;
//        for(var Key:ob.keySet()){
//            if(ob.get(Key)>Maxfreq){
//                Maxfreq=ob.get(Key);
//                keyForMax=Key;
//            }
//        }

        //by treaversing on the whole map
        for(var e:ob.entrySet()){
            if(e.getValue()>Maxfreq){
                Maxfreq=e.getValue();
                keyForMax=e.getKey();
            }
        }
        System.out.println("max frq is "+Maxfreq+" and the digit who has maxFreq is "+keyForMax);
    }
}
