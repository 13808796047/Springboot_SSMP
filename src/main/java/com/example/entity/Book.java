package com.example.entity;

import lombok.Data;

/**
 * @author Summer
 * @date 2022/3/26 14:48
 */
@Data
public class Book {
    private Long id ;
    private String type;
    private String name;
    private String description;
}
