public class rec1 {
     public static int recfun(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int pownum=recfun(x, n-1);
        int calpow=pownum*x;
        return calpow;
    }
    public static void main(String[] args) {
         int x=3;
        int n=5;
        int num=recfun(x, n);
        System.out.println(num);
    }
}
