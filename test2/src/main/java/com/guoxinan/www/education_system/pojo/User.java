package com.guoxinan.www.education_system.pojo;

import lombok.Data;

import java.util.Date;


@Data
public class User {
    private  String  username;
    private  String password;
    private  String  sex;
    private  String phone;
    private  String  email;
    private Date birth;
    private  Integer  id;

}
