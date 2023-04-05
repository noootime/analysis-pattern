package com.derbysoft.shawn.pattern.chapter2.topic2.section2;

public class 分部 extends 组织 {

    public 分部(String name) {
        super(name);
    }

    @Override
    public void 设置父组织(组织 parent) {
        if (!(parent instanceof 地区)) {
            throw new UnsupportedOperationException("分部的父组织必须是地区");
        }
        super.设置父组织(parent);
    }
}
