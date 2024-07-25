package com.example.springTest.repository;

import com.example.springTest.models.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorRepository extends CrudRepository <Author,Long>{
//    Optional<Author> findById(long id);
//    Iterable<Author> fetchAuthorsByName(String name);
//    @Query(
//        value = "SELECT * FROM authors WHERE name like %?name:%",
//        nativeQuery = true
//    )
}
