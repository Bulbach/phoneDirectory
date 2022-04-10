package com.alex.mappers;

import com.alex.dto.PhoneDto;
import com.alex.model.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper
public interface PhoneMapper {

    PhoneDto toDto(Phone phone);
    Phone toModel(PhoneDto phone);
}
