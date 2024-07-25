package com.example.springTest.services;


import com.example.springTest.models.Author;
import com.example.springTest.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }

    public Optional<Author> findById(Long id) {
        return authorRepository.findById(id);
    }

    public Author save(Author author) {
        return authorRepository.save(author);
    }

    public void deleteById(Long id) {
        authorRepository.deleteById(id);
    }
    public Iterable<Author> fetchAuthorsByName(String name) {
        return authorRepository.fetchAuthorsByName(name);
    }
    public Iterable<Author> fetchAuthorsBySurame(String surname) {
        return authorRepository.fetchAuthorsBySurname(surname);
    }
}
