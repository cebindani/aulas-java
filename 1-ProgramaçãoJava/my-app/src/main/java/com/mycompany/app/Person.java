package com.mycompany.app;

import java.util.ArrayList;
import java.util.Collection;

public class Person {

	private int id;
	private String name;
	private String address;
	private String cpf;
	
	private Collection<String> phones = new ArrayList<String>();
	
	public Person(int id, String name, String address, String cpf) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id;
		this.name=name;
		this.address=address;
		this.cpf=cpf;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.length()==0) {
			throw new IllegalArgumentException();
		}
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
