package com.ohgiraffers.practice.remix;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.practice.remix.Template.getSqlSession;


public class EmployeeService {

    private EmployeeMapper EmployeeMapper;

    public List<EmployeeDTO> selectAllEmployee() {

        SqlSession sqlSession = getSqlSession();

        EmployeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        List<EmployeeDTO> empList = EmployeeMapper.selectAllEmployee();

        sqlSession.close();

        return empList;
    }

    public EmployeeDTO selectEmployeeByCode(String empId) {

        SqlSession sqlSession = getSqlSession();

        EmployeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        EmployeeDTO emp = EmployeeMapper.selectEmployeeByCode(empId);

        sqlSession.close();

        return emp;
    }

    public boolean registEmployee(EmployeeDTO emp) {

        SqlSession sqlSession = getSqlSession();

        EmployeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = EmployeeMapper.insertEmployee(emp);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean modifyEmployee(EmployeeDTO emp) {

        SqlSession sqlSession = getSqlSession();

        EmployeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = EmployeeMapper.modifyEmployee(emp);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean deleteEmployee(String empId) {

        SqlSession sqlSession = getSqlSession();

        EmployeeMapper = sqlSession.getMapper(EmployeeMapper.class);

        int result = EmployeeMapper.deleteEmployee(empId);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }
}
