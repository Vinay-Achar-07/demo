public class tcs {
 public static void main(String[] args) {
     int[] arr={1,2,3,4,5,6};
 
        int n=arr.length;
        int str=0;
        int end=n-1;
        int mid=(str+end)/2;
        int count1=0;
        int count2=0;
        while(str<end){

            if(arr[str]<arr[mid]){
                count1+=arr[i];
            }else if(
              arr[mid+1]<arr[end]){
            
                count2+=arr[i];
            }
            }

            if(count1>count2){
                for(int i=0;i<=n;i++){
                    System.out.println(arr[i]);
                }
            }else{
                for(int i=n-1;i>0;i--){
                    System.out.println((arr[i]));
                }
            }
        }
}

