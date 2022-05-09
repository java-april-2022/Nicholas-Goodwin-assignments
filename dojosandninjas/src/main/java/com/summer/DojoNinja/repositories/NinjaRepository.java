package com.summer.DojoNinja.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.summer.DojoNinja.models.Dojo;
import com.summer.DojoNinja.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
	List<Ninja> findAll();
	List<Ninja> findAllByDojo(Dojo dojo);
}
