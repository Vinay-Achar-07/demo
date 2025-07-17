public class sumofnum {
    static int sumnum(int n){
        
        int sum=0;
        if(n<=0){
            return 0;
        }
        return (n%10)+sumnum(n/10);
    }
    public static void main(String[] args) {
        
        int n=345;
        System.out.println(sumnum(n));
    }
}
