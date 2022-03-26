package com.example.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.entity.Book;
import com.example.mapper.BookMapper;
import com.example.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Summer
 * @date 2022/3/26 22:42
 */
@Service
public class BookServiceImpl2 implements BookService {
    @Resource
    BookMapper bookMapper;
    @Override
    public Boolean save(Book book) {
        return bookMapper.insert(book)>0;
    }

    @Override
    public Boolean update(Book book) {
        return bookMapper.updateById(book)>0;
    }

    @Override
    public Boolean delete(Integer id) {
        return bookMapper.deleteById(id)>0;
    }

    @Override
    public Book getById(Integer id) {
        return bookMapper.selectById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookMapper.selectList(null);
    }

    @Override
    public IPage<Book> getPage(Integer page, Integer pageNum) {
        IPage<Book> p = new Page<>(page,pageNum);
        return bookMapper.selectPage(p,null);
    }
}
