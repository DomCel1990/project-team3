package outside;

import staff.Employee;

import java.util.List;

/**
 * @Author Emilio
 * Created Class entities.Parking
 */

public class Parking extends Car {

    private String name;
    private int floor;
    private int parkingCapacity;
    private String sectors;
    private Employee employee;


    private List<Car> cars;
    // costruttore per il metodo
    public Parking(int parkingCapacity, List<Car> cars){
        this.parkingCapacity=500;
        this.cars=cars;
    }

    //CONSTRUCTOR
    public Parking(String name, int floor, int parkingCapacity, String sectors, Employee employee) {
        this.name = name;
        this.floor = floor;
        this.parkingCapacity = parkingCapacity;
        this.sectors = sectors;
        this.employee = employee;
    }

    /**
     * @param
     * @return places
     * The calculateFreePlaces method is used to calculate the free places in parking
     */
    public String placeParking(){
        parkingCapacity = parkingCapacity - cars.size();
        if(parkingCapacity <= 0)
            return "entities.Parking is full";
        else
            return "Places: " + parkingCapacity;
    }

    public int maxPlaces(){
        return parkingCapacity;
    }

    //GETTER AND SETTER
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getFloor() {return floor;}

    public void setFloor(int floor) {this.floor = floor;}

    public int getParkingCapacity() {return parkingCapacity;}

    public void setParkingCapacity(int parkingCapacity) {this.parkingCapacity = parkingCapacity;}

    public String getSectors() {return sectors;}

    public void setSectors(String sectors) {this.sectors = sectors;}

    public Employee getEmployee() {return employee;}

    public void setEmployee(Employee employee) {this.employee = employee;}
}

