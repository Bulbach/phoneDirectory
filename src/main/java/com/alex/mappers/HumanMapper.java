package com.alex.mappers;

import com.alex.dto.HumanDto;
import com.alex.model.Human;
import org.mapstruct.Mapper;

@Mapper
public interface HumanMapper {

    HumanDto toDto(Human human);
    Human toModel(HumanDto humanDto);
}
