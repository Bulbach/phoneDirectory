package com.alex.repository;

import com.alex.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PhoneDaoImpl extends JpaRepository<Phone,Long> {

}
