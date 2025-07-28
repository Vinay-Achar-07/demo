import java.util.HashSet;

public class duphash {
    static int hashdup(int[] arr){
        HashSet<Integer> s=new HashSet<>();
        int n=arr.length;
        if(n<=1){
            return n;
        }
        int indx=1;
        for(int i=1;i<n;i++){
            if(!s.contains(arr[i])){
                s.add(arr[indx]);
                indx++;
                
            }

        }
        return indx;
    }
    public static void main(String[] args) {
        
         int[] arr={1,2,3,4,5,4,3,3};
        int newarr=hashdup(arr);
        for(int i=0;i<=newarr;i++){

        System.out.println(i);
        }       

    }
    
}
