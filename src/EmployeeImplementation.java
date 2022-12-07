import java.math.BigInteger;
import java.util.List;

public class EmployeeImplementation implements EmployeeIsFace{

    Employee employee = new Employee();
    @Override
    public Employee addNewEmployee(Employee employee) {
        employee.getId();
        employee.getFirstname();
        employee.getLastname();
        employee.getClub();
        employee.getContact();
        employee.getGender();

        return employee;
    }

    @Override
    public String updateEmployeeInfo(int id) {
        return null;
    }

    @Override
    public String deletePlayers(int id) {
        return null;
    }

    @Override
    public List<Employee> displayAll() {
        return null;
    }

    @Override
    public List<Employee> filterByClub(String club) {
        return null;
    }

    @Override
    public List<Employee> filterByGender(String gender) {
        return null;
    }
}
