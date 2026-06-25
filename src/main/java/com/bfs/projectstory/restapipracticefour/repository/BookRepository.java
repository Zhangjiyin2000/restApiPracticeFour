package com.bfs.projectstory.restapipracticefour.repository;

import com.bfs.projectstory.restapipracticefour.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
