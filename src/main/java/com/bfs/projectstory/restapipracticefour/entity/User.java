package com.bfs.projectstory.restapipracticefour.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "user") // The relationship is already managed by the user field inside the Book class.
    List<Book> books = new ArrayList<>();
}
