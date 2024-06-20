package com.ohgiraffers.section02.javaconfig;

import java.util.List;
import java.util.Map;

public class MenuController {

    private final PrintResult printResult;
    private final MenuService menuService;

    public MenuController() {

        // 생성자 주입
        printResult = new PrintResult();
        menuService = new MenuService();
    }

    // 전체 조회
    public void selectAllMenu() {

        List<MenuDTO> menuList = menuService.selectAllMenu();

        if (menuList != null) {
            printResult.printMenuList(menuList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    // 메뉴코드로 단건 조회
    public void selectMenuByCode(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        MenuDTO menu = menuService.selectMenuByCode(code);

        if (menu != null) {
            printResult.printMenu(menu);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }
}
