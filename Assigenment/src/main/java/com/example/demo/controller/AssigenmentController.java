package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Assigenment;
import com.example.demo.service.AssigenmentService;
@CrossOrigin
@RestController
public class AssigenmentController {
	@Autowired
	AssigenmentService service;
	
	@PostMapping("addDetails")
	public ResponseEntity<Assigenment> add(@RequestBody Assigenment as)
	{
		return new ResponseEntity<Assigenment>(service.addAs(as),HttpStatus.CREATED);
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAll() {
		return service.delete();
	}
	
	@GetMapping("displayall")
	public List<Assigenment> display(){
		return service.displayAll();
	}
	
	@DeleteMapping("deletebyid/{id}")
	public String deleteById(@PathVariable("id") Integer id)
	{
		service.deleteById(id);
		return "deleted";
	}
	
}
