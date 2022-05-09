package com.summer.DojoNinja.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.summer.DojoNinja.models.Dojo;
import com.summer.DojoNinja.models.Ninja;
import com.summer.DojoNinja.repositories.DojoRepository;

@Service
public class NinjaService {
	
	private final DojoRepository repo;
    
    public NinjaService(DojoRepository repo) {
        this.repo = repo;
    }
    // returns all the books
    public List<Dojo> all() {
        return repo.findAll();
    }
    // creates a book
    public Dojo create(Ninja ninja) {
    	System.out.println(ninja.getId());
        return repo.save(ninja);
    }
    // retrieves a book
    public Dojo find(Long id) {
        Optional<Dojo> result = repo.findById(id);
        if(result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }
}