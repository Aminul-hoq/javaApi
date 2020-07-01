package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;
import com.sun.el.stream.Optional;

import antlr.collections.List;

@RestController
public class HomeController {
	
	@Autowired
	AlienRepo repo;
	
	@PostMapping("signup")
	public Alien saveAlien(@RequestBody Alien alien){
		repo.save(alien);
		return alien;	
	}
	@GetMapping("/signin/{aname}")
	public Alien getAlien(@PathVariable("aname") String aname) {
		
		return repo.findByAname(aname);
	}
	
	@PutMapping("/signup")
	public Alien updateAlien(Alien alien){
		repo.save(alien);
		return alien;	
	}
		
}
