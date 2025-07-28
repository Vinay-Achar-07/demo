public class dublicat {
    static int removedub(int[] arr){
        int n= arr.length;
        if(n<=1){
            return n;
        }
        int index=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr[index++]=arr[i];
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,6,6};
        int newarr=removedub(arr);
        for(int i=1;i<=newarr;i++){

        System.out.println(i);
        }       

    }
    
}
