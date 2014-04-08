package com.dxt.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	public long id;

	public BaseEntity() {
		// TODO Auto-generated constructor stub
	}

}
