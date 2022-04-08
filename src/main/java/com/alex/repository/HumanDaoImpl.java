package com.alex.repository;

import com.alex.model.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface HumanDaoImpl extends JpaRepository<Human,Long> {

}
