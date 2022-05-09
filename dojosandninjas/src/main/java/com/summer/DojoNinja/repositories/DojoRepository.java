package com.summer.DojoNinja.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.summer.DojoNinja.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {

	List<Dojo> findAll();

	Optional<Dojo> findById(Long id);

}
