package com.alex.mappers;

import com.alex.dto.PhoneDto;
import com.alex.model.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PhoneMapper {
    PhoneMapper INSTANCE = Mappers.getMapper(PhoneMapper.class);

    PhoneDto toDto(Phone phone);

    PhoneDto updateModel(PhoneDto phoneDto, @MappingTarget Phone phone);

    Phone toModel(PhoneDto phone);
}
