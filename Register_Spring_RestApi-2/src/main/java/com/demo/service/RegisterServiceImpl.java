package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Register;
import com.demo.repo.RegisterRepo;


@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterRepo registerRepo;
	
	@Override
	public Register createRegister(Register register) {
		
		return registerRepo.save(register);
	}

	@Override
	public List<Register> getAllDetls() {
		
		return registerRepo.findAll();
	}

	@Override
	public Register updateRegister(String id, Register register) {
		
		register.setId(id);
		
		return registerRepo.save(register) ;
	}

	
	@Override
	public String deleteRegister(String id) {
		
		Optional<Register> reg=registerRepo.findById(id);
		
		if(reg.get()!=null) 
		{
			registerRepo.delete(reg.get());
			return "Deleted successfully";
		}
		
		return "Not Deleted for this id ";
	}

	@Override
	public Register getADetls(String id) {
		
		Optional<Register> reg=registerRepo.findById(id);
		
          return reg.get() ;
				
	}
    
}
