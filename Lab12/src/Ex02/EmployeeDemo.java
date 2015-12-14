package Ex02;

public class EmployeeDemo {
    private static void createEmployee(int id, double hourlyWage) {
        try {
            Employee employee = new Employee(id, hourlyWage);
            System.out.println("Created employee with id: " + id);
        } catch (EmployeeException employeeException) {
            System.out.println("Could not create employee with id: " + id + "\nError message: " + employeeException.getMessage());
        }
    }

    public static void main(String args[]) {
        // Should throw exception; wage too low
        EmployeeDemo.createEmployee(1, 4.0);
        // Should not throw exception
        EmployeeDemo.createEmployee(2, 7.0);
        // Should throw exception; wage too high
        EmployeeDemo.createEmployee(3, 100.0);
    }
}
