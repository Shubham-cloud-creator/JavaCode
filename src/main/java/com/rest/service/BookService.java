package com.rest.service;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rest.entity.Book;

@Service
public class BookService {

    private static List<Book> list = new ArrayList<>();

    static {
        list.add(new Book(12, "javaComRef", "xyz"));
        list.add(new Book(13, "pythonComRef", "Hyn"));
        list.add(new Book(14, "AngularComRef", "bhopal"));
    }

    // Get all books
    public List<Book> getAllBooks() {
        return list;
    }

    // Get single book by ID
    public Book getBookById(int id) {
        return list.stream()
                   .filter(e -> e.getId() == id)
                   .findFirst()
                   .orElse(null); // Return null if book is not found
    }

    // Add a new book
    public Book addBook(Book b) {
        list.add(b);
        return b;
    }

    // Delete a book by ID
    public void deleteBook(int bid) {
        list = list.stream()
                   .filter(book -> book.getId() != bid)
                   .collect(Collectors.toList());
    }

    // Update a book
    public void updateBook(Book book, int bookId) {
        list = list.stream()
                   .map(b -> {
                       if (b.getId() == bookId) {
                           b.setTitle(book.getTitle());
                           b.setAuthor(book.getAuthor());
                       }
                       return b;
                   })
                   .collect(Collectors.toList());
    }
}
