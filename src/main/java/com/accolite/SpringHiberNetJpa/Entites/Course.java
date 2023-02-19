package com.accolite.SpringHiberNetJpa.Entites;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Course")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String CourseName;

    public Course(String courseName) {
        CourseName = courseName;
    }
}
