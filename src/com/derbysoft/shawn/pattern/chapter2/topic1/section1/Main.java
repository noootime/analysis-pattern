package com.derbysoft.shawn.pattern.chapter2.topic1.section1;

public class Main {

    public static void main(String[] args) {
        通讯录 contracts = new 通讯录();
        contracts.新增联系人(new 个人("Tom", "1381234561", "东方路100号", "tom@derbysoft.net"));
        contracts.新增联系人(new 个人("Tim", "1381234562", "东方路101号", "tim@derbysoft.net"));
        contracts.新增联系人(new 个人("Eve", "1381234563", "东方路102号", "eve@derbysoft.net"));
        contracts.新增公司(new 公司("DerbySoft", "021-0000000", "东方路88号", "derbysoft.net"));
        contracts.新增公司(new 公司("IBM", "021-1111111", "东方路99号", "ibm.net"));
        contracts.新增公司(new 公司("Lenovo", "021-2222222", "东方路77号", "lenovo.net"));
        contracts.展示通讯录();
    }

}
