package com.alex.controllers;

import com.alex.dto.HumanDto;
import com.alex.service.HumanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/human")
@Api("Контроллер для работы с классом Human")
public class HumanController {
    private final HumanService humanService = getHumanService();

    public HumanService getHumanService() {
        return humanService;
    }

    @RequestMapping("/basic")
    @ApiOperation("метод для отправки данных на страницу jsp")
    public ModelAndView home() {
        List<HumanDto> listHuman = humanService.getAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listHuman", listHuman);
        return mav;
    }
    @PostMapping("/add")
    @ApiOperation("добавление новой сущности")
    public HumanDto createHuman(@RequestBody HumanDto humanDto) {
        return humanService.createHuman(humanDto);
    }

    //todo тоже самое переделать
    @PostMapping("/update")
    @ApiOperation("изменение сущности")
    public HumanDto updateHuman(@RequestBody HumanDto humanDto) {
        return null;
    }

    @GetMapping("/get/{id}")
    @ApiOperation("поиск по id")
    public HumanDto getById(@PathVariable Long id) {
        return humanService.getById(id);
    }

    @GetMapping("/all")
    @ApiOperation("полный список сущностей")
    public List<HumanDto> getAll() {
        return humanService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("удаление сущьности")
    public void deleteHuman(@PathVariable Long id) {
        humanService.delete(id);
    }
}
