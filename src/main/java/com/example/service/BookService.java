package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.entity.Book;

import java.util.List;

/**
 * @author Summer
 * @date 2022/3/26 22:40
 */
public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getPage(Integer page,Integer pageNum);
}
