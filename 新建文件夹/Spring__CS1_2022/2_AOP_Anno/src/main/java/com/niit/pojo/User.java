package com.niit.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author
 * @Date 2022/10/13 8:27
 * @Description
 **/

@Data
@ToString
public class User {
    @Value("1va")
    private String name;
    @Value("normal")
    private String type;
}
