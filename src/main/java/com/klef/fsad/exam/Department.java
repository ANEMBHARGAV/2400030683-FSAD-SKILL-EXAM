package com.klef.fsad.exam;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="department")
public class Department {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String name;
 private String description;
 @Temporal(TemporalType.DATE)
 private Date date;
 private String status;
 public Department() {}
 public Department(String name,String description,Date date,String status)
 {
  this.name=name;
  this.description=description;
  this.date=date;
  this.status=status;
 }
}
