package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Assigenment;
import com.example.demo.repo.AssigenmentRepo;
import com.example.demo.service.AssigenmentService;
@Service
public class AssigenmentImpl  implements AssigenmentService{
	@Autowired
	AssigenmentRepo repo;
	
	@Override
	public Assigenment addAs(Assigenment as) {
		return repo.save(as);
	}

	@Override
	public String delete() {
		repo.deleteAll();
		return "deleted";
	}

	@Override
	public List<Assigenment> displayAll() {
		return repo.findAll();
	}

	@Override
	public String deleteById(Integer id){
		repo.deleteById(id);
		return null;
	}
}
