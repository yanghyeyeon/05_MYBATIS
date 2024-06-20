package com.ohgiraffers.practice.mvc;


import com.ohgiraffers.practice.mvc.controller.JobController;
import com.ohgiraffers.practice.mvc.view.EmployeeView;
import com.ohgiraffers.practice.mvc.view.JobView;
import com.ohgiraffers.practice.remix.EmployeeController;

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
        EmployeeView employeeView = new EmployeeView();
        JobController jobController = new JobController();
        JobView jobView = new JobView();

//        do {
//            System.out.println("============ 오지라퍼 메뉴 관리 시스템============");
//            System.out.println("1. 사원 전체 조회하기");
//            System.out.println("2. 사원 코드로 사원 조회하기");
//            System.out.println("3. 사원 이름로 사원 조회하기");
//            System.out.println("4. 신입 사원 등록하기");
//            System.out.println("5. 사원 수정하기");
//            System.out.println("6. 사원 삭제하기");
//            System.out.print("사원 관리 번호를 입력해주세요 : ");
//            int no = sc.nextInt();
//
//
//            switch(no) {
//                case 1: employeeController.selectAllEmployee(); break;
//                case 2: employeeController.selectEmployeeByCode(employeeView.inputEmployeeCode()); break;
//                case 3: employeeController.selectEmployeeByName(employeeView.inputEmployeeName()); break;
//                case 4: employeeController.registEmployee(employeeView.inputEmployee()); break;
//                case 5: employeeController.modifyEmployee(employeeView.inputModifyEmployee()); break;
//                case 6: employeeController.deleteEmployee(employeeView.inputEmployeeCode()); break;
//                default:
//                    System.out.println("잘못된 번호를 선택하셨습니다.");
//                    break;
//            }
//        } while (true);
//
//
//    }
        do {
            System.out.println("============ 오지라퍼 직급 관리 시스템============");
            System.out.println("1. 직급 전체 조회하기");
            System.out.println("2. 직급 코드로 직급 조회하기");
            System.out.println("3. 직급으로 코드 조회하기");
            System.out.println("4. 새로운 직급 등록하기");
            System.out.println("5. 직급 수정하기");
            System.out.println("6. 직급 삭제하기");
            System.out.print("직급 관리 번호를 입력해주세요 : ");
            int no = sc.nextInt();


            switch(no) {
                case 1: jobController.selectAllJob(); break;
                case 2: jobController.selectJobByCode(jobView.inputJobCode()); break;
                case 3: jobController.selectJobByName(jobView.inputJobName()); break;
                case 4: jobController.registJob(jobView.inputJob()); break;
                case 5: jobController.modifyJob(jobView.inputModifyJob()); break;
                case 6: jobController.deleteJob(jobView.inputJobCode()); break;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");
                    break;
            }
        } while (true);


    }

}
