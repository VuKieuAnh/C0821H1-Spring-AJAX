package com.codegym.c0320h1.repository;

import com.codegym.c0320h1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    Iterable<Student> findAllByNameContaining (String name);
}
