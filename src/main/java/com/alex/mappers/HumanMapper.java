package com.alex.mappers;

import com.alex.dto.HumanDto;
import com.alex.model.Human;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface HumanMapper {

    HumanMapper INSTANCE = Mappers.getMapper(HumanMapper.class);

    HumanDto toDto(Human human);

    Human toModel(HumanDto humanDto);

    HumanDto updateModel(HumanDto humanDto, @MappingTarget Human human);
}
