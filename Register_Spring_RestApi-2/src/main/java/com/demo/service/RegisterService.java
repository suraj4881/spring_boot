package com.demo.service;

import java.util.List;
import com.demo.model.Register;

public interface RegisterService {

	public Register createRegister(Register register);
	public List<Register> getAllDetls();
	public Register updateRegister(String id,Register register);
	public String deleteRegister(String id);
	public Register getADetls(String id);
	
}
