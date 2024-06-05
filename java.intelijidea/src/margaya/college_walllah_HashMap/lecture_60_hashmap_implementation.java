package margaya.college_walllah_HashMap;

import java.util.Deque;
import java.util.LinkedList;

public class lecture_60_hashmap_implementation {
    public static final int DEFAULT_SIZE=4;
    public static final float LOAD_FACTOR=0.75f;

    static class MyHashmap<K,V> {

        class Node{
            K keyy;
            V val;
            Node(K key,V value){
                this.keyy=key;
                this.val=value;
            }
        }
        private LinkedList<Node>[] buckets;
        private int n;
        MyHashmap(){
           initBuckets(DEFAULT_SIZE);
        }

        private void initBuckets(int Size) {
            buckets=new LinkedList[Size];
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
        }

        private int HashFunc(K key) {
            int m=key.hashCode();
            return Math.abs(m)% buckets.length;
        }

        public void put(K key, V value){

             int bi=HashFunc(key);
             LinkedList<Node> currentBucket=buckets[bi];
             int ei=searchInBucket(currentBucket,key);

             if(ei==-1){
                 Node node=new Node(key,value);
                 currentBucket.add(node);
                 n++;
             }
             else {
                 Node temp=currentBucket.get(ei);
                 temp.val=value;
             }

             if(n>=buckets.length*LOAD_FACTOR){
                 rehash();
             }
        }

        private void rehash() {
            LinkedList<Node>[] Oldbuckets=buckets;
            initBuckets(2*Oldbuckets.length);
            n=0;
            for(var linklist:Oldbuckets){
                for(var nod: linklist){
                    put(nod.keyy,nod.val);
                }
            }
        }

        private int searchInBucket(LinkedList<Node> currentBucket,K key) {
             for(int i=0;i<currentBucket.size();i++){
                 if(currentBucket.get(i).keyy==key){
                     return i;
                 }
             }
             return -1;
        }

        public  int size(){
            return n;
        }

         public V get(K key){
            int bi=HashFunc(key);
            LinkedList<Node> currentBucket=buckets[bi];
            int index=searchInBucket(currentBucket,key);

            if(index==-1){
                return null;
            }
            else {
               return currentBucket.get(index).val;
            }
         }

        public V remove(K key){
            int bi=HashFunc(key);
            LinkedList<Node> currentBucket=buckets[bi];
            int index=searchInBucket(currentBucket,key);

            if(index==-1){
                return null;
            }
            else {
                Node curNode=currentBucket.get(index);
                V m=curNode.val;
                currentBucket.remove(index);
                n--;
                return m;
            }
        }

        public int Maxcapacity(){
           return buckets.length;
        }

    }


    public static void main(String[] args) {

      MyHashmap<String,Integer> ob=new MyHashmap<>();
      ob.put("a",1);
      ob.put("b",2);
      ob.put("c",3);
      ob.put("d",4);
      System.out.println(ob.size());

      System.out.println(ob.get("d"));

        System.out.println(ob.remove("k"));

        System.out.println(ob.remove("a"));

        System.out.println(ob.size());

        ob.put("c",9);
        System.out.println(ob.get("c"));
        System.out.println(ob.size());


        ob.put("z",87);
        ob.put("x",90);
        System.out.println("capacity is "+ob.Maxcapacity());
    }

}
