package com.ohgiraffers.practice.mvc.controller;


import com.ohgiraffers.practice.mvc.dto.EmployeeDTO;
import com.ohgiraffers.practice.mvc.service.EmployeeService;
import com.ohgiraffers.practice.mvc.view.PrintResult;

import java.util.List;
import java.util.Map;

public class EmployeeController {

    private final PrintResult printResult;
    private final EmployeeService employeeService;

    public EmployeeController() {

        // 생성자 주입
        printResult = new PrintResult();
        employeeService = new EmployeeService();
    }

    // 전체 조회
    public void selectAllEmployee() {

        List<EmployeeDTO> employeeList = employeeService.selectAllEmployee();

        if (employeeList != null) {
            printResult.printEmployeeList(employeeList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    // 메뉴코드로 단건 조회
    public void selectEmployeeByCode(Map<String, String> parameter) {

        String empId = parameter.get("empId");

        EmployeeDTO employee = employeeService.selectEmployeeByCode(empId);

        if (employee != null) {
            printResult.printEmployee(employee);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    // 사원이름으로 조회
    public void selectEmployeeByName(Map<String, String> parameter) {

        String empName = parameter.get("empName");

        EmployeeDTO employee = employeeService.selectEmployeeByName(empName);

        if (employee != null) {
            printResult.printEmployee(employee);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    // 신규 메뉴 등록
    public void registEmployee(Map<String, String> parameter) {

        String empId = parameter.get("empId");
        String empName = parameter.get("empName");
        String empNo = parameter.get("empNo");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");

        EmployeeDTO employee = new EmployeeDTO();

        employee.setEmpId(empId);
        employee.setEmpName(empName);
        employee.setEmpNo(empNo);
        employee.setEmail(email);
        employee.setPhone(phone);
        employee.setJobCode(jobCode);
        employee.setSalLevel(salLevel);

        if (employeeService.registEmployee(employee)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    // 메뉴 수정
    public void modifyEmployee(Map<String, String> parameter) {

        String empId = parameter.get("empId");
        String empName = parameter.get("empName");
        String empNo = parameter.get("empNo");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");

        EmployeeDTO employee = new EmployeeDTO();

        employee.setEmpId(empId);
        employee.setEmpName(empName);
        employee.setEmpNo(empNo);
        employee.setEmail(email);
        employee.setPhone(phone);
        employee.setJobCode(jobCode);
        employee.setSalLevel(salLevel);

        if (employeeService.modifyEmployee(employee)) {
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }

    // 메뉴 삭제
    public void deleteEmployee(Map<String, String> parameter) {

        String empId = parameter.get("empId");

        if (employeeService.deleteEmployee(empId)) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }
}
