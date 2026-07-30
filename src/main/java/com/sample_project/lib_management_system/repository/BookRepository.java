package com.sample_project.lib_management_system.repository;

import com.sample_project.lib_management_system.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

}