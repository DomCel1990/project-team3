/**
 * @Author Emilio
 * Created Class Parking
 */

public class Parking extends Car {

    private String name;
    private int floor;
    private int parkingCapacity;
    private String sectors;
    private Employee employee;

    //CONSTRUCTOR FOR TEST
    public Parking(int parkingCapacity) {
        this.parkingCapacity = parkingCapacity;

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
     * @param car
     * @return places
     * The calculateFreePlaces method is used to calculate the free places in parking
     */
    public String calculateFreePlaces(Car car) {
        int places = parkingCapacity - car.calculateCar();
        if (places <= 0) {
            System.out.println("The parking is full");
        } else System.out.println(places);
        return "";
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

