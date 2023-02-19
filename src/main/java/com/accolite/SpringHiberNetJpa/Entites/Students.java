package com.accolite.SpringHiberNetJpa.Entites;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private  String Name;
    private  String email;
    private  Long phonenumber;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    Address address;


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "StudentsId", referencedColumnName = "id")

    List<Course> courses=new ArrayList<>();





}
