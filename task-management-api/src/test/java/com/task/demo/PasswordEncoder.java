package com.task.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String rawPassword = "author";
        String encodePassword = passwordEncoder.encode(rawPassword);

        System.out.println(encodePassword);
    }
}
