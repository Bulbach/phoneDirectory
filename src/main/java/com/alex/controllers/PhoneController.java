package com.alex.controllers;

import com.alex.dto.PhoneDto;
import com.alex.service.PhoneService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phone")
public class PhoneController {

    private final PhoneService phoneService = getPhoneService();

    public PhoneService getPhoneService() {
        return phoneService;
    }

    @PostMapping("/add")
    public PhoneDto createPhone(@RequestBody PhoneDto phoneDto) {
        return phoneService.createPhone(phoneDto);
    }

    //todo переделать дичь лютая была
    @PostMapping("/update")
    public PhoneDto updatePhone(@RequestBody PhoneDto phoneDto) {
        return null;
    }

    @GetMapping("/get/{id}")
    public PhoneDto getById(@PathVariable("id") Long id){
        return phoneService.getById(id);
    }
    @GetMapping("/all")
    public List<PhoneDto> getAll(){
        return phoneService.getAll();
    }
    @DeleteMapping("/delete/{id}")
    public void deletePhone(@PathVariable("id") Long id){
        phoneService.delete(id);
    }
}
