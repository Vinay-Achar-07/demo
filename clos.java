
public class clos {
    public static int closest(int n,int m){
        int q=n/m;
        int n1=m*q;
        int n2=(n*m)>0? (m*(q+1)):(m*(q-1));
        if(Math.abs(n-n1)<(Math.abs(n-n2))){
            return n1;
        }
        return n2;
    }
    public static void main(String[] args) {
        int n=-15,m=4;
        System.out.println(closest(n, m));
        
    }
}
