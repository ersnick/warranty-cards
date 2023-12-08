package com.example.warrantycards.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "service_centers")
public class ServiceCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @OneToMany(mappedBy = "serviceCenter")
    private List<Device> devices;

    // Геттеры и сеттеры, конструкторы и другие методы

    // ...
}
