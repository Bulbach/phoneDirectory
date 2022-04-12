package com.alex.controllers;

import com.alex.dto.PhoneDto;
import com.alex.service.PhoneService;
import io.swagger.annotations.ApiOperation;
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
    @ApiOperation("добавление телефона")
    public PhoneDto createPhone(@RequestBody PhoneDto phoneDto) {
        return phoneService.createPhone(phoneDto);
    }

    //todo переделать дичь лютая была
    @PostMapping("/update")
    @ApiOperation("изменение телефона")
    public PhoneDto updatePhone(@RequestBody PhoneDto phoneDto) {
        return phoneService.updatePhone(phoneDto);
    }

    @GetMapping("/get/{id}")
    @ApiOperation("поиск по id")
    public PhoneDto getById(@PathVariable("id") Long id){
        return phoneService.getById(id);
    }
    @GetMapping("/phones")
    @ApiOperation("полный список сущностей")
    public List<PhoneDto> getAll(){
        return phoneService.getAll();
    }
    @DeleteMapping("/{id}")
    public void deletePhone(@PathVariable("id") Long id){
        phoneService.delete(id);
    }
}
