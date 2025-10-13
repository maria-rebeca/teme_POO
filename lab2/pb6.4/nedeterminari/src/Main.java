
public class Main {
    public static void main(String[] args) {
        int x = 100;
        int zero = 0;
        try {
            System.out.println(x / zero);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        float fn = -100.0f;
        try {
            System.out.println(fn / zero);
        } catch  (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        float fp = 100.0f;
        try {
            System.out.println(fp/ zero);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        float infinity1 = 100.0f;
        infinity1/=zero;
        float infinity2 = 100.0f;
        infinity2/=zero;
        try{
            System.out.println(infinity1-infinity2);
        } catch (ArithmeticException e) {
            System.out.println("Undefined");
        }

        float infinity3 = -100.0f;
        try {
            System.out.println(infinity1*infinity3);
        } catch (ArithmeticException e) {
            System.out.println("Undefined");
        }

        boolean bool;
        //bool = 2; "incompatible types: int cannot be converted to boolean"
        bool = true;
        System.out.println("Booleans can only be true or false!");

        int k;
        //k = 1.5f; incompatible types: possible lossy conversion from float to int
        k = 1;
        System.out.println("You can't assign float/double to int in Java!");
    }
}

