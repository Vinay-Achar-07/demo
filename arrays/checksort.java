//check if arrays are sorted or not

public class checksort{
    static boolean issorted (int[] arr){
        int n=arr.length-1;
        //itirat over the array
        for(int i=1;i<=n;i++){
            //check privious element is small oe not
            if(arr[n-1]>arr[n]){

            
             return false;
            }
        }
            
         return true;
    }

    public static void main(String[] args) {
       int[] arr={1,2,3,7,5,6};
         int n =arr.length-1;
       if(issorted(arr)){
        System.out.println("Array are sorted");
       } else{
        System.out.println("Array are not sorted");
       }
    }
    
}
