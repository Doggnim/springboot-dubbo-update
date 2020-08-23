package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Author Chuming Huang
 * @Date 2020/8/21
 */
@Data
public class User implements Serializable {
    /**
     * 用户id
     */
    @Id
    private Long id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户性别
     * 0为女, 1为男
     */
    private Integer sex;

    /**
     * 用户年龄
     */
    private Integer age;
}
