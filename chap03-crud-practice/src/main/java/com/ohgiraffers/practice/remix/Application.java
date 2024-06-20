package com.ohgiraffers.practice.remix;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    /*
    * 시스템 요구사항
    * 1. 메뉴 전체조회
    * 2. 메뉴 코드로 메뉴 조회
    * 3. 신규 메뉴 추가
    * 4. 메뉴 수정
    * 5. 메뉴 삭제
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();

        do {
            System.out.println("============ 오지라퍼 메뉴 관리 시스템============");
            System.out.println("1. 사원 전체 조회하기");
            System.out.println("2. 사원 코드로 사원 조회하기");
            System.out.println("3. 신입 사원 등록하기");
            System.out.println("4. 사원 수정하기");
            System.out.println("5. 사원 삭제하기");
            System.out.print("사원 관리 번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch(no) {
                case 1: employeeController.selectAllEmployee(); break;
                case 2: employeeController.selectEmployeeByCode(inputEmployeeCode()); break;
                case 3: employeeController.registEmployee(inputEmployee()); break;
                case 4: employeeController.modifyEmployee(inputModifyEmployee()); break;
                case 5: employeeController.deleteEmployee(inputEmployeeCode()); break;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");
                    break;
            }
        } while (true);
    }

    // 메뉴코드를 입력받는 메서드
    private static Map<String, String> inputEmployeeCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("사원 코드를 입력하세요 : ");
        String empId = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId",empId);

        return parameter;
    }

    // 메뉴 정보를 입력받는 메서드
    private static Map<String, String> inputEmployee() {

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

    private static Map<String, String> inputModifyEmployee() {

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
