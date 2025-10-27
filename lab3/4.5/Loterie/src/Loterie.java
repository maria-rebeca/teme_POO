import java.util.Scanner;

public class Loterie{

    static double combinari(int n, int k){
        double rezultat = 1.0;
        for (int i = 1; i <= k; i++) {
            rezultat = rezultat * (n - i + 1) / i;
        }
        return rezultat;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("nr maxim: ");
        int n = in.nextInt();
        System.out.print("nr de nr extrase: ");
        int k = in.nextInt();

        double sanse = combinari(n, k);
        System.out.println("Pt datele introduse sunt 1 din: "+(long)sanse+" sanse de castig");

        long introduse = 0L;
        int countExtrase = 0;

        while(countExtrase < k){
            int nr = (int) (Math.random() * n) + 1;
            long mask = 1L<<nr;
            if((introduse & mask) == 0){
                introduse = introduse | mask;
                countExtrase++;
            }
        }

        for(int i = 0;i < n;i++){
            long mask = 1L << i;
            if((introduse & mask)!=0 ){
                System.out.print(i + " ");
            }
        }

    System.out.println();

     for(int i = n-1;i > 0;i--){
                long mask = 1L << i;
                if((introduse & mask)!=0 ){
                    System.out.print(i + " ");
                }
            }

    }
}