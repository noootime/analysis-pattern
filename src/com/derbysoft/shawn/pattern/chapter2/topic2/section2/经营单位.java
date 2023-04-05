package com.derbysoft.shawn.pattern.chapter2.topic2.section2;

public class 经营单位 extends 组织 {

    public 经营单位(String name) {
        super(name);
    }

    @Override
    public void 设置父组织(组织 parent) {
        throw new UnsupportedOperationException("经营单位不应有父组织");
    }
}
