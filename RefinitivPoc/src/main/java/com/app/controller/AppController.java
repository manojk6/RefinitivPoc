package com.app.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.models.AlphaModel;
import com.app.models.BetaModel;
import com.app.models.DirectMatchModelData;
import com.app.models.GammaModel;
import com.app.service.AppService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class AppController {
	
	@Autowired
	private AppService appService;
	
	private String UPLOADED_FOLDER = "F://springboot//SpringBootForBeginners-master//SpringBootForBeginners-master"
			+ "//01.Spring-Boot-Introduction-In-10-Steps//src//main//resources//temp//";

//	@GetMapping("/heros")
//	public List<AlphaModel> getAllBooks() {
//		List<AlphaModel> l1=(List<AlphaModel>) utilClass(UPLOADED_FOLDER,AlphaModel.class);
//		for(AlphaModel alphaModel1:l1 ){
//			System.out.println(alphaModel1);
//		}
//		return l1;
//	}
	
	@PostMapping("/upload") 
    public List<?> singleFileUpload(@RequestParam() MultipartFile file) {
		List<?> l1=null;
		try {
			byte[] bytes = file.getBytes();
	         java.nio.file.Path path = Paths.get(UPLOADED_FOLDER,file.getOriginalFilename());
	         Files.write(path, bytes);
	         System.out.println(file.getOriginalFilename());
	         String filename=file.getOriginalFilename();
	         //if(filename.equals("Direct Matching Test Data.json")){
	        	l1= appService.directMatchingResults(UPLOADED_FOLDER+"Direct Matching Test Data.json",DirectMatchModelData.class);
	        	 //l1=utilClass(UPLOADED_FOLDER+"Alpha.json",AlphaModel.class);
//	        	 }else if(filename.equals("Beta.json")){
//	        		 l1=utilClass(UPLOADED_FOLDER+"Beta.json",BetaModel.class);
//	         }else if(filename.equals("Gamma.json")){
//	        	 l1=utilClass(UPLOADED_FOLDER+"Gamma.json",GammaModel.class);
//	         }else if(filename.equals("Direct Matching Test Data.json")){
//	        	 l1=utilClass(UPLOADED_FOLDER+"Direct Matching Test Data.json",DirectMatchModelData.class);
//	         }else{
//	        	 l1=utilClass(UPLOADED_FOLDER+"Fuzzy Matching Test Data.json",DirectMatchModelData.class);
//	         }
	         //}
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		return l1;
	}
	
//	private List<?> utilClass(String s,Class classType){
//		ObjectMapper mapper = new ObjectMapper();
//		File f=new File(s);
//		List<?> listdata=null;
//        try {
//			if (classType == AlphaModel.class){
//				listdata = mapper.readValue(f, mapper.getTypeFactory().constructCollectionType(List.class, classType));
//			}else if(classType == BetaModel.class){
//				listdata = mapper.readValue(f, mapper.getTypeFactory().constructCollectionType(List.class, classType));
//			}else if(classType == GammaModel.class){
//				listdata = mapper.readValue(f, mapper.getTypeFactory().constructCollectionType(List.class, classType));
//			}else {
//				listdata = mapper.readValue(f, mapper.getTypeFactory().constructCollectionType(List.class, classType));
//			}
//			} catch (IOException e) {
//            e.printStackTrace();
//        }
//        
//		return listdata;
//		
//}
	
}
