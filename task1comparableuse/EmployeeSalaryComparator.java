package task1comparableuse;
import java.util.Comparator;
public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee person1, Employee person2) {
        return Integer.compare(person1.getSalary(), person2.getSalary());
    }
}
