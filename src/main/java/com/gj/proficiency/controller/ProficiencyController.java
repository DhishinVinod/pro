package com.gj.proficiency.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gj.proficiency.model.Proficiency;
import com.gj.proficiency.service.IProfService;

@RestController
public class ProficiencyController {
	
	@Autowired
	private IProfService service;
	
	
	@PostMapping("/add")
	public Proficiency createProficiency(@RequestBody Proficiency prof)
	{
		Proficiency proficiency=service.addProficiency(prof);
		return proficiency;
	}
	
	 @GetMapping("/getall")
	    public List<Proficiency> selectAll() {
		 
	        return service.getAllProficiencies();
	        
	    }
	 
	 @PutMapping("/update/{id}")
	    public Proficiency updateProficiency(@PathVariable int id, @RequestBody Proficiency prof) {
	        return service.updateProficiency(id, prof);
	    }
	
	    @DeleteMapping("delete/{id}")
	    public void deleteProficiency(@PathVariable int id) {
	        service.deleteProficiency(id);
	    }

	    
	
	

}
