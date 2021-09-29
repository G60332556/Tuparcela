package com.compratuparcela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compratuparcela.models.entity.Tipo;

@Repository
public interface TipoRepository extends JpaRepository<Tipo, Integer>{

}
