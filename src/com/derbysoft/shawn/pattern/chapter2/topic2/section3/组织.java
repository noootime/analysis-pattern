package com.derbysoft.shawn.pattern.chapter2.topic2.section3;

import java.util.ArrayList;
import java.util.List;

public abstract class 组织 {
    public String name;
    protected 组织 salesLineParent;
    protected List<组织> salesLineChildren;
    protected 组织 productLineParent;
    protected List<组织> productLineChildren;

    public 组织(String name) {
        this.name = name;
        this.salesLineChildren = new ArrayList<>();
        this.productLineChildren = new ArrayList<>();
    }
    public void 设置销售父组织(组织 parent) {
        this.salesLineParent = parent;
        parent.salesLineChildren.add(this);
    }
    public void 设置产品父组织(组织 parent) {
        this.productLineParent = parent;
        parent.productLineChildren.add(this);
    }
    @Override
    public String toString() {
        return name;
    }
}
