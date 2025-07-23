public class maxlen{
    public static void main(String[] args) {
        int[] arr={1,17,2,4,5,2};
        int n=arr.length;
        int res=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>res){
                res=arr[i];
                res++;
            
            }
        
        }
        System.out.println(res);
    }
}