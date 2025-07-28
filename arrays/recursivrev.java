public class recursivrev {
    static void recrev(int[] arr,int srt,int end){
     if(srt>=end){
        return;
     }

        int temp=arr[srt];
        arr[srt]=arr[end];
        arr[end]=temp;

        recrev(arr, srt++,end--);
    }
    static void recrec(int[] arr){
        int n= arr.length;
        recrev(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        recrec(arr);
        for(int i=0;i<=arr.length;i++)
        System.out.println(arr[i]);
    }
    
}
