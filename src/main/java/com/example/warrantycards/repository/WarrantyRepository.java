package com.example.warrantycards.repository;

import com.example.warrantycards.model.Warranty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarrantyRepository extends JpaRepository<Warranty, Long> {
}
