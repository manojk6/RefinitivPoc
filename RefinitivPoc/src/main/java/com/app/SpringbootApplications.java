package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.app")
public class SpringbootApplications {
	

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringbootApplications.class, args);
	}
	
	
	
//	private static  void excelreading() throws Exception {
//		List directMAtchTestData =new ArrayList();
//		List fuzzyMAtchTestData =new ArrayList();
//		List alphaTestData =new ArrayList();
//		List betaTestData =new ArrayList();
//		List gammaTestData =new ArrayList();
//		fis = new FileInputStream(SAMPLE_XLSX_FILE_PATH);
//        Workbook workbook = WorkbookFactory.create(fis);
//        int numberOfSheets = workbook.getNumberOfSheets();
//       
//       for (int i = 0; i < numberOfSheets; i++) {
//    	   Sheet sheet = (Sheet) workbook.getSheetAt(i);
//    	   System.out.println(sheet.getSheetName());
//           Iterator rowIterator = sheet.iterator();
//           while (rowIterator.hasNext()) {	
//        	   PocModel pocModel = new PocModel();
//        	   Row row = (Row) rowIterator.next();
//               Iterator cellIterator = row.cellIterator();
//               while (cellIterator.hasNext()) {
//            	Cell cell = (Cell) cellIterator.next();
//            	if (cell.getColumnIndex() == 0) {
//            		System.out.println(cell.getStringCellValue());
//            		pocModel.setLeIdentifier(cell.getStringCellValue());
//                }else if (cell.getColumnIndex() == 1) {
//                	System.out.println(cell.getStringCellValue());
//            		pocModel.setLegalOrgName(cell.getStringCellValue());
//                }else if (cell.getColumnIndex() == 3) {
//                	System.out.println(cell.getStringCellValue());
//            		pocModel.setLegalForm(cell.getStringCellValue());
//                }else if(cell.getColumnIndex() == 7){
//                	System.out.println(cell.getStringCellValue());
//                	pocModel.setTickerCode(cell.getStringCellValue());}
//                else if(cell.getColumnIndex() == 11){
//                	System.out.println(cell.getStringCellValue());
//                	pocModel.setBusinessRCode(cell.getStringCellValue());
//                }       }
//               
//               if(workbook.getSheetAt(i).getSheetName()=="Direct Matching Test Data"){
//            	   directMAtchTestData.add(pocModel);
//               }else if(workbook.getSheetAt(i).getSheetName()=="Fuzzy Matching Test Data"){
//            	   fuzzyMAtchTestData.add(pocModel);
//               }else if(workbook.getSheetAt(i).getSheetName()=="Alpha"){
//            	   alphaTestData.add(pocModel);
//               }else if(workbook.getSheetAt(i).getSheetName()=="Beta"){
//            	   betaTestData.add(pocModel);
//               }else if(workbook.getSheetAt(i).getSheetName()=="Gamma"){
//            	   gammaTestData.add(pocModel);
//               }
//
//}
//           
//}
//       System.out.println("directdata"); 
//       System.out.println(directMAtchTestData.size());
//       System.out.println(directMAtchTestData);
//       System.out.println("fuzzydata"); 
//       System.out.println(fuzzyMAtchTestData.size());
//       System.out.println(fuzzyMAtchTestData);
//       System.out.println("alphadata"); 
//       System.out.println(alphaTestData.size());
//       System.out.println(alphaTestData);
//       System.out.println("betadata"); 
//       System.out.println(betaTestData.size());
//       System.out.println(betaTestData);
//       System.out.println("gammaTestData"); 
//       System.out.println(gammaTestData.size());
//       System.out.println(gammaTestData);
//       fis.close();
//       
//
	}
