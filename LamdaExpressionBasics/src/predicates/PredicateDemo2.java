package predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
    String ename;
    int salary;
    int experience;

    Employee(String name, int sal, int exp) {
        ename = name;
        salary = sal;
        experience = exp;
    }
}

public class PredicateDemo2 {
    public static void main(String[] args) {
        //Ex 01
        Employee employee = new Employee("Jhon", 50000, 3);
        //emp obj --> return name if sal>30k , exp>3
        Predicate<Employee> pr = e -> (e.salary > 30000 && e.experience > 2);
        System.out.println(pr.test(employee));

        //Ex 02
        ArrayList<Employee> employees =new ArrayList<Employee>();
        employees.add(new Employee("Jhon", 50000, 3));
        employees.add(new Employee("Stefan", 40000, 5));
        employees.add(new Employee("Jhon", 50000, 2));
        employees.add(new Employee("Jhon", 60000, 3));

        for (Employee e:employees)
        {
            if (pr.test(e)){
                System.out.println(e.ename+" " + e.salary+" ");
            }
        }
    }
}
