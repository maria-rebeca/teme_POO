import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String concat = "Ana";
        concat = concat + " are " + "mere";
        System.out.println(concat);

        String prop = "Ana are mere";

        if (concat == prop) {
            System.out.println(concat + " (==) " + prop);
        } else{
            System.out.println(concat + " (!=) " + prop);
        }

        if (concat.equals(prop)) {
            System.out.println(concat + " (equals) " + prop);
        } else{
            System.out.println(concat + " (not equals) " + prop);
        }
    }
}
