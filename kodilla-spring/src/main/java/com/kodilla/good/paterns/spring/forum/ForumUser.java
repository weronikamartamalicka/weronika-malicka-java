package com.kodilla.good.paterns.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    public java.lang.String userName;

    public ForumUser() {
        this.userName = "John Smith";
    }

    public String getUserName() {
        return userName;
    }
}