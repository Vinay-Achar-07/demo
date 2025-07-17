public class oddeven {
    public static boolean  oddev(int n){
        if((n&1)==0){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        int n=5;
        if(oddev(n)==true){

        
        System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
