package com.sample_project.lib_management_system.repository;

import com.sample_project.lib_management_system.models.BorrowedBooks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowedBooksRepository  extends JpaRepository<BorrowedBooks, Integer> {
}
