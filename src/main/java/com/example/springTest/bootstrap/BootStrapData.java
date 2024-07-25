package com.example.springTest.bootstrap;

import com.example.springTest.models.Author;
import com.example.springTest.repository.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;

    public BootStrapData(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        Author a1 = new Author("pirmas", "antras");
//        Author a2 = new Author("trecias", "ketvirtas");
//
//        authorRepository.save(a1);
//        authorRepository.save(a2);
//
//        List<Author> authors =  (ArrayList<Author>) authorRepository.findAll();
//        authors.forEach(System.out::println);
//
//        Author author = authorRepository.findById(100L).orElse(new Author("not found", "not found"));
//        System.out.println(author);
//        Author aToe = authorRepository.findById(154L).orElse(null);
//        aToe.setName("dvidešimtas");
//        authorRepository.save(aToe);
//        authorRepository.deleteById(153L);
    }
}
