import java.util.*;

public class Goldbach {

    static boolean prim(int x){
        if(x<2)  return false;
        if(x==2) return true;
        if(x%2==0)return false;
        for(int d = 3; d*d <= x; d+=2 ){
                if(x%d==0) return false;
            }
            return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("m = ");
        int m = in.nextInt();
        System.out.print("n = ");
        int n = in.nextInt();
        boolean ok;
        if(m%2!=0){
            m++;
        }
        for(int x = m; x <= n; x+=2){
            ok=false;
            for(int i = 2; i <= x/2 && !ok; i++) {
                if (prim(i) && prim(x - i)) {
                    ok = true;
                    System.out.println(i + " + " + (x - i) + " = " + x);
                }
            }

            if(!ok){
                System.out.print("nu exista pt "+x);
            }
        }
    }
}
