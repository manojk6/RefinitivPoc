package com.app.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.models.AlphaModel;
import com.app.models.BetaModel;
import com.app.models.DirectMatchModelData;
import com.app.models.GammaModel;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AppService {
	
	private String UPLOADED_FOLDER = "F://springboot//SpringBootForBeginners-master//SpringBootForBeginners-master"
			+ "//01.Spring-Boot-Introduction-In-10-Steps//src//main//resources//temp//";
	
	private List<AlphaModel> alphaReferenceData;
	private List<BetaModel> betaReferenceData;
	private List<BetaModel> gammaReferenceData;
	private List<DirectMatchModelData> directMappingRefData;
	private List<com.app.models.AlphaDirectModel> AlphaDirectModelResults=new ArrayList<com.app.models.AlphaDirectModel>();
	
	
	
	@SuppressWarnings("unchecked")
	public List<?> directMatchingResults(String s,Class classType){
		System.out.println("service");
		alphaReferenceData=(List<AlphaModel>)utilClass(UPLOADED_FOLDER+"Alpha.json",AlphaModel.class);
		directMappingRefData=(List<DirectMatchModelData>)utilClass(s,DirectMatchModelData.class);
		
		for ( DirectMatchModelData directMatchModelData: directMappingRefData)  
        { 
			for ( AlphaModel alphaModel: alphaReferenceData)  
	        { 
				com.app.models.AlphaDirectModel alphaDirectModel=new com.app.models.AlphaDirectModel();
	            if(directMatchModelData.getLegalEntityIden().equals(alphaModel.getLegalEntityIden())
	              && directMatchModelData.getLegalOrgName().equals(alphaModel.getLegalOrgName())
	               &&directMatchModelData.getLegalForm().equals(alphaModel.getLegalForm()))
	              {
	            	alphaDirectModel.setLegalEntityIden(alphaModel.getLegalEntityIden());
	            	alphaDirectModel.setLegalOrgName(alphaModel.getLegalOrgName());
	            	alphaDirectModel.setLegalForm(alphaModel.getLegalForm());
	            	AlphaDirectModelResults.add(alphaDirectModel);
	              }
	        }   
        }
		
		return AlphaDirectModelResults;
	}

	private List<?> utilClass(String s,Class classType){
		ObjectMapper mapper = new ObjectMapper();
		File f=new File(s);
		List<?> listdata=null;
        try {
			if (classType == AlphaModel.class){
				listdata = mapper.readValue(f, mapper.getTypeFactory().constructCollectionType(List.class, classType));
			}else if(classType == BetaModel.class){
				listdata = mapper.readValue(f, mapper.getTypeFactory().constructCollectionType(List.class, classType));
			}else if(classType == GammaModel.class){
				listdata = mapper.readValue(f, mapper.getTypeFactory().constructCollectionType(List.class, classType));
			}else {
				listdata = mapper.readValue(f, mapper.getTypeFactory().constructCollectionType(List.class, classType));
			}
			} catch (IOException e) {
            e.printStackTrace();
        }
        
		return listdata;
		
}
}
