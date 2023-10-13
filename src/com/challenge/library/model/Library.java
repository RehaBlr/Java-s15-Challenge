package com.challenge.library.model;

import com.challenge.library.model.enums.Categories;
import com.challenge.library.model.interfaces.LibraryManagement;

import java.util.*;

public class Library implements LibraryManagement {
    private String libraryName;
    private String address;
    private List<Book> books;
    private Set<String> readers; // veya log olabilir
    private Map<Integer, Book> bookss;
    private Map<Long, User> users;

    public Library(String libraryName, String address) {
        this.libraryName = libraryName;
        this.address = address;
        this.books = new ArrayList<>(); //composition iliskisi
        this.bookss =new HashMap<>();
        this.users = new HashMap<>();
    }

    public Map<Integer, Book> getBookss() {
        return bookss;
    }

    public Map<Long, User> getUser() {
        return users;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Set<String> getReaders() {
        return readers;
    }

    public void setReaders(Set<String> readers) {
        this.readers = readers;
    }

    // Kitap ekleme metodu
    @Override
    public void addBook(Book book) {
//        books.add(book);
        bookss.put(book.getId(),book);
        System.out.println(book.getName() + " isimli kitap kütüphaneye eklendi.");
    }
//Kitap güncelleme metodu
    @Override
    public void updateBook(int id, String name, String author, Categories category, double price) {
        Book book = bookss.get(id);
        if (book != null) {
            book.setName(name);
            book.setAuthor(author);
            book.setCategories(category);
            book.setPrice(price);
        }
    }
    // Kitap silme metodu
    @Override
    public void deleteBook(int id) {

        if (bookss.get(id) !=null) {
            System.out.println(bookss.get(id) + " isimli kitap kütüphaneden silindi.");
            bookss.remove(id);
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }
    // Kullanıcı ekleme metodu
    @Override
    public void addUser(User user) {
        if(users.get(user.getTC()) == null){
            users.put(user.getTC(),user);
            System.out.println(user.getName() + " isimli kişi kullanıcı olarak eklendi.");
        }else{
            System.out.println("bu tc ye sahip kişi zaten mevcut");
        }

    }
    // Kullanıcı silme metodu
    @Override
    public void deleteUser(Long tc) {
        if (users.get(tc) !=null) {
            System.out.println(users.get(tc).getName() + " isimli isimli kişi kütüphaneden silindi.");
            users.remove(tc);
        } else {
            System.out.println("kişi bulunamadı.");
        }
    }

    // Kitap silme metodu
    public void deleteBook(Book book) {
        if (books.remove(book)) {
            System.out.println(book.getName() + " isimli kitap kütüphaneden silindi.");
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }


    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", address='" + address + '\'' +
                ", books=" + bookss.size() +
                ", readers=" + readers/*.size() */+
                '}';
    }
}
