package com.example.controller;

import com.example.entity.Book;
import com.example.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Summer
 * @date 2022/3/26 23:34
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Resource
    private BookService bookService;

    @GetMapping
    public List<Book> index() {
        return bookService.getAll();
    }

    @PostMapping
    public Boolean create(@RequestBody Book book) {
        return bookService.save(book);
    }

    @PutMapping
    public Boolean update(@RequestBody Book book) {
        return bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public Boolean destroy(@PathVariable Integer id) {
        return bookService.delete(id);
    }

    @GetMapping("/{id}")
    public Book show(@PathVariable Integer id) {
        return bookService.getById(id);
    }
}
