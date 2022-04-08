package com.alex.mappers;

import com.alex.dto.PhoneDto;
import com.alex.model.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring", uses = {HumanMapper.class})
@Component
public interface PhoneMapper {
    PhoneDto toDto(Phone phone);

    PhoneDto updateModel(PhoneDto phoneDto, @MappingTarget Phone phone);

    Phone toModel(PhoneDto phone);
}
