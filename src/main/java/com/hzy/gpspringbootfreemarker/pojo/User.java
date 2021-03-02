package com.hzy.gpspringbootfreemarker.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @ClassName User
 * @Aauthor zhengyang.hu
 * @Date 2021/2/18
 **/
@Data
@Accessors(chain = true)
public class User {

    private String name;
    private int age;
    private int id;
}
