import java.math.BigInteger;
import java.util.List;

public interface EmployeeIsFace {
    public Employee addNewEmployee(Employee employee);
    public String updateEmployeeInfo(int id);
    public String deletePlayers(int id);
    public List<Employee> displayAll();
    public List<Employee> filterByClub(String club);
    public List<Employee> filterByGender(String gender);
}
