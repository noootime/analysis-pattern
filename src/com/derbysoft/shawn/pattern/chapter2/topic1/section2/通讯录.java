package com.derbysoft.shawn.pattern.chapter2.topic1.section2;

import com.derbysoft.shawn.pattern.chapter2.topic1.section1.个人;
import com.derbysoft.shawn.pattern.chapter2.topic1.section1.公司;
import java.util.ArrayList;
import java.util.List;

public class 通讯录 {
    private List<参与方> partyList;
    public 通讯录() {
        this.partyList = new ArrayList<>();
    }
    public void 新增参与方(参与方 party) {
        this.partyList.add(party);
    }
    public void 展示通讯录() {
        this.partyList.forEach(System.out::println);
    }
}
