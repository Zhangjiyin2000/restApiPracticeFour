package com.bfs.projectstory.restapipracticefour.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "books")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = true)
    private String title;

    private BigDecimal price;

    // @JoinColumn(name = "user_id") defines the foreign key column on the owning side.
    // In this case, the books table has a user_id column pointing to the users table.
    // Since Book is the many side, it owns the relationship.
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
