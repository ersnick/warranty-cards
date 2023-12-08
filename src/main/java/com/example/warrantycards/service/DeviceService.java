package com.example.warrantycards.service;

import com.example.warrantycards.model.Device;
import com.example.warrantycards.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {
    private final DeviceRepository deviceRepository;

    @Autowired
    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public Device getDeviceById(Long id) {
        return deviceRepository.findById(id).orElse(null);
    }
}
