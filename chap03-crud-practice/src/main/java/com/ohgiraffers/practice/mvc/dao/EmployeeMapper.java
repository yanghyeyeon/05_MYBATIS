package com.ohgiraffers.practice.mvc.dao;

import com.ohgiraffers.practice.mvc.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeMapper {

    List<EmployeeDTO> selectAllEmployee();

    EmployeeDTO selectEmployeeByCode(String empId);

    EmployeeDTO selectEmployeeByName(String empName);

    int insertEmployee(EmployeeDTO emp);

    int modifyEmployee(EmployeeDTO emp);

    int deleteEmployee(String empId);

}
