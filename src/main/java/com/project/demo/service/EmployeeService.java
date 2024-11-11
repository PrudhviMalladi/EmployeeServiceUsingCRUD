package com.project.demo.service;

import com.project.demo.dao.EmployeeDB;
import com.project.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeDB employeeDB;

    public List <Employee> listAll(){
        return employeeDB.findAll();
    }

    public void save(Employee employee){
        employeeDB.save(employee);

    }

    public Employee get(long id) {
        return employeeDB.findById(id).orElseThrow(() -> new NoSuchElementException("Employee not found"));
    }
    public void delete(long id) {
        employeeDB.deleteById(id);
    }
}
