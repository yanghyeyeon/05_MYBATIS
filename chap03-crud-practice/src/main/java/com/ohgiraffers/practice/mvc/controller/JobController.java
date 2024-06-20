package com.ohgiraffers.practice.mvc.controller;

import com.ohgiraffers.practice.mvc.dto.JobDTO;
import com.ohgiraffers.practice.mvc.service.JobService;
import com.ohgiraffers.practice.mvc.view.JobPrintResult;

import java.util.List;
import java.util.Map;

public class JobController {


    private final JobPrintResult printResult;
    private final JobService jobService;

    public JobController() {

        // 생성자 주입
        printResult = new JobPrintResult();
        jobService = new JobService();
    }

    // 전체 조회
    public void selectAllJob() {

        List<JobDTO> jobList = jobService.selectAllJob();

        if (jobList != null) {
            printResult.printJobList(jobList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    // 메뉴코드로 단건 조회
    public void selectJobByCode(Map<String, String> parameter) {

        String jobCode = parameter.get("jobCode");

        JobDTO job = jobService.selectJobByCode(jobCode);

        if (job != null) {
            printResult.printJob(job);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    // 사원이름으로 조회
    public void selectJobByName(Map<String, String> parameter) {

        String jobName = parameter.get("jobName");

        JobDTO job = jobService.selectJobByName(jobName);

        if (job != null) {
            printResult.printJob(job);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    // 신규 메뉴 등록
    public void registJob(Map<String, String> parameter) {

        String jobCode = parameter.get("jobCode");
        String jobName = parameter.get("jobName");


        JobDTO job = new JobDTO();

        job.setJobCode(jobCode);
        job.setJobName(jobName);


        if (jobService.registJob(job)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    // 메뉴 수정
    public void modifyJob(Map<String, String> parameter) {

        String jobCode = parameter.get("jobCode");
        String jobName = parameter.get("jobName");


        JobDTO job = new JobDTO();

        job.setJobCode(jobCode);
        job.setJobName(jobName);


        if (jobService.modifyJob(job)) {
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }

    // 메뉴 삭제
    public void deleteJob(Map<String, String> parameter) {

        String jobCode = parameter.get("jobCode");

        if (jobService.deleteJob(jobCode)) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }
}
