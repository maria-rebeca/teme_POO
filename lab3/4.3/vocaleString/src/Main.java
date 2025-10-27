import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //a
        System.out.print("Enter the string: ");
        String str = in.nextLine();

        int nrVocale=0, nrConsoane=0;
        str =  str.toLowerCase();

        for(int i = 0;i<str.length();i++){
            switch (str.charAt(i)){
                case 'a':
                    nrVocale++;
                    break;

                case 'e':
                    nrVocale++;
                    break;

                case 'i':
                    nrVocale++;
                    break;

                case 'o':
                    nrVocale++;
                    break;

                case 'u':
                    nrVocale++;
                    break;

                default:
                    nrConsoane++;

            }
        }
        System.out.println(("numarul de consoane: "+nrConsoane));
        System.out.println(("numarul de vocale: "+nrVocale));

        //b
        System.out.print("introduceti vocala: ");
        char vocala = in.next().charAt(0);
        boolean ok = false;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)==vocala){
                ok = true;
                System.out.println("vocala "+vocala+" se afla pe pozitia "+i);
            }
        }
        if(!ok){
            System.out.println(("vocala "+vocala+" nu se afla in cuvant"));
        }
    }
}
