package com.derbysoft.shawn.pattern.chapter2.topic2.section3.sales;

import com.derbysoft.shawn.pattern.chapter2.topic2.section3.组织;

public class 地区 extends 组织 {

    public 地区(String name) {
        super(name);
    }

    @Override
    public void 设置销售父组织(组织 parent) {
        if (!(parent instanceof 经营单位)) {
            throw new UnsupportedOperationException("地区的父组织必须是经营单位");
        }
        super.设置销售父组织(parent);
    }
}
