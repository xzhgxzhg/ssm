package com.xs.springboot.dao;


//@Component
public class UserDao implements IUserDao {

    @Override
    public void getUser() {
        System.out.println("hello, spring!");
    }
}
