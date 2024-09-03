package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mname")
public class Course {
    private String mname;
    private String username;

    @Id
    @Column(name="username") //username - primary key in the Course table
    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
		this.username = name;
    } 

    @Column(name="mname") //username - primary key in the Course table
    public String getMname() {
        return mname;
    }

    public void setMname(String content) {
		this.mname = content;
    } 

}