package com.derbysoft.shawn.pattern.chapter2.topic1.section1;

public class 公司 {
    private String name;
    private 电话号码 phone;
    private 地址 address;
    private 电子邮件地址 email;
    public 公司(String name, String phone, String address, String email) {
        this.name = name;
        this.phone = new 电话号码(phone);
        this.address = new 地址(address);
        this.email = new 电子邮件地址(email);
    }

    @Override
    public String toString() {
        return "[公司]" + name + "\n" + "\t" + "电话: " + phone + ", 地址: " + address + "电子邮件: " + email;
    }
}
