package com.example.warrantycards.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "devices")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String serialNumber;

    @ManyToOne
    @JoinColumn(name = "service_center_id", nullable = false)
    private ServiceCenter serviceCenter;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date warrantyExpirationDate;
}
