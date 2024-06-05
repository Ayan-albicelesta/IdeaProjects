package margaya.Stack_pepcoding;

import java.util.Stack;

public class Q10_celebrity_problem {
    public static void main(String[] args) {
        int [][]arr={{0,1,1,1,1},
                     {1,0,0,1,0},
                     {1,0,0,1,0},
                     {0,0,0,0,0},//here we can see 3 index is celibrity
                     {0,1,0,1,0}};

        findCeleb(arr);
    }

    private static void findCeleb(int[][] arr) {
        Stack<Integer> ob=new Stack<>();
        for(int i=0;i<arr.length;i++){
            ob.push(i);
        }

        while (ob.size()>=2){//>=2 because every time we are taking two pop, and at last we are taking last two out,and then pushing one back,and there loop will stop
            int j=ob.pop();
            int i=ob.pop();
            if(arr[i][j]==1){
                ob.push(j);
            }
            else {
                ob.push(i);
            }
        }

        int k=ob.pop();//at last one will remain in stack, that may be the possible ans
        for(int i=0;i<arr.length;i++){
            if(k!=i){
                if(arr[k][i]==1 || arr[i][k]==0){//checking if possible ans or not
                    System.out.println("no celeb present");
                    return;
                }
            }
        }
        System.out.println("celeb is "+k);
    }
}
