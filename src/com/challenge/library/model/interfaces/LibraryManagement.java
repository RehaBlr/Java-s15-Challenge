package com.challenge.library.model.interfaces;

import com.challenge.library.model.enums.Categories;
import com.challenge.library.model.Book;
import com.challenge.library.model.User;

public interface LibraryManagement {
    void addBook(Book book);
//    void updateBook( Book book);
void updateBook(int id, String name, String author, Categories category, double price);
    void deleteBook(int id);

    void addUser(User user);
//    void updateUser(User user);
    void deleteUser(Long tc);


}
