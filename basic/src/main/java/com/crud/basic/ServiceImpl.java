package com.crud.basic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements Service1{
	
	@Autowired
	private Repo repo;
	
	@Override
	public List<entity> view() {
		List<entity> l1= new ArrayList<>();
		repo.findAll().forEach(l1::add);
		return l1;
	}

	@Override
	public entity add(entity e) {
		entity e1= new entity(
				e.getId(),
				e.getName(),
				e.getConf());
		repo.save(e1);
		return e1;
	}

	@Override
	public entity edit(entity e) {
		if(repo.existsById(e.getId())) {
			@SuppressWarnings("deprecation")
			entity e1=repo.getById(e.getId());
			e1.setName(e.getName());
			e1.setConf(e.getConf());
			return repo.save(e1);
		}
		else
		return null;
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
		
	}

}
