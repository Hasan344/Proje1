package com.linkedin.proje1;

import java.util.LinkedList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Proje1Application {
public List<String> list=new LinkedList<String>();

    public static void main(String[] args) {
        SpringApplication.run(Proje1Application.class, args);

    }

}
