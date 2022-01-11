package com.es.demo.model;

import lombok.Data;

import java.util.Date;

/**
 * @author zj
 * @version 1.0
 * @date 2020/11/18 10:31
 */
@Data
public class UserInfo {

    private String name;

    private Integer age;

    private double salary;

    private String address;

    private Date createTime;

    private String birthDate;

    private String remark;
}
