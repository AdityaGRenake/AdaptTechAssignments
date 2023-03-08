package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Assigenment;

public interface AssigenmentService {
	
	public Assigenment addAs(Assigenment as);
	
	public String delete();
	
	public String deleteById(Integer id);
	
	public List<Assigenment> displayAll();
	
	
}
