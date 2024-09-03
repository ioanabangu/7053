package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called ContractRepository
// CRUD refers Create, Read, Update, Delete

public interface CourseRepository extends JpaRepository<Course, String> {

    public void deleteByUsername(String username); //username - primary key in the Contract table

}
