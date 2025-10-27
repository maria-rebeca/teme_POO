import java.awt.*;

public class Autovehicul {
    private String brand;
    private Color color;
    private int currentSpeed;
    private int currentGear;
    private int maxSpeed;
    private int maxGear;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setCurrentSpeed(int speed) {
        if(speed <= 0){
            this.currentSpeed = 0;
        }
        else if(speed >= maxSpeed){
            this.currentSpeed = maxSpeed;
        }
        else{
            this.currentSpeed = speed;
        }
    }

    public void setCurrentGear(int currentGear) {
        if(currentGear <= 0){
            this.currentGear = 0;
        }
        else if(currentGear >= maxGear){
            this.currentGear = maxGear;
        }
        else{
            this.currentGear = currentGear;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed <= 0){
            this.maxSpeed = 0;
        }
        else{
            this.maxSpeed = maxSpeed;
        }
    }

    public void setMaxGear(int maxGear) {
        if(maxGear <= 0){
            this.maxGear = 0;
        }
        else{
            this.maxGear = maxGear;
        }
    }


    public String getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getMaxGear() {
        return maxGear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Autovehicul(String brand, Color color, int currentSpeed, int currentGear, int maxSpeed, int maxGear) {
        this.brand = brand;
        this.color = color;
        setCurrentSpeed(currentSpeed);
        setCurrentGear(currentGear);
        setMaxSpeed(maxSpeed);
        setMaxGear(maxGear);
    }

    Autovehicul(){
        this("Unknown", Color.BLACK, 0, 0, 220, 5);
    }



    public void accelerate(int kmToAccelerate) {
        setCurrentSpeed(getCurrentSpeed() + kmToAccelerate);
    }

    public void decelerate(int kmToDecelerate) {
        setCurrentSpeed(getCurrentSpeed() - kmToDecelerate);
    }

    public void changeGear(int chosenGear) {
        setCurrentGear(chosenGear);
    }

    public void stop(){
        setCurrentGear(0);
        setCurrentSpeed(0);
    }

    @Override
    public String toString() {
        return String.format("[Autovehicul: %s | Viteza: %d km/h | Treapta: %d]",
                this.brand,
                this.currentSpeed,
                this.currentGear);
    }
}
