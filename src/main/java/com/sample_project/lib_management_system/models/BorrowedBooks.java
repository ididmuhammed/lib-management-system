package com.sample_project.lib_management_system.models;

import jakarta.persistence.*;

@Entity
@Table(name = "borrowed_books")
public class BorrowedBooks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bid;

}
