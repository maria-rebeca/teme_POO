import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 5 integer numbers separated by spaces: ");

 //varianta 1
        for (int i=0; i<5; i++){
            System.out.print(in.next() + " ");
        }
// varianta 2
//        int x;
//        for(int i = 0; i<5; i++){
//            x = in.nextInt();
//            System.out.print(x + " ");
//        }

        System.out.print("Enter 5 float numbers separated by spaces: ");
        for(int i=0; i<5; i++){
            System.out.print(in.nextFloat() + " ");
        }
    }
}
