package com.ohgiraffers.practice.emp;

import com.ohgiraffers.common.DeptAndEmployeeDTO;
import com.ohgiraffers.common.EmployeeAndDeptDTO;
import com.ohgiraffers.common.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ElementTestService {

    private ElementTestMapper mapper;


    public void selectResultMapAssociationTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<EmployeeAndDeptDTO> empList = mapper.selectResultMapAssociationTest();

        for(EmployeeAndDeptDTO emp : empList) {
            System.out.println("사원이름 : " + emp.getEmpName() + ", 부서명 : " + emp.getDept().getDeptTitle());
        }

        sqlSession.close();
    }

    public void selectResultMapCollectionTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<DeptAndEmployeeDTO> deptList = mapper.selectResultMapCollectionTest();

        for(DeptAndEmployeeDTO dept : deptList) {

            System.out.println("-------------------------");
            System.out.println(dept.getDeptId());

            for(EmployeeDTO emp : dept.getEmpList()){

                System.out.println(emp.getEmpName());
            }
        }

        sqlSession.close();
    }
}
