package com.example.demo;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CourseService {

    @Autowired
    private CourseRepository repo;

    public List<Course> listAll() {
        return repo.findAll();
    }

    public void save(Course content) {
        repo.save(content);
    }

    public Course get(String name) {
        return repo.findById(name).get();
    }

    public void delete(String name) {
        repo.deleteByUsername(name); //username - primary key in the Contract table
    }   
    
}
