package com.example.Customer.web.repositories;

import com.example.Customer.web.Model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <StudentEntity, Integer> {

}