package com.derbysoft.shawn.pattern.chapter2.topic3.section1;

public class Main {

    public static void main(String[] args) {
        组织结构类型 type = new 组织结构类型();
        type.name = "直线管理";

        销售办事处 salesOffice = new 销售办事处("波士顿销售办事处");
        产品服务团队 productSupportTeam = new 产品服务团队("2176型咖啡机服务团队");

        组织结构 os = new 组织结构();
        os.parent = salesOffice;
        os.child = productSupportTeam;
        os.type = type;
    }

}
