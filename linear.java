public class linear {
    public static int linearsearch(int[] arr,int key){
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
         int[] arr={48,3,2,9,8,7,6,5,0,3};
        int key=8;
        System.out.println(linearsearch(arr, key));
        
    }
}
