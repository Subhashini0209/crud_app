package com.crud.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/user")

public class myController {
	
	@Autowired
	private Service1 service1;
	
	@GetMapping("/view")
	public List<entity> view(){
		return service1.view();
	}
	
	@PostMapping("/add")
	public entity add(@RequestBody entity e) {
		return service1.add(e);
	}
	
	@PutMapping("/edit")
	public entity edit(@RequestBody entity e) {
		return service1.edit(e);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(value = "id") int id) {
		service1.delete(id);
	}

}
