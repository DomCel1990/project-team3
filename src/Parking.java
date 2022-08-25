public class Parking {

    private String name;
    private int floor;
    private int numberOfPlaces;
    private String sectors;
    private Employee employee;

    public Parking(String name, int floor, int numberOfPlaces, String sectors, Employee employee) {
        this.name = name;
        this.floor = floor;
        this.numberOfPlaces = numberOfPlaces;
        this.sectors = sectors;
        this.employee = employee;
    }


    public int maxPlaces(){
    return numberOfPlaces;
    }

    @Override
    public String toString() {
        return "Parking : " +
                  name  + " " + floor + " " + numberOfPlaces + " " + sectors  + " " + employee;
    }
}
