package com.ohgiraffers.practice.remix;

import java.util.List;

public interface EmployeeMapper {

    List<EmployeeDTO> selectAllEmployee();

    EmployeeDTO selectEmployeeByCode(String empId);

    EmployeeDTO selectEmployeeByName(String empName);

    int insertEmployee(EmployeeDTO emp);

    int modifyEmployee(EmployeeDTO emp);

    int deleteEmployee(String empId);
}
