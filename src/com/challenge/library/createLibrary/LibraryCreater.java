package com.challenge.library.createLibrary;

import com.challenge.library.model.enums.Categories;
import com.challenge.library.model.Book;
import com.challenge.library.model.Library;
import com.challenge.library.model.User;

import java.util.Scanner;

public class LibraryCreater {
    public static void libraryCreater(){
        System.out.println("Kütüphane Konsol Uygulamasına Hoş Geldiniz!");

        //bir kütüphane nesnesi oluşturuldu
        Library library = new Library("Eskişehir Kütüphanesi", "Meşelik Kampüsü, Odunpazarı, Eskişehir");

        // kütüphaneye birkaç kitap eklendi
        library.addBook(new Book("Sineklerin Tanrısı", "William Golding", Categories.NOVEL, 12.0));
        library.addBook(new Book("Beyaz Zambaklar Ülkesinde", "Grigory Petrov",Categories.CLASSICS, 10.0));
        library.addBook(new Book("Suç ve Ceza", "Fyodor Dostoyevski", Categories.NOVEL, 15.0));

        // bir kullanıcı nesnesi oluşturuldu
        User user = new User( 123456L,"Test", "Test", "Eskişehir");
        User user2 = new User( 1234567L,"Test2", "Test2", "Eskişehir");

        boolean isRun = true;
        Scanner scanner = new Scanner(System.in);
        while (isRun) {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçin:");
            System.out.println("1- Kütüphane Bilgilerini Görüntüle");
//            System.out.println("2- Kitapları göster");
//            System.out.println("3- Kitap Listele");
            System.out.println("4- Kitap Ekle");
            System.out.println("5- Kitap Sil");
            System.out.println("6- Kullanıcı Kaydı Yap");
            System.out.println("7- Kullanıcı Kaydı Sil");
//            System.out.println("8- Kullanıcı Girişi Yap");
//            System.out.println("9- Kullanıcı Çıkışı Yap");
//            System.out.println("10- Ödünç Aldığım Kitapları Görüntüle");
//            System.out.println("11- Kitap Ödünç Al");
//            System.out.println("12- Kitap İade Et");
            System.out.println("13- Çıkış Yap");

            int secim = scanner.nextInt(); //Kullanıcıdanbir sayı alınır

            switch (secim) {
                case 1:
                    System.out.println("Kütüphane bilgileri şunlardır:");
//                    System.out.println(library.toString());
                    System.out.println("Kütüphane adı: " + library.getLibraryName());
                    System.out.println("Adresi: " + library.getAddress());
                    System.out.println("Kitap sayısı: " + library.getBookss().size());
                    break;

                case 4:
                    System.out.println("Kütüphaneye yeni kitap eklemek için sırasıyla :");
                    System.out.println("1- Kitap adı:");
                    System.out.println("2- Yazar adı:");
                    System.out.println("3- Kitap kategorisi:");
                    System.out.println("4- Kitap fiyatı:");

                    library.addBook(new Book(scanner.next(),scanner.next(),Categories.valueOf(scanner.next().toUpperCase()),scanner.nextDouble()));
                    break;
                case 5:
                    System.out.println("Silinecek Kitabın İd sini girin:");
                    library.deleteBook(scanner.nextInt());
                    break;
                case 6:
                    System.out.println("Kütüphaneye yeni kullanıcı eklemek için sırasıyla :");
                    System.out.println("1- TC:");
                    System.out.println("2- Ad:");
                    System.out.println("3- Soyad:");
                    System.out.println("4- Adres:");

                    library.addUser(new User(scanner.nextLong(),scanner.next(),scanner.next(),scanner.next()));

                    break;
                case 7:
                    System.out.println("Silinecek Kişinin Tc sini girin:");
                    library.deleteUser(scanner.nextLong());
                    break;

                case 13:
                    isRun = false;
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız.");
                    break;
            }

        }
    }
}
