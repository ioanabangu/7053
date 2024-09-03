package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class User {
    // note: attributes should be the same order in the database 
    //(if not using @column)
    @Id
    @Column(name="username")
    private String username; //username - primary key in the User table

    @Column(name = "email")
    private String email;

    @Column(name = "dtype",  insertable=false, updatable=false) //dtype: default
    private String dtype; //dtype: the default attribute for sub-types

    @Column(name="company")
    private String company;
     
    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }
    
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    
    //obtain the Course object
    public Course constructCourseObject() {  
        Course courseObj = new Course();  // composition
        courseObj.setUsername(this.username);
         
        return courseObj;
    }
    

}
