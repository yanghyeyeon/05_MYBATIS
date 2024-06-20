package com.ohgiraffers.practice.remix;

import java.util.List;

public interface EmployeeMapper {

    List<EmployeeDTO> selectAllEmployee();

    EmployeeDTO selectEmployeeByCode(String empId);

    int insertEmployee(EmployeeDTO emp);

    int modifyEmployee(EmployeeDTO emp);

    int deleteEmployee(String empId);

}
