import java.util.*;
import java.util.Collections;
public class leader
{
    static ArrayList<Integer> leaderr(int[] arr){
   ArrayList<Integer> res=new ArrayList<>();
   int n=arr.length;
   int maxlent=arr[n-1];
   res.add(maxlent);
   for(int i=n-2;i>=0;i--){
    if(arr[i]>maxlent){
        maxlent=arr[i];
        res.add(maxlent);
    }
}
    Collections.reverse(res);

   
return res;
}
    public static void main(String[] args) {
        int[] arr={12,17,2,5,2,3};
        ArrayList<Integer> result=leaderr(arr);
        for(int res : result){
            System.out.println(res);
        }
        System.out.println();
        
    }
}