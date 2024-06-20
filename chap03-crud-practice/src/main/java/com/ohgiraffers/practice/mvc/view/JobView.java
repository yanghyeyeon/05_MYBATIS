package com.ohgiraffers.practice.mvc.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JobView {

    // 사원코드를 입력받는 메서드
    public Map<String, String> inputJobCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("직급 코드를 입력하세요 : ");
        String jobCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("jobCode",jobCode);

        return parameter;
    }

    // 사원이름을 입력받는 메서드
    public Map<String, String> inputJobName() {

        Scanner sc = new Scanner(System.in);
        System.out.print("직급 이름를 입력하세요 : ");
        String jobName = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("jobName",jobName);

        return parameter;
    }

    // 메뉴 정보를 입력받는 메서드
    public Map<String, String> inputJob() {

        Scanner sc = new Scanner(System.in);
        System.out.print("직급 코드을 입력하세요 : ");
        String jobCode = sc.nextLine();
        System.out.print("직급 이름을 입력하세요 : ");
        String jobName = sc.nextLine();


        Map<String, String> parameter = new HashMap<>();

        parameter.put("jobCode",jobCode);
        parameter.put("jobName",jobName);

        return parameter;
    }

    public Map<String, String> inputModifyJob() {

        Scanner sc = new Scanner(System.in);

        System.out.print("수정할 직급 코드을 입력하세요 : ");
        String jobCode = sc.nextLine();
        System.out.print("수정할 직급 이름을 입력하세요 : ");
        String jobName = sc.nextLine();


        Map<String, String> parameter = new HashMap<>();

        parameter.put("jobCode",jobCode);
        parameter.put("jobName",jobName);



        return parameter;
    }
}
