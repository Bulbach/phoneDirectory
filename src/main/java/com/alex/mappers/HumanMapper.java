package com.alex.mappers;

import com.alex.dto.HumanDto;
import com.alex.model.Human;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring", uses = {PhoneMapper.class})
@Component
public interface HumanMapper {

    HumanDto toDto(Human human);

    Human toModel(HumanDto humanDto);

    HumanDto updateModel(HumanDto humanDto, @MappingTarget Human human);
}
