import java.util.Scanner;

public class Main
{
    static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int varsta, sex, inaltime;
        short info_impachetata;

        System.out.print("varsta = ");
        varsta = in.nextInt();
        System.out.print("sex = ");
        sex =  in.nextInt();
        System.out.print("inaltime = ");
        inaltime = in.nextInt();

        info_impachetata = (short)(((varsta<<1|sex)<<8)|inaltime);
        System.out.println(info_impachetata);

        inaltime = info_impachetata & 0xff;
        sex = (info_impachetata>>>8)&1;
        varsta = (info_impachetata>>>9)&0x7f;

        System.out.println(varsta + " " + sex + " " + inaltime);
    }
}
