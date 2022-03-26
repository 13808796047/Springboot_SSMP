package com.example.entity.service;

import com.example.service.BookService;
import com.example.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author Summer
 * @date 2022/3/26 22:51
 */
@SpringBootTest
public class ServiceTest {
   @Resource
   private IBookService bookService;
   @Test
    void testGetById(){
       System.out.println(bookService.getById(1));
   }
}
