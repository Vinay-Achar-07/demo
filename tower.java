public class tower {
    public static void hanai(int n,String star,String end,String temp){
        if(n==1){
            System.out.println(n+"from"+star+"to "+end) ;
            return;
        }
        hanai(n-1,star, temp, end);
        System.out.println(n+"from"+star+"to "+end);
        hanai(n-1,temp, end, star);
    }
    public static void main(String[] args) {
        int n=3;
       hanai(n,"a", "c", "b" );
    }
}
 