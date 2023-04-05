package com.derbysoft.shawn.pattern.chapter2.topic2.section3.sales;

import com.derbysoft.shawn.pattern.chapter2.topic2.section3.组织;

public class 销售办事处 extends 组织 {

    public 销售办事处(String name) {
        super(name);
    }

    @Override
    public void 设置销售父组织(组织 parent) {
        if (!(parent instanceof 分部)) {
            throw new UnsupportedOperationException("销售办事处的父组织必须是分部");
        }
        super.设置销售父组织(parent);
    }
}
