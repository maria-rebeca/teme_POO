import java.math.BigInteger;

public class Main {
    public static void main() {
        BigInteger sum = BigInteger.ZERO, p;
        for(int i=1; i<=16; i++){
            p=BigInteger.ONE;
            for(int j=1; j<=i; j++){
                p=p.multiply(BigInteger.valueOf(2));
            }
            sum=sum.add(p);
        }
        System.out.println(sum);
    }
}
