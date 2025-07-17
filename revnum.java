public class revnum {
    static int rev(int n){
        int revn=0;
        while (n>0) 
        {
            revn=revn*10+n%10;
            n=n/10;
            /*hello */
            
        }
        return revn;
    }
    public static void main(String[] args) {
        System.out.println(rev(12223));
        
    }
}
