import java.util.*;
public class bub {
    public static void main(String[] args) {
        int[] arr={2,7,4,1,8,6};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(i);
        }
        
    }
}
