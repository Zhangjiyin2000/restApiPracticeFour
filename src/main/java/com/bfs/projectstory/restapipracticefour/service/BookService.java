package com.bfs.projectstory.restapipracticefour.service;

import com.bfs.projectstory.restapipracticefour.dto.UpdateBookRequest;
import com.bfs.projectstory.restapipracticefour.dto.UpdateBookResponse;
import com.bfs.projectstory.restapipracticefour.repository.BookRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private BookRepository bookRepository;

    public UpdateBookResponse updateBookById(Long id, UpdateBookRequest updateBookRequest) {

        return null;
    }
}
