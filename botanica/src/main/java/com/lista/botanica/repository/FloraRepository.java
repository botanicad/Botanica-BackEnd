package com.lista.botanica.repository;

import com.lista.botanica.entity.Flora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FloraRepository extends JpaRepository<Flora, Long> {

}
