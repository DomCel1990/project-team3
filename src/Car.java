import java.util.Random;

public class Car {

    public int calculateCar(){
        Random r = new Random();
        int numberOfCar= r.nextInt(0,500);
        return numberOfCar;
    }
}
