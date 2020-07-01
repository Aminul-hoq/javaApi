package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

import antlr.collections.List;

public interface AlienRepo extends JpaRepository<Alien, Integer>{
	

	Alien findByAname(String aname);
	
}
