package com.demo.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

	
	public String uploadImage(String Path,MultipartFile file) throws IOException;
}
