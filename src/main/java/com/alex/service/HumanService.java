package com.alex.service;

import com.alex.dto.HumanDto;
import com.alex.mappers.HumanMapper;
import com.alex.model.Human;
import com.alex.repository.HumanDaoImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HumanService {
    private final HumanDaoImpl humanDao = getHumanDao();
    private final HumanMapper humanMapper = getHumanMapper();


    public HumanDaoImpl getHumanDao() {
        return humanDao;
    }

    public HumanMapper getHumanMapper() {
        return humanMapper;
    }

    public HumanDto getById(Long id) {

        return humanMapper.toDto(humanDao.getById(id));
    }

    public HumanDto createHuman(HumanDto human) {
        Human human1 = humanMapper.toModel(human);

        return humanMapper.toDto(humanDao.save(human1));
    }


    public void delete(Long id) {
        humanDao.deleteById(id);
    }

    public List<HumanDto> getAll() {
        return humanDao.findAll()
                .stream()
                .map(humanMapper::toDto)
                .collect(Collectors.toList());
    }

    public void saveAll(List<HumanDto> humanDtoList) {
        List<Human> humanList = humanDtoList.stream()
                .map(humanMapper::toModel)
                .collect(Collectors.toList());
        humanDao.saveAll(humanList);
    }

    public HumanDto updateHuman(HumanDto humanDto) {
        Human humanById = humanDao.getById(humanDto.getId());
        humanMapper.updateHumanFromDto(humanDto, humanById);

        return humanMapper.toDto(humanDao.save(humanById));

    }
}
/*



        void saveAll(Collection<T> saveCollection) throws HotelException;
 */