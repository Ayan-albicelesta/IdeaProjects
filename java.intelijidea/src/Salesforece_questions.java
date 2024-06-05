public class Salesforece_questions {
    public static void main(String[] args) {
        int arr[]={2,-2,7,7,34,67,-9,0,-2,4,5,-6};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            if(arr[i]<0){
                int j=i;
                j++;
                while (j<arr.length && arr[j]>=0){// VVI**--><arr.length && arr[j]>=0 this condition have to be in order
                    sum=sum+arr[j];
                    j++;
                }
            }
            if(sum>temp){
                temp=sum;
            }
        }
        System.out.println(temp);

        /*int arr[]={2,-2,7,7,34,67,-9,0,-2,4,5,-6};
        Arrays.sort(arr);
        int i=0;int j=arr.length-1;
        for(int k=0;k<arr.length/2;k++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        Scanner sc=new Scanner(System.in);
        for(int in:arr){
            System.out.print(in+" ");
        }
        System.out.println("take position ");
        int nTh=sc.nextInt();
         int count=0;
        int n=0;
        while(count<nTh-1){
            int k=n;
            while (arr[k]==arr[k+1]){
                k++;
            }
            k++;
            n=k;
            count++;
        }
//        System.out.println(n);
        System.out.println(arr[n]);*/
    }
}
