package com.derbysoft.shawn.pattern.chapter2.topic1.section2;

public class 个人 extends 参与方 {
    public 个人(String name, String phone, String address, String email) {
        super(name, phone, address, email);
    }

    @Override
    public String toString() {
        return "[个人]" + name + "\n" + "\t" + "电话: " + phone + ", 地址: " + address + "电子邮件: " + email;
    }
}
