package com.sample_project.lib_management_system.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sId;
    private String sname;
    private String course;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "s_id") // Foreign key in employees table
    private List<BorrowedBooks> borrowedBooks = new ArrayList<>();
}
