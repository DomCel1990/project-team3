import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        List<TecnologyProducts> techProductList=new ArrayList<>();
        List<Employee> employeeList=new ArrayList<>();
        /*for (int i = 0; i <1 ; i++) {
            employeeList.add(i,new Employee("Domenico","Celani",32,r.nextInt(167,188),r.nextBoolean(),
                    LocalDate.of(r.nextInt(2000,2021),r.nextInt(1,12), r.nextInt(1,30)),true,12344,"33444", EmployeeRole.getRandomRoles()));
            System.out.println("Salary is: "+employeeList.get(i).salaryCalculator(employeeList.get(i)));
        }*/
        for (int i = 0; i <1 ; i++) {
            techProductList.add(i,new TecnologyProducts("fdff",r.nextDouble(200.0,5000.0),
                    r.nextDouble(400.0,6000.0),"dgf","fdfddf"));
        }

        System.out.println(employeeList);
        System.out.println(techProductList);

        TechnologyStore t = new TechnologyStore("dd","sdd",techProductList,"323",
                "www.ddldl.co",employeeList,DayEnum.FRIDAY);

        System.out.println(t.outputCalculation());
        System.out.println(t.outputCalculation());
    }
}