package Ex02;

public class Employee {
    int idNum;
    double hourlyWage;


    public Employee(int idNum, double hourlyWage) throws EmployeeException {
        this.idNum = idNum;
        this.hourlyWage = hourlyWage;

        if (hourlyWage < 5.0 || hourlyWage > 50.0) {
            throw new EmployeeException("Invalid hourly wage: " + hourlyWage);
        }
    }
}
