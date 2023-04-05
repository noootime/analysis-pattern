package com.derbysoft.shawn.pattern.chapter2.topic2.section3.product;

import com.derbysoft.shawn.pattern.chapter2.topic2.section3.sales.销售办事处;
import com.derbysoft.shawn.pattern.chapter2.topic2.section3.组织;

public class 产品服务团队 extends 组织 {

    public 产品服务团队(String name) {
        super(name);
    }

    @Override
    public void 设置产品父组织(组织 parent) {
        if (!(parent instanceof 产品服务部门)) {
            throw new UnsupportedOperationException("产品服务团队的产品线父组织必须是产品服务部门");
        }
        super.设置产品父组织(parent);
    }

    @Override
    public void 设置销售父组织(组织 parent) {
        if (!(parent instanceof 销售办事处)) {
            throw new UnsupportedOperationException("产品服务团队的销售父组织必须是销售办事处");
        }
        super.设置销售父组织(parent);
    }
}
