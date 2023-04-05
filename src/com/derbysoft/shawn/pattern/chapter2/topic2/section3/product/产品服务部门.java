package com.derbysoft.shawn.pattern.chapter2.topic2.section3.product;

import com.derbysoft.shawn.pattern.chapter2.topic2.section3.sales.销售办事处;
import com.derbysoft.shawn.pattern.chapter2.topic2.section3.组织;

public class 产品服务部门 extends 组织 {

    public 产品服务部门(String name) {
        super(name);
    }

    @Override
    public void 设置产品父组织(组织 parent) {
        if (!(parent instanceof 产品支持单位)) {
            throw new UnsupportedOperationException("产品服务部门的产品线父组织必须是产品支持单位");
        }
        super.设置产品父组织(parent);
    }

    @Override
    public void 设置销售父组织(组织 parent) {
        throw new UnsupportedOperationException("产品服务部门没有销售线汇报逻辑");
    }
}
