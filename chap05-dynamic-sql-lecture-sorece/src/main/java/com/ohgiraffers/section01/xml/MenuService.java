package com.ohgiraffers.section01.xml;

import com.ohgiraffers.common.MenuDTO;
import com.ohgiraffers.common.SearchCriteria;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.ohgiraffers.common.Template.getSqlSession;

public class MenuService {

    private DynamicSqlMapper mapper;

    public void selectMenuByPrice(int price) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        /*
        * 동적쿼리를 쓸때, 조건문의 값을 비교해야하는데, 기본자료형으로는 비교가 안된다.
        * 따라서, hashmap의 key 혹은 dto 의 getter를 이요해서 값을 비교한다.
        * */
        Map<String, Integer> map = new HashMap<>();
        map.put("price",price);

        List<MenuDTO> menuList =  mapper.selectMenuByPrice(map);

        if(menuList != null && menuList.size() > 0){
            for(MenuDTO menu : menuList){
                System.out.println(menu);
            }
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }

        sqlSession.close();
    }

    public void searchMenu(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        List<MenuDTO> menuList = mapper.searchMenu(searchCriteria);

        if(menuList != null && menuList.size() > 0) {
            for (MenuDTO menu : menuList) {
                System.out.println(menu);
            }
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }

        sqlSession.close();

    }

    public void serchMenuBySubCategory(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        List<MenuDTO> menuList =  mapper.searchMenuBySubCategory(searchCriteria);

        if(menuList != null && menuList.size() > 0){
            for(MenuDTO menu : menuList){
                System.out.println(menu);
            }
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }

        sqlSession.close();
    }
}
