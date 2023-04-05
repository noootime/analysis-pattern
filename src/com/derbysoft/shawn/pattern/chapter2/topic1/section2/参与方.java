package com.derbysoft.shawn.pattern.chapter2.topic1.section2;

public class 参与方 {
    protected String name;
    protected 电话号码 phone;
    protected 地址 address;
    protected 电子邮件地址 email;
    public 参与方(String name, String phone, String address, String email) {
        this.name = name;
        this.phone = new 电话号码(phone);
        this.address = new 地址(address);
        this.email = new 电子邮件地址(email);
    }
}
