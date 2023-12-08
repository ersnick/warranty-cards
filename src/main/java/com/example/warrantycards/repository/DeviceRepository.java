package com.example.warrantycards.repository;
import com.example.warrantycards.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
    Device findBySerialNumber(String serialNumber);
}
