import org.junit.Test;

public class ParkingTest {

    @Test
    public void calculateFreePlaces() {
        Car car = new Car();
        Parking p = new Parking(500);
        Parking p1 = new Parking(350);
        Parking p2 = new Parking(400);

        System.out.println(p.calculateFreePlaces(car));
        System.out.println(p1.calculateFreePlaces(car));
        System.out.println(p2.calculateFreePlaces(car));
    }
}
