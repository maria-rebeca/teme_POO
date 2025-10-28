import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MatriceComplexe a = new MatriceComplexe(2, 2);
        MatriceComplexe b = new MatriceComplexe(2,2);

        Complex c1 = new Complex(1, 2);
        a.set(0,0,c1);
        a.set(1,0,new Complex(3,4));
        a.set(0,1,new Complex(5,6));
        a.set(1,1,new Complex(7,8));
        b.set(0,0,new Complex(2,1));
        b.set(1,0,new Complex(4,3));
        b.set(0,1,new Complex(5,6));
        b.set(1,1,new Complex(8,7));

        MatriceComplexe rezultat = a.multiplyByScalar(new Complex(4,0));
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(rezultat.get(i,j) + " ");
            }
            System.out.println();
        }

    }
} 