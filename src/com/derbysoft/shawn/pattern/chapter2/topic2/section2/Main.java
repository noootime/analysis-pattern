package com.derbysoft.shawn.pattern.chapter2.topic2.section2;

public class Main {

    public static void main(String[] args) {
        经营单位 operatingUnit_A = new 经营单位("上海市总经销部");

        地区 region_A = new 地区("浦东新区");
        region_A.设置父组织(operatingUnit_A);

        分部 division_A = new 分部("三林分部");
        division_A.设置父组织(region_A);
        分部 division_B = new 分部("塘桥分部");
        division_B.设置父组织(region_A);

        销售办事处 salesOffice_A = new 销售办事处("东明路办事处");
        salesOffice_A.设置父组织(division_A);
        销售办事处 salesOffice_B = new 销售办事处("东方路办事处");
        salesOffice_B.设置父组织(division_B);
    }

}
