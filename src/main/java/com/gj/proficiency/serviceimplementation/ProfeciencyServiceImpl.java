package com.gj.proficiency.serviceimplementation;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gj.proficiency.model.Proficiency;
import com.gj.proficiency.repository.IProfeciencyRepo;
import com.gj.proficiency.service.IProfService;


@Service
public class ProfeciencyServiceImpl implements IProfService{

	
	@Autowired
	private IProfeciencyRepo dao;
	
	
	@Override
	public Proficiency addProficiency(Proficiency prof) {
		int deptid=dao.generatedprofId();
		prof.setId(deptid);
		return dao.save(prof);
	}


	@Override
	public List<Proficiency> getAllProficiencies() {
	
		return dao.findAll();
	}


	@Override
	public Proficiency updateProficiency(int id, Proficiency prof) {
		
		Optional<Proficiency> existProf=dao.findById(id);
		
		if (existProf.isPresent()) {
            Proficiency updatedProf= existProf.get();
            updatedProf.setDescription(prof.getDescription());
            //updatedProf.setLastUpdatedOn(LocalDateTime.now());
            return dao.save(updatedProf);
	}
		return null;
	}


	@Override
	public void deleteProficiency(int id) {
		Optional<Proficiency> existprof= dao.findById(id);
        if (existprof.isPresent()) {
            dao.deleteById(id);
        } 
       
	}

}
