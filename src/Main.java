import com.example.service.EmployeeService;
import com.example.model.Employee;
import com.example.model.Department;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        employeeService.addEmployee(new Employee("John Doe", 1, Department.IT, 70000));
        employeeService.addEmployee(new Employee("Jane Smith", 2, Department.HR, 65000));

        System.out.println("Employees sorted by name:");
        employeeService.sortEmployeesByName().forEach(System.out::println);

        System.out.println("\nEmployees in IT department:");
        employeeService.getEmployeesByDepartment(Department.IT).forEach(System.out::println);
    }
}
