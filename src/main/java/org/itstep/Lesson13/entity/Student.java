package org.itstep.Lesson13.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "student")
@Entity
public class Student {

    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;
}
