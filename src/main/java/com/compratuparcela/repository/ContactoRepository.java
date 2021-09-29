package com.compratuparcela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compratuparcela.models.entity.Contacto;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer>{

}
