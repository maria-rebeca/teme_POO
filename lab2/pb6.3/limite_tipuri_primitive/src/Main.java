//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    byte myByteVar = Byte.MAX_VALUE;
    System.out.println("If you add 1 to " + myByteVar + " you get " + (byte)(myByteVar+1));

    short myShortVar = Short.MAX_VALUE;
    System.out.println("If you add 1 to " + myShortVar + " you get " + (short)(myShortVar+1));

    int myIntVar = Integer.MAX_VALUE;
    System.out.println("If you add 1 to " + myIntVar + " you get " + (int)(myIntVar+1));

    long myLongVar = Long.MAX_VALUE;
    System.out.println("If you add 1 to " + myLongVar + " you get " + (long)(myLongVar+1));

    System.out.println();

    myByteVar=Byte.MIN_VALUE;
    System.out.println("If you remove 1 from " + myByteVar + " you get " + (byte)(myByteVar-1));

    myShortVar=Short.MIN_VALUE;
    System.out.println("If you remove 1 from " + myShortVar + " you get " + (short)(myShortVar-1));

    myIntVar=Integer.MIN_VALUE;
    System.out.println("If you remove 1 from " + myIntVar + " you get " + (int)(myIntVar-1));

    myLongVar=Long.MIN_VALUE;
    System.out.println("If you remove 1 from " + myLongVar + " you get " + (long)(myLongVar-1));

    System.out.println();

    float myFloatVar = Float.MAX_VALUE;
    System.out.println("By multiplying " + myFloatVar + " by 2, you get " + (myFloatVar*2));

    double myDoubleVar = Double.MAX_VALUE;
    System.out.println("By multiplying " + myDoubleVar + " by 2, you also get " + (myDoubleVar*2));

    System.out.println();

    float f = 1.1234567890123456789f; //am scris mai mult de 7 zecimale
    double d = 1.12345678901234567890123456789; //am scris mai mut de 15 zecimale

    System.out.println("The float rounded to 7 decimals is " + f);
    System.out.println("The double rounded to 15 decimals is " + d);

    System.out.println();

    System.out.println("If you add 1 to " + f + " you get " + (float)(f+1));
    System.out.println("If you add 1 to " + d + " you get " + (double)(d+1));

}
