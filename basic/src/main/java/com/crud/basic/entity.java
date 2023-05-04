package com.crud.basic;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class entity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private Boolean conf;
	
	public entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public entity(int id, String name, Boolean conf) {
		super();
		this.id = id;
		this.name = name;
		this.conf = conf;
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
		this.name = name;
	}

	public Boolean getConf() {
		return conf;
	}

	public void setConf(Boolean conf) {
		this.conf = conf;
	}

	@Override
	public String toString() {
		return "entity [id=" + id + ", name=" + name + ", conf=" + conf + "]";
	}
	

}
