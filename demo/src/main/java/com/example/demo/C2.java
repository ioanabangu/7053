package com.example.demo;

import javax.persistence.*;

@Entity
public class C2 extends User {
    @Column(name="grade")
    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int num) {
        this.grade = num;
    }
}
