package com.example.md4_bai4ung_dung_login.DAO;

import com.example.md4_bai4ung_dung_login.model.Login;
import com.example.md4_bai4ung_dung_login.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static final List<User> users;

    static {
        users = new ArrayList<>();
        users.add(new User("annh", "123456", "annh", "annh@codegym.vn", 18));
        users.add(new User("kunn", "123456", "kunn", "kunn@codegym.vn", 20));
        users.add(new User("AKKK", "123456", "AKKK", "AKKK@codegym.vn", 22));
    }

    public static User checkLogin(Login login) {
        for (User user : users) {
            if (user.getAccount().equals(login.getAccount())
                    && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }
}