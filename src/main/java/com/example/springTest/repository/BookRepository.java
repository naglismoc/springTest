package com.example.springTest.repository;

import com.example.springTest.models.Author;
import com.example.springTest.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book,Long>{
//    Optional<Author> findById(long id);
}
