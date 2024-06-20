package com.ohgiraffers.practice.mvc.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeView {

    // 사원코드를 입력받는 메서드
    public Map<String, String> inputEmployeeCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("사원 코드를 입력하세요 : ");
        String empId = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId",empId);

        return parameter;
    }

    // 사원이름을 입력받는 메서드
    public Map<String, String> inputEmployeeName() {

        Scanner sc = new Scanner(System.in);
        System.out.print("사원 이름를 입력하세요 : ");
        String empName = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empName",empName);

        return parameter;
    }

    // 메뉴 정보를 입력받는 메서드
    public Map<String, String> inputEmployee() {

        Scanner sc = new Scanner(System.in);
        System.out.print("사원 코드을 입력하세요 : ");
        String empId = sc.nextLine();
        System.out.print("사원 이름을 입력하세요 : ");
        String empName = sc.nextLine();
        System.out.print("사원 주민번호를 입력하세요 : ");
        String empNo = sc.nextLine();
        System.out.print("사원 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("사원 전화번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("사원 직급 코드를 입력하세요 : ");
        String jobCode = sc.nextLine();
        System.out.print("사원 급여 코드를 입력하세요 : ");
        String salLevel = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();

        parameter.put("empId",empId);
        parameter.put("empName",empName);
        parameter.put("empNo",empNo);
        parameter.put("email",email);
        parameter.put("phone",phone);
        parameter.put("jobCode",jobCode);
        parameter.put("salLevel",salLevel);

        return parameter;
    }

    public Map<String, String> inputModifyEmployee() {

        Scanner sc = new Scanner(System.in);

        System.out.print("수정할 사원 코드을 입력하세요 : ");
        String empId = sc.nextLine();
        System.out.print("수정할 사원 이름을 입력하세요 : ");
        String empName = sc.nextLine();
        System.out.print("수정할 사원 주민번호를 입력하세요 : ");
        String empNo = sc.nextLine();
        System.out.print("수정할 사원 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("수정할 사원 전화번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("수정할 사원 직급 코드를 입력하세요 : ");
        String jobCode = sc.nextLine();
        System.out.print("수정할 사원 급여 코드를 입력하세요 : ");
        String salLevel = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();

        parameter.put("empId",empId);
        parameter.put("empName",empName);
        parameter.put("empNo",empNo);
        parameter.put("email",email);
        parameter.put("phone",phone);
        parameter.put("jobCode",jobCode);
        parameter.put("salLevel",salLevel);


        return parameter;
    }
}
