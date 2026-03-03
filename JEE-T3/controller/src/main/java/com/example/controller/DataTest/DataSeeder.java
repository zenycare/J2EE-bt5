package com.example.controller.DataTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.controller.Models.Book;
import com.example.controller.Repositories.BookRepository;

@Configuration
public class DataSeeder {

    @Autowired
    private BookRepository bookRepository;

    @Bean
    public CommandLineRunner initData() {
        return args -> {

            if (bookRepository.count() == 0) {

                // Sách 1
                Book book1 = new Book();
                book1.setTitle("Cơ sở dữ liệu nâng cao");
                book1.setAuthor("ABC");
                book1.setImage("https://imgv2-2-f.scribdassets.com/img/document/788672904/original/82178a7593/1?v=1"); // Bạn
                                                                                                                       // thay
                                                                                                                       // link
                                                                                                                       // ảnh
                                                                                                                       // thật
                                                                                                                       // nếu
                                                                                                                       // có
                book1.setPrice(70000.0);

                // Sách 2
                Book book2 = new Book();
                book2.setTitle("Hóa học");
                book2.setAuthor("XYZ");
                book2.setImage("https://tse3.mm.bing.net/th/id/OIP.Kwtklevku4PBNxaa74I-WwHaJ8?pid=Api&P=0&h=180");
                book2.setPrice(45000.0);

                // Sách 3
                Book book3 = new Book();
                book3.setTitle("Lý thuyết đồ thị");
                book3.setAuthor("BCD");
                book3.setImage("https://hevobooks.com/wp-content/uploads/2018/09/7B957-1-679x1024.jpg");
                book3.setPrice(850000.0);

                bookRepository.save(book1);
                bookRepository.save(book2);
                bookRepository.save(book3);

                System.out.println("==== ĐÃ THÊM DỮ LIỆU SÁCH MẪU THÀNH CÔNG! ====");
            } else {
                System.out.println("==== DỮ LIỆU ĐÃ TỒN TẠI, BỎ QUA SEEDING ====");
            }
        };
    }
}