public class recursion {
    public static int recfun(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return recfun(x,n/2)*recfun(x,n/2);
        }
        else{
            return recfun(x,n/2)*recfun(x,n/2)*x; 
        }
    }
    public static void main(String[] args) {
        int x=3;
        int n=5;
        int num=recfun(x, n);
        System.out.println(num);
    }
}
