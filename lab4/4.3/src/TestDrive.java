import java.awt.*;
import java.util.*;

public class TestDrive {

    public static int kmDriven(int speed, int time) {
        //v=d/t => d=v*t
        return speed * time;
    }

    public static void simulateDriving(Autovehicul car){

        System.out.println("Stare initiala: "+car);

        car.accelerate(20);
        System.out.println("Masina a accelerat "+car);

        car.changeGear(5);
        System.out.println("Schimbare viteza "+car);

        car.accelerate(30);
        System.out.println("Masina a accelerat "+car);

        int distance = kmDriven(car.getCurrentSpeed(), 30);
        System.out.println("Dupa 30 de min in acest ritm, masina a parcurs: "+distance+" km");

        car.decelerate(100);
        System.out.println("Masina a decelerat "+car);

        car.changeGear(1);
        System.out.println("Schimbare viteza "+car);

        car.stop();
        System.out.println("Masina a oprit "+car);
    }

    public static void main(String[] args) {
        Autovehicul mercedes = new Autovehicul("Mercedes", Color.CYAN, 100, 4, 300, 6);
        simulateDriving(mercedes);
    }
}
