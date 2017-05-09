package com.sunita.dao;

/**
 *
 * @author snam joshi
 */
import java.util.List;

import com.sunita.model.Employee;

public interface EmployeeDao {

    Employee findById(int id);

    void saveEmployee(Employee employee);

    void deleteEmployeeBySsn(String ssn);

    List<Employee> findAllEmployees();

    Employee findEmployeeBySsn(String ssn);

}
