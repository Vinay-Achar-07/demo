public class revarray {
    static void rev(int[] arr){
        int n=arr.length;
        int s=0;int e=arr.length-1;
        while(s<e){
            
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2,3,4};
    rev(arr);
for(int i=0;i<=arr.length;i++){
    System.out.println(arr[i]);
}    }
    
}
