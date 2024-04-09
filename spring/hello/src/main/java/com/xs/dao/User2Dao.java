package com.xs.dao;


import org.springframework.stereotype.Component;

@Component
public class User2Dao implements IUserDao{

    @Override
    public void getUser() {
        System.out.println("hello, spring2!");
    }
}
