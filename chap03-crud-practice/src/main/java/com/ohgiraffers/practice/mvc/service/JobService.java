package com.ohgiraffers.practice.mvc.service;

import com.ohgiraffers.practice.mvc.dao.JobMapper;
import com.ohgiraffers.practice.mvc.dto.JobDTO;
import com.ohgiraffers.practice.remix.Template;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.practice.mvc.common.Template.getSqlSession;

public class JobService {

    private JobMapper JobMapper;

    public List<JobDTO> selectAllJob() {

        SqlSession sqlSession = getSqlSession();

        JobMapper = sqlSession.getMapper(JobMapper.class);

        List<JobDTO> jobList = JobMapper.selectAllJob();

        sqlSession.close();

        return jobList;
    }

    public JobDTO selectJobByCode(String jobCode) {

        SqlSession sqlSession = getSqlSession();

        JobMapper = sqlSession.getMapper(JobMapper.class);

        JobDTO job = JobMapper.selectJobByCode(jobCode);

        sqlSession.close();

        return job;
    }

    public JobDTO selectJobByName(String jobName) {

        SqlSession sqlSession = getSqlSession();

        JobMapper = sqlSession.getMapper(JobMapper.class);

        JobDTO job = JobMapper.selectJobByName(jobName);

        sqlSession.close();

        return job;
    }

    public boolean registJob(JobDTO emp) {

        SqlSession sqlSession = getSqlSession();

        JobMapper = sqlSession.getMapper(JobMapper.class);

        int result = JobMapper.insertJob(emp);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean modifyJob(JobDTO emp) {

        SqlSession sqlSession = getSqlSession();

        JobMapper = sqlSession.getMapper(JobMapper.class);

        int result = JobMapper.modifyJob(emp);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean deleteJob(String empId) {

        SqlSession sqlSession = getSqlSession();

        JobMapper = sqlSession.getMapper(JobMapper.class);

        int result = JobMapper.deleteJob(empId);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }
}
