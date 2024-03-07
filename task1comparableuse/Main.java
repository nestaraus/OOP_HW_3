package task1comparableuse;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<Employee> persons = new ArrayList<>();

        persons.add(new Employee("Михаил", 28, 20000));
        persons.add(new Employee("Оксана", 40, 1000000));
        persons.add(new Employee("Олег", 35, 46000));

        System.out.println("Список сотрудников до сортировки:");
        for (Employee employee : persons){
            System.out.println(employee);
        }
        Collections.sort(persons);
        System.out.println("\n Список сотрудников отсортированных по возрасту:");
        for (Employee employee : persons){
            System.out.println(employee);
        }
        
        Collections.sort(persons, new EmployeeSalaryComparator());

        System.out.println("\n Список сотрудников после сортировки по возрасту:");
        for (Employee employee : persons) {
            System.out.println(employee);
        }
    }   

}
