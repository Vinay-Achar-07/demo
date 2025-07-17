import java.util.*;
public class selection {
    public static int binary(int[] arr,int key){
        int low=0 ;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            for(int i=0;i<arr.length-1;i++){  
            if(arr[mid]==key){
                return mid;
            }
            else if(key>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int key=10;
      System.out.println(  binary(arr,key));
    
    }
}
