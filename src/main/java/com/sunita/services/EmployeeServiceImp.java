package com.sunita.services;

/**
 *
 * @author snam joshi
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunita.dao.EmployeeDao;
import com.sunita.model.Employee;

@Service
@Transactional
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeDao dao;

    public Employee findById(int id) {
        return dao.findById(id);
    }

    public void saveEmployee(Employee employee) {
        dao.saveEmployee(employee);
    }
  
    public void updateEmployee(Employee employee) {
        Employee entity = dao.findById(employee.getId());
        if (entity != null) {
            entity.setName(employee.getName());
            //entity.setJoiningDate(employee.getJoiningDate());         
            entity.setMobilenumber(employee.getMobilenumber());
            entity.setPassword(employee.getPassword());
            entity.setRole(employee.getRole());
            entity.setSsn(employee.getSsn());
            
            entity.setSalary(employee.getSalary());
            entity.setSsn(employee.getSsn());
        }
    }

    public void deleteEmployeeBySsn(String ssn) {
        dao.deleteEmployeeBySsn(ssn);
    }

    public List<Employee> findAllEmployees() {
        return dao.findAllEmployees();
    }

    public Employee findEmployeeBySsn(String ssn) {
        return dao.findEmployeeBySsn(ssn);
    }

    public boolean isEmployeeSsnUnique(Integer id, String ssn) {
        Employee employee = findEmployeeBySsn(ssn);
        return (employee == null || ((id != null) && (employee.getId() == id)));
    }

}
