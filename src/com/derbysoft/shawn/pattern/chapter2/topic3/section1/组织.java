package com.derbysoft.shawn.pattern.chapter2.topic3.section1;

import java.util.ArrayList;
import java.util.List;

public abstract class 组织 {
    public String name;
    protected 组织 parent;
    protected List<组织> children;
    public 组织(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }
    public void 设置父组织(组织 parent) {
        this.parent = parent;
        parent.children.add(this);
    }
    @Override
    public String toString() {
        return name;
    }
}
