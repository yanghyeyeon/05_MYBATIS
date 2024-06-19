package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MenuDAO {

    /*
    * DAO 란? (Data Access Object)
    * DB의 데이터에 접근하기 위한 객체를 의미한다.
    * DB에 접근하는 로직을 분리하기 위해 사용함.
    * */

    public List<MenuDTO> selectAllMenu(SqlSession sqlSession) {

        return sqlSession.selectList("MenuMapper.selectAllMenu");
    }
}
