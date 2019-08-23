package com.wx.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {

    public static void main(String[] args) {
        int m=1;
        System.out.println(m+1);
        String str = "lijingling";
        System.out.println(str);
        SpringApplication.run(StudyApplication.class, args);
    }

}
