public class demo {
    public static void main(String[] args) {
        int[] arr={2,3,1,5,4};
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
