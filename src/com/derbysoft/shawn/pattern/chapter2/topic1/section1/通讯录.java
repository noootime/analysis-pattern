package com.derbysoft.shawn.pattern.chapter2.topic1.section1;

import java.util.ArrayList;
import java.util.List;

public class 通讯录 {
    private List<个人> people;
    private List<公司> companies;
    public 通讯录() {
        this.people = new ArrayList<>();
        this.companies = new ArrayList<>();
    }
    public void 新增联系人(个人 person) {
        this.people.add(person);
    }
    public void 新增公司(公司 company) {
        this.companies.add(company);
    }
    public void 展示通讯录() {
        this.people.forEach(System.out::println);
        this.companies.forEach(System.out::println);
    }
}
