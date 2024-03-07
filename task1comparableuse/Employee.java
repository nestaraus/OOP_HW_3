package task1comparableuse;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
    public Integer getSalary(){
        return salary;
    }
    
    @Override
    public int compareTo(Employee otherEmployee){
        return Integer.compare(this.age, otherEmployee.age);
    }
    @Override
    public String toString() {
        return "Employee: " + " name= " 
        + name + " age= "
        + age + " salary= " + salary;
    }
}