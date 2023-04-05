package com.derbysoft.shawn.pattern.chapter2.topic2.section3;

import com.derbysoft.shawn.pattern.chapter2.topic2.section3.product.产品支持单位;
import com.derbysoft.shawn.pattern.chapter2.topic2.section3.product.产品服务团队;
import com.derbysoft.shawn.pattern.chapter2.topic2.section3.product.产品服务部门;
import com.derbysoft.shawn.pattern.chapter2.topic2.section3.sales.分部;
import com.derbysoft.shawn.pattern.chapter2.topic2.section3.sales.地区;
import com.derbysoft.shawn.pattern.chapter2.topic2.section3.sales.经营单位;
import com.derbysoft.shawn.pattern.chapter2.topic2.section3.sales.销售办事处;

public class Main {

    public static void main(String[] args) {
        经营单位 operatingUnit_A = new 经营单位("上海市总经销部");

        地区 region_A = new 地区("浦东新区");
        region_A.设置销售父组织(operatingUnit_A);

        分部 division_A = new 分部("三林分部");
        division_A.设置销售父组织(region_A);
        分部 division_B = new 分部("塘桥分部");
        division_B.设置销售父组织(region_A);

        销售办事处 salesOffice_A = new 销售办事处("东明路办事处");
        salesOffice_A.设置销售父组织(division_A);
        销售办事处 salesOffice_B = new 销售办事处("东方路办事处");
        salesOffice_B.设置销售父组织(division_B);

        产品支持单位 productSupportUnit = new 产品支持单位("总产品支持单位");

        产品服务部门 productSupportDep = new 产品服务部门("217*服务中心");
        productSupportDep.设置产品父组织(productSupportUnit);

        产品服务团队 productSupportTeam = new 产品服务团队("2176服务团队");
        productSupportTeam.设置销售父组织(salesOffice_A);
        productSupportTeam.设置产品父组织(productSupportDep);
    }

}
