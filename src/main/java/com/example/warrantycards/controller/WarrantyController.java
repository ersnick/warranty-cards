package com.example.warrantycards.controller;

import com.example.warrantycards.model.Device;
import com.example.warrantycards.model.Warranty;
import com.example.warrantycards.service.DeviceService;
import com.example.warrantycards.service.WarrantyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/warranty")
public class WarrantyController {

    private final WarrantyService warrantyService;
    private final DeviceService deviceService;

    @Autowired
    public WarrantyController(WarrantyService warrantyService, DeviceService deviceService) {
        this.warrantyService = warrantyService;
        this.deviceService = deviceService;
    }

    @GetMapping("/list")
    public String listWarranties(Model model) {
        model.addAttribute("warranties", warrantyService.getAllWarranties());
        return "warranty/list";
    }

    @GetMapping("/create/{deviceId}")
    public String createWarrantyForm(@PathVariable Long deviceId, Model model) {
        Device device = deviceService.getDeviceById(deviceId);
        model.addAttribute("device", device);
        return "warranty/create";
    }

    @PostMapping("/create/{deviceId}")
    public String createWarranty(@PathVariable Long deviceId, @ModelAttribute("warranty") Warranty warranty) {
        Device device = deviceService.getDeviceById(deviceId);
        warranty.setDevice(device);
        warrantyService.createWarranty(warranty);
        return "redirect:/warranty/list";
    }

    @GetMapping("/view/{id}")
    public String viewWarranty(@PathVariable Long id, Model model) {
        Warranty warranty = warrantyService.getWarrantyById(id);
        model.addAttribute("warranty", warranty);
        return "warranty/view";
    }

    @GetMapping("/edit/{id}")
    public String editWarrantyForm(@PathVariable Long id, Model model) {
        Warranty warranty = warrantyService.getWarrantyById(id);
        model.addAttribute("warranty", warranty);
        return "warranty/edit";
    }

    @PostMapping("/edit/{id}")
    public String editWarranty(@PathVariable Long id, @ModelAttribute("warranty") Warranty warranty) {
        warranty.setId(id); // Устанавливаем ID, чтобы обновление происходило для правильного объекта
        warrantyService.updateWarranty(warranty);
        return "redirect:/warranty/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteWarranty(@PathVariable Long id) {
        warrantyService.deleteWarranty(id);
        return "redirect:/warranty/list";
    }
}
