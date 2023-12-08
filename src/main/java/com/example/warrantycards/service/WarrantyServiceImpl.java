package com.example.warrantycards.service;

import com.example.warrantycards.model.Warranty;
import com.example.warrantycards.repository.WarrantyRepository;
import com.example.warrantycards.service.WarrantyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WarrantyServiceImpl implements WarrantyService {

    private final WarrantyRepository warrantyRepository;

    @Autowired
    public WarrantyServiceImpl(WarrantyRepository warrantyRepository) {
        this.warrantyRepository = warrantyRepository;
    }

    @Override
    public List<Warranty> getAllWarranties() {
        return warrantyRepository.findAll();
    }

    @Override
    public Warranty getWarrantyById(Long id) {
        return warrantyRepository.findById(id).orElse(null);
    }

    @Override
    public void createWarranty(Warranty warranty) {
        warrantyRepository.save(warranty);
    }

    @Override
    public void updateWarranty(Warranty warranty) {
        warrantyRepository.save(warranty);
    }

    @Override
    public void deleteWarranty(Long id) {
        warrantyRepository.deleteById(id);
    }
}
