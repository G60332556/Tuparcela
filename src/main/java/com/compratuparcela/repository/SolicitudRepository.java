package com.compratuparcela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compratuparcela.models.entity.Solicitud;


@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, Integer>{
	
	

}
