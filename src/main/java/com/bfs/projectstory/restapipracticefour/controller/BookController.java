package com.bfs.projectstory.restapipracticefour.controller;

import com.bfs.projectstory.restapipracticefour.dto.UpdateBookRequest;
import com.bfs.projectstory.restapipracticefour.dto.UpdateBookResponse;
import com.bfs.projectstory.restapipracticefour.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookController {

    private BookService bookService;

    @PutMapping("/{id}")
    public ResponseEntity<UpdateBookResponse> updateBook(@Valid @PathVariable Long id, @RequestBody UpdateBookRequest updateBookRequest) {
        return ResponseEntity.ok(bookService.updateBookById(id, updateBookRequest));
    }

}
