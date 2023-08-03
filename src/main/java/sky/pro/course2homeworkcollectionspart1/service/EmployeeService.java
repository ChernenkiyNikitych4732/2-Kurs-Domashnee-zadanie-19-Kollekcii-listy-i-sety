package sky.pro.course2homeworkcollectionspart1.service;

import sky.pro.course2homeworkcollectionspart1.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstName, String lastName);
    Employee remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);

    Collection<Employee> findAll();
}