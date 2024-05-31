package com.wayhome.srpingbootmybatis.entity;

public class TestDTO {

    private User u = new User();

    public TestDTO(){
     System.out.println("111");
    }

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }
}
