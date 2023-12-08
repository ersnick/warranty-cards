package com.example.warrantycards.service;

import com.example.warrantycards.model.Warranty;

import java.util.List;

public interface WarrantyService {

    List<Warranty> getAllWarranties();

    Warranty getWarrantyById(Long id);

    void createWarranty(Warranty warranty);

    void updateWarranty(Warranty warranty);

    void deleteWarranty(Long id);
}
