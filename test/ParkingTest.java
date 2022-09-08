import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ParkingTest {

    @Test
    void placeParking() {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            cars.add(i, new Car());
        }
        Parking p = new Parking(500, cars);
        Assertions.assertEquals("Places: 480", p.placeParking());

    }

    @Test
    void placeParking2() {
        List<Car> cars1 = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            cars1.add(i, new Car());
        }
        Parking p1 = new Parking(500, cars1);
        Assertions.assertEquals("Parking is full", p1.placeParking());
    }


    @Test
    void maxPlaces() {
        List<Car> cars = new ArrayList<>();
        Parking p = new Parking(500, cars);
        Assertions.assertEquals(500, p.maxPlaces());
    }


}