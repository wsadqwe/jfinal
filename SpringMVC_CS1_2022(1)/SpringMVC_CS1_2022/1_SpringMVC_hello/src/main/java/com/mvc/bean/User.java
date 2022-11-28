package com.mvc.bean;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;

public class User {
    private Integer id;
    @JsonAlias(value={"u","name"})
    private String username;
    @JsonFormat
    private String password;
    private String sex;
    private Integer age;
    private String email;
}
