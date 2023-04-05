package com.derbysoft.shawn.pattern.chapter2.topic1.section2;

public class 公司 extends 参与方 {
    public 公司(String name, String phone, String address, String email) {
        super(name, phone, address, email);
    }

    @Override
    public String toString() {
        return "[公司]" + name + "\n" + "\t" + "电话: " + phone + ", 地址: " + address + "电子邮件: " + email;
    }
}
