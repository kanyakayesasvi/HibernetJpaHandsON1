package com.accolite.SpringHiberNetJpa.Entites;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="Address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private  String country;
    private String  state;
    private  String city;
    private String pincode;}


