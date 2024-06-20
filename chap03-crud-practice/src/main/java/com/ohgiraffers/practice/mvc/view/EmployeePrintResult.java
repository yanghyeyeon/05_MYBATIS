package com.ohgiraffers.practice.mvc.view;

import com.ohgiraffers.practice.mvc.dto.EmployeeDTO;

import java.util.List;

public class EmployeePrintResult {
    public void printEmployeeList(List<EmployeeDTO> empList) {

        for(EmployeeDTO emp : empList) {
            System.out.println(emp);
        }
    }

    public void printEmployee(EmployeeDTO emp) {
        System.out.println(emp);
    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {

            case "insert" : successMessage = "신입 사원 등록을 성공했습니다."; break;
            case "update" : successMessage = "사원 수정을 성공했습니다."; break;
            case "delete" : successMessage = "사원 삭제를 성공했습니다."; break;
        }

        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "selectList" : errorMessage = "사원 목록 조회를 실패했습니다."; break;
            case "selectOne" : errorMessage = "사원 조회를 실패했습니다."; break;
            case "insert" : errorMessage = "신입 사원 등록을 실패했습니다."; break;
            case "update" : errorMessage = "사원 수정을 실패했습니다."; break;
            case "delete" : errorMessage = "사원 삭제를 실패했습니다."; break;
        }

        System.out.println(errorMessage);
    }
}
