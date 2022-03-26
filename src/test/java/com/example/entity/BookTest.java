package com.example.entity;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Summer
 * @date 2022/3/26 15:07
 */
@SpringBootTest
public class BookTest {
    @Resource
    private BookMapper bookMapper;


    @Test
    void testGetById() {
        System.out.println(bookMapper.selectById(1));
    }

    @Test
    void testGetList() {

        List<Book> list = new ArrayList<>();
        list = bookMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setName("PHP从入门到放弃");
        book.setType("PHP");
        book.setDescription("人民教育出版本社");
        System.out.println(bookMapper.insert(book));
    }

    @Test
    void testDel() {
        System.out.println(bookMapper.deleteById(5));
    }

    @Test
    void testPage() {
        IPage page = new Page(1, 1);
        bookMapper.selectPage(page, null);
        System.out.println(page.getRecords());
    }

    @Test
    void testGetBy() {
        String name = "PHP";
        LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper<>();

        qw.like(Objects.nonNull(name), Book::getName, name);
        System.out.println(bookMapper.selectList(qw));
    }
}
