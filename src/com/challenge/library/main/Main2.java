package com.challenge.library.main;

import com.challenge.library.model.enums.Categories;
import com.challenge.library.model.Book;
import com.challenge.library.model.Library;
import com.challenge.library.model.User;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Library");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kütüphane Konsol Uygulamasına Hoş Geldiniz!");

        //bir kütüphane nesnesi oluşturuldu
        Library library = new Library("Eskişehir Kütüphanesi", "Meşelik Kampüsü, Odunpazarı, Eskişehir");

        // kütüphaneye birkaç kitap eklendi
        library.addBook(new Book("Sineklerin Tanrısı", "William Golding", Categories.NOVEL, 12.0));
        library.addBook(new Book("Beyaz Zambaklar Ülkesinde", "Grigory Petrov",Categories.CLASSICS, 10.0));
        library.addBook(new Book("Suç ve Ceza", "Fyodor Dostoyevski", Categories.NOVEL, 15.0));
        System.out.println(library);
        library.deleteBook(2);
        library.updateBook(1,"Sineklerin Tanrısı", "William Golding", Categories.NOVEL, 20.0);
        System.out.println(library.getBookss());
        // bir kullanıcı nesnesi oluşturuldu
       // User user = new User( "123456","Ahmet", "Yılmaz", "ahmet@gmail.com", new HashSet<Book>());
        User user = new User( 123456L,"Ahmet", "Yılmaz", "Eskişehir");
        User user2 = new User( 1234567L,"mehmet", "Yılmaz", "Eskişehir");

        library.addUser(user);
        library.addUser(user);
        library.addUser(user2);
        library.deleteUser(123456L);
    }
}
