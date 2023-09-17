package com.demo.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiceImpl implements FileService {

	@Override
	public String uploadImage(String Path, MultipartFile file) throws IOException {
		
		//file name
		
		String name=file.getOriginalFilename();
		
		//full path
		
		String filePath=Path+File.separator+name;
		
		//create folder if not created
		
		File file1=new File(Path);
		if(!file1.exists()) {
			
			file1.mkdir();
		}
		
		//file copy
		
		Files.copy(file.getInputStream(),Paths.get(filePath));
		
		
		return name ;
	}

}
