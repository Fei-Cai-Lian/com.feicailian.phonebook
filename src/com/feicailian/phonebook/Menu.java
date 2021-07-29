package com.feicailian.phonebook;

/**
 *  这个Menu类是拿来生成项目中所有的菜单的
 */
public class Menu {

    //主菜单
    public void mainMenu () {

        System.out.println("====================");
        System.out.println("*     1、添加记录    *");
        System.out.println("*     2、查找记录    *");
        System.out.println("*     3、修改记录    *");
        System.out.println("*     4、删除记录    *");
        System.out.println("*     5、排序记录    *");
        System.out.println("*     6、退出程序    *");
        System.out.println("====================");
        System.out.println(); //为了页面简洁好看
    }

    //主菜单——1、添加界面
    public void addMenu () {

        System.out.println("=====================");
        System.out.println("*     1、添加新记录    *");
        System.out.println("*     2、查看全记录    *");
        System.out.println("*     3、返回上一级    *");
        System.out.println("=====================");
        System.out.println(); //为了页面简洁好看
    }

    //主菜单——2、查找页面
    public void searchMenu () {

        System.out.println("====================");
        System.out.println("*     1、按姓名查找    *");
        System.out.println("*     2、按年龄查找    *");
        System.out.println("*     3、按性别查找    *");
        System.out.println("*     4、按电话查找    *");
        System.out.println("*     5、按住址查找    *");
        System.out.println("*     6、查看全记录    *");
        System.out.println("*     7、返回上一级   *");
        System.out.println("====================");
        System.out.println(); //为了页面简洁好看
    }

    //主菜单——3、修改界面
    public void modifyMenu () {

        System.out.println("=======================");
        System.out.println("*     1、查看全记录      *");
        System.out.println("*     2、修改指定记录    *");
        System.out.println("*     3、返回上一级      *");
        System.out.println("=======================");
        System.out.println(); //为了页面简洁好看
    }

    //主菜单——修改界面——修改子界面
    public void subModifyMenu () {

        System.out.println("====================");
        System.out.println("*     1、修改姓名    *");
        System.out.println("*     2、修改年龄    *");
        System.out.println("*     3、修改性别    *");
        System.out.println("*     4、修改号码    *");
        System.out.println("*     5、修改住址    *");
        System.out.println("*     6、返回上一级   *");
        System.out.println("====================");
        System.out.println(); //为了页面简洁好看
    }

    //主菜单——4、删除界面
    public void deleteMenu () {

        System.out.println("=======================");
        System.out.println("*     1、查看全记录      *");
        System.out.println("*     2、删除指定记录    *");
        System.out.println("*     3、删除全部记录    *");
        System.out.println("*     4、返回上一级      *");
        System.out.println("=======================");
        System.out.println(); //为了页面简洁好看
    }

    //主菜单——5、排序界面
    public void orderMenu () {

        System.out.println("====================");
        System.out.println("*     1、按姓名排序    *");
        System.out.println("*     2、按年龄排序    *");
        System.out.println("*     3、按性别排序    *");
        System.out.println("*     4、查看全记录    *");
        System.out.println("*     5、返回上一级   *");
        System.out.println("====================");
        System.out.println(); //为了页面简洁好看
    }

}
