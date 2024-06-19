package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.xmlconfig.Template.getSqlSession;

public class MenuService {

    /*
    * Service 란?
    *
    * 비즈니스 로직을 수행하는 클래스라고도 함.
    * 주로 DAO가 DB에서 받아온 데이터를 전달받아 가공해 Controller로 return 해준다.
    *
    * Mybatis 에서 Service의 역할
    * 1. SqlSession 생성
    * 2. DAO(데이터베이스 접근 객체)의 메소드 호출
    * 3. 트랜젝션(commit, rollback) 제어
    * */

    private final MenuDAO menuDAO;


    // 생성자 주입
    public MenuService() {
        menuDAO = new MenuDAO();
    }

    public List<MenuDTO> selectAllMenu() {

        // 세션 열어주기
        SqlSession sqlSession = getSqlSession();

        // MenuDAO를 이용해 데이터베이스에서 menuList
        List<MenuDTO> menuList = menuDAO.selectAllMenu(sqlSession);

        // 세션 닫아주기
        sqlSession.close();

        return menuList;
    }

    public MenuDTO selectMenuByCode(int code) {

        // 세션 열어주기
        SqlSession sqlSession = getSqlSession();

        MenuDTO menu = menuDAO.selectMenuByCode(sqlSession,code);

        sqlSession.close();

        return menu;
    }
}
