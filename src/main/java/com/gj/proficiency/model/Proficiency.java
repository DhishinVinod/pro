package com.gj.proficiency.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.apache.el.parser.AstFalse;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="prof")
public class Proficiency {
	
	   //@Id
	   //@GeneratedValue(strategy =GenerationType.IDENTITY)
	   //@SequenceGenerator(name="my_seq_gen",sequenceName ="seq_employee",allocationSize = 1)
//	   @Column(name="id")
	    private int id;
	    
	    @Column(name="description")
	    private String description;
	   
	    @CreationTimestamp
	    @Column(name = "created_on",  nullable = false)
	    private LocalDateTime createdOn;
	    
	    @Column(name = "deleted")
	    private boolean deleted=false;
	    
	    
	   
	    
	    
//	    public Proficiency(int id, String description, LocalDateTime createdOn, Boolean deleted) {
//			super();
//			this.id = id;
//			this.description = description;
//			this.createdOn = createdOn;
//			this.deleted = deleted;
//		}

		public Proficiency() {
			// TODO Auto-generated constructor stub
		}

		public boolean isDeleted() {
			return deleted;
		}

		public void setDeleted(boolean deleted) {
			this.deleted = deleted;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public LocalDateTime getCreatedOn() {
			return createdOn;
		}

		public void setCreatedOn(LocalDateTime createdOn) {
			this.createdOn = createdOn;
		}

		

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	    

}
