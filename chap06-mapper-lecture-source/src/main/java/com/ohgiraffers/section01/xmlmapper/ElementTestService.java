package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.CategoryAndMenuDTO;
import com.ohgiraffers.common.MenuAndCategoryDTO;
import com.ohgiraffers.common.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ElementTestService {

    private ElementTestMapper mapper;

    public void selectCacheTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        for(int i = 0; i < 10; i++) {

            // 조회시간 확인 용 시작 시간
            Long startTime = System.currentTimeMillis();

            List<String> nameList = mapper.selectCacheTest();
            System.out.println(nameList);

            // 조회시간 확인 용 종료 시간
            Long endTime = System.currentTimeMillis();

            Long interval = endTime - startTime;
            System.out.println("수행시간 : " + interval + "(ms)");

        }

        sqlSession.close();
    }

    public void selectResultMapTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<MenuDTO> menuList = mapper.selectResultMapTest();

        for(MenuDTO menu : menuList) {
            System.out.println(menu);
        }

        sqlSession.close();
    }

    public void selectResultMapConstructorTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<MenuDTO> menuList = mapper.selectResultMapConstructorTest();

        for(MenuDTO menu : menuList) {
            System.out.println(menu);
        }

        sqlSession.close();
    }

    public void selectResultMapAssociationTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<MenuAndCategoryDTO> menuList = mapper.selectResultMapAssociationTest();

        for(MenuAndCategoryDTO menu : menuList) {
            System.out.println("메뉴 이름 : " + menu.getName() + ", 카테고리 이름 : " + menu.getCategory().getName());
        }

        sqlSession.close();
    }

    public void selectResultMapCollectionTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<CategoryAndMenuDTO> categoryList = mapper.selectResultMapCollectionTest();

//        List<MenuDTO> menuList = categoryList.get(1).getMenuList();
//        for(MenuDTO menu : menuList) {
//            System.out.println("메뉴 이름 : " + menu.getName() + ", 카테고리 이름 : " + menu.getCategory().getName());
//        }
        for(CategoryAndMenuDTO category : categoryList) {
            System.out.println(category);
        }

        sqlSession.close();
    }

    public void selectSqlTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<MenuDTO> menuList = mapper.selectSqlTest();

        for(MenuDTO menu : menuList) {
            System.out.println(menu);
        }

        sqlSession.close();
    }

    public void insertMenuTest(MenuDTO menu) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        int result = mapper.insertMenuTest(menu);

        if(result > 0) {
            System.out.println("메뉴 등록 성공!");
            sqlSession.commit();
        }else {
            System.out.println("메뉴 등록 실패!");
            sqlSession.rollback();
        }

        sqlSession.close();
    }

    public void insertCategoryAndMenuTest(MenuAndCategoryDTO menuAndCategory) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);


        // 1. 신규 카테고리 등록
        // 2. 신규 카테고리를 가지고 있는 메뉴 등록
        int result1 = mapper.insertNewCategory(menuAndCategory);
        int result2 = mapper.insertNewMenu(menuAndCategory);


        if(result1 > 0 && result2 > 0) {
            System.out.println("신규 카테고리와 메뉴 등록 성공!");
            sqlSession.commit();
        }else {
            System.out.println("신규 카테고리와 메뉴 등록 실패!");
            sqlSession.rollback();
        }

        sqlSession.close();
    }
}
