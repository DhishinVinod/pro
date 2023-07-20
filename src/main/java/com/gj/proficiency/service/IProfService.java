package com.gj.proficiency.service;

import java.util.List;

import com.gj.proficiency.model.Proficiency;

public interface IProfService {
	
	public Proficiency addProficiency(Proficiency prof);
	
	public List<Proficiency> getAllProficiencies();
	
	 public Proficiency updateProficiency(int id, Proficiency prof);

	 public void deleteProficiency(int id);
}
