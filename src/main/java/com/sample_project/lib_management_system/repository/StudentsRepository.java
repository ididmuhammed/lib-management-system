package com.sample_project.lib_management_system.repository;

import com.sample_project.lib_management_system.models.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Integer> {
}
