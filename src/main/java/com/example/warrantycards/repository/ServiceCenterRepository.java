package com.example.warrantycards.repository;
import com.example.warrantycards.model.ServiceCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceCenterRepository extends JpaRepository<ServiceCenter, Long> {
    ServiceCenter findByName(String name);
}
