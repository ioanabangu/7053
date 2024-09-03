package com.example.demo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "team")

public class Team {
    
  private String name;
    @Id
    @Column(name="name")
    public String getName() {
        return name;
    }
    @Column(name = "dtype")
    private String dtype;

    public void setName(String str) {
		this.name = str;
    } 

    public String getDtype() {
      return dtype;
  }

  public void setDtype(String dtype) {
      this.dtype = dtype;
  }




  @Column(name="dstart")
  private Date dstart;

  public Date getDstart() {
      return dstart;
  }

  public void setDstart(Date dstart) {
      this.dstart = dstart;
  }
  @Column(name="about")
  private String about;

  public String getAbout() {
      return about;
  }

  public void setAbout(String about) {
      this.about = about;
  }
  @Column(name="trainer")
  private String trainer;

  public String getTrainer() {
      return trainer;
  }

  public void setTrainer(String trainer) {
      this.trainer = trainer;
  }
}