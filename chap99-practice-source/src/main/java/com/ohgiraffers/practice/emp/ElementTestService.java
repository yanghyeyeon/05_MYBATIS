package com.ohgiraffers.practice.emp;

import com.ohgiraffers.common.DeptAndEmployeeDTO;
import com.ohgiraffers.common.EmployeeAndDeptDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ElementTestService {

    private ElementTestMapper mapper;


    public void selectResultMapAssociationTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<EmployeeAndDeptDTO> menuList = mapper.selectResultMapAssociationTest();

        for(EmployeeAndDeptDTO menu : menuList) {
            System.out.println("사원이름 : " + menu.getEmpName() + "부서명 : " + menu.getDept().getDeptTitle());
        }

        sqlSession.close();
    }

    public void selectResultMapCollectionTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<DeptAndEmployeeDTO> categoryList = mapper.selectResultMapCollectionTest();

        for(DeptAndEmployeeDTO dept : categoryList) {
            System.out.println(dept);
        }

        sqlSession.close();
    }
}
