package com.gj.proficiency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gj.proficiency.model.Proficiency;

@Repository
public interface IProfeciencyRepo  extends JpaRepository<Proficiency, Integer>{

	public int generatedprofId();
}
