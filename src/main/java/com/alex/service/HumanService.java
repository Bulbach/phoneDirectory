package com.alex.service;

import com.alex.dto.HumanDto;
import com.alex.mappers.HumanMapper;
import com.alex.model.Human;
import com.alex.repository.HumanDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HumanService {
    private final HumanDaoImpl humanDao;
    private final HumanMapper humanMapper;

    public HumanService(@Autowired HumanDaoImpl humanDao,@Autowired HumanMapper humanMapper) {
        this.humanDao = humanDao;
        this.humanMapper = humanMapper;
    }

    public HumanDto getById(Long id) {

        return humanMapper.toDto(humanDao.getById(id));
    }

    public HumanDto createHuman(HumanDto human) {
        Human human1 = humanMapper.toModel(human);

        return humanMapper.toDto(humanDao.save(human1));
    }

    public HumanDto updateHuman(HumanDto human) {
        Human humanDaoById = humanDao.getById(human.getId());

        return humanMapper.updateModel(human,humanDaoById);
    }

    public void delete(Long id){
        humanDao.deleteById(id);
    }

    public List<HumanDto> getAll(){
        return humanDao.findAll()
                .stream()
                .map(humanMapper::toDto)
                .collect(Collectors.toList());
    }

    public void saveAll(List<HumanDto> humanDtoList){
        List<Human> humanList = humanDtoList.stream()
                .map(humanMapper::toModel)
                .collect(Collectors.toList());
        humanDao.saveAll(humanList);
    }
}
/*



        void saveAll(Collection<T> saveCollection) throws HotelException;
 */