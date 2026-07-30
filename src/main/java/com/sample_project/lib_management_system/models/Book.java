package com.sample_project.lib_management_system.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String authur;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "b_id") // Foreign key in employees table
    private List<BorrowedBooks> borrowedBooks = new ArrayList<>();
}
