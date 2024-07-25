package com.example.springTest.repository;

import com.example.springTest.models.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorRepository extends CrudRepository <Author,Long>{
//    Optional<Author> findById(long id);
    @Query(
        value = "SELECT * FROM authors WHERE name like %:name%",
        nativeQuery = true
    )
    Iterable<Author> fetchAuthorsByName(String name);
    @Query("SELECT a FROM Author a WHERE a.name LIKE %:surname%")
    Iterable<Author> fetchAuthorsBySurname(String surname);


}
