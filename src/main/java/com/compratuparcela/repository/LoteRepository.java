package com.compratuparcela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compratuparcela.models.entity.Lote;

@Repository
public interface LoteRepository extends JpaRepository<Lote, Integer> {

}
