package com.derbysoft.shawn.pattern.chapter2.topic2.section3.product;

import com.derbysoft.shawn.pattern.chapter2.topic2.section3.组织;

public class 产品支持单位 extends 组织 {
    public 产品支持单位(String name) {
        super(name);
    }
    @Override
    public void 设置产品父组织(组织 parent) {
        throw new UnsupportedOperationException("产品支持单位没有产品线父组织");
    }

    @Override
    public void 设置销售父组织(组织 parent) {
        throw new UnsupportedOperationException("产品支持单位没有销售线汇报逻辑");
    }
}
