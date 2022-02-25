package com.TRUGlobal.Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.TRUGlobal.genericUtility.webDriverUtility;

public class TRUGlobalRunModule
{
	@Test
	public void VerifiHomePage() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","../TruGlobal/src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		webDriverUtility wb=new webDriverUtility();
		wb.waitUntilPageLoad(driver);
		driver.get("https://www.truglobal.com/");
		
		// Verifying Home Page
		HomePage HM=new HomePage(driver);
		HM.getHomeLink().click();
		Thread.sleep(2000);
		String Expected = "Page Comes First";
		System.out.println("Expected:" + Expected);
		String Actual = driver.findElement(By.xpath("//h1[text()='Page Comes First']")).getText();
		System.out.println("Actual:" + Actual);
		if (Expected.equals(Actual))
		{
			System.out.println("Waoooo we are in Home Page");
		}
		System.out.println("*************************************************************************************");
		
		 // Verifying Services  Page
		
			
			  ServicesPage sp= new ServicesPage(driver); sp.getServicesLink().click();
			  sp.getRoboticProcessAutomationLink().click(); Thread.sleep(2000);
			  
			  String ExpectedRoboticProcessAutomation = "Robotic Process Automation";
			  System.out.println("Expected:" + ExpectedRoboticProcessAutomation); String
			  ActualRoboticProcessAutomation =
			  driver.findElement(By.linkText("Robotic Process Automation")).getText();
			  System.out.println("Actual:" + ActualRoboticProcessAutomation); if
			  (ExpectedRoboticProcessAutomation.equals(ActualRoboticProcessAutomation)) {
			  System.out.println("Waoooo we are in Robotic Process Automation Page"); }
			  System.out.println(
			  "*************************************************************************************"
			  );
			  
			  sp.getServicesLink().click(); sp.getArtificialIntelligenceLink().click();
			  Thread.sleep(2000);
			  
			  String ExpectedRArtificialIntelligence = "Artificial Intelligence";
			  System.out.println("Expected:" + ExpectedRArtificialIntelligence); String
			  ActualArtificialIntelligence =
			  driver.findElement(By.linkText("Artificial Intelligence")).getText();
			  System.out.println("Actual:" + ActualArtificialIntelligence); if
			  (ExpectedRArtificialIntelligence.equals(ActualArtificialIntelligence)) {
			  System.out.println("Waoooo we are in Artificial Intelligence Page"); }
			  System.out.println(
			  "*************************************************************************************"
			  );
			  
			  
			  sp.getServicesLink().click(); sp.getMachineLearningLink().click();
			  Thread.sleep(2000);
			  
			  String ExpectedMachineLearning = "Machine Learning";
			  System.out.println("Expected:" + ExpectedMachineLearning); String
			  ActualMachineLearning =
			  driver.findElement(By.linkText("Machine Learning")).getText();
			  System.out.println("Actual:" + ActualMachineLearning); if
			  (ExpectedMachineLearning.equals(ActualMachineLearning)) {
			  System.out.println("Waoooo we are in Machine Learning Page"); }
			  System.out.println(
			  "*************************************************************************************"
			  );
			  
			  
			  sp.getServicesLink().click(); sp.getInternetofThingsLink().click();
			  Thread.sleep(2000);
			  
			  String ExpectedInternetofThings = "Internet of Things";
			  System.out.println("Expected:" + ExpectedInternetofThings); String
			  ActualInternetofThings =
			  driver.findElement(By.linkText("Internet of Things")).getText();
			  System.out.println("Actual:" + ActualInternetofThings); if
			  (ExpectedInternetofThings.equals(ActualInternetofThings)) {
			  System.out.println("Waoooo we are in Internet of Things Page"); }
			  System.out.println(
			  "*************************************************************************************"
			  );
			  
			  sp.getServicesLink().click(); sp.getMobilityLink().click();
			  Thread.sleep(2000);
			  
			  String ExpectedMobility = "Mobility"; System.out.println("Expected:" +
			  ExpectedMobility); String ActualMobility =
			  driver.findElement(By.linkText("Mobility")).getText();
			  System.out.println("Actual:" + ActualMobility); if
			  (ExpectedMobility.equals(ActualMobility)) {
			  System.out.println("Waoooo we are in Mobility Page"); } System.out.println(
			  "*************************************************************************************"
			  );
			  
			  sp.getServicesLink().click(); sp.getChatbotLink(); Thread.sleep(2000);
			  
			  String ExpectedChatbot = "Chatbot"; System.out.println("Expected:" +
			  ExpectedChatbot); String ActualChatbot =
			  driver.findElement(By.linkText("Chatbot")).getText();
			  System.out.println("Actual:" + ActualChatbot); if
			  (ExpectedChatbot.equals(ActualChatbot)) {
			  System.out.println("Waoooo we are in Chatbot Page"); } System.out.println(
			  "*************************************************************************************"
			  );
			  
			  sp.getServicesLink().click(); sp.getDigitalExperienceLink().click();
			  Thread.sleep(2000); String ExpectedDigitalExperience = "Digital Experience";
			  System.out.println("Expected:" + ExpectedDigitalExperience); String
			  ActualDigitalExperience =
			  driver.findElement(By.linkText("Digital Experience")).getText();
			  System.out.println("Actual:" + ActualDigitalExperience); if
			  (ExpectedDigitalExperience.equals(ActualDigitalExperience)) {
			  System.out.println("Waoooo we are in Digital Experience Page"); }
			  System.out.println(
			  "*************************************************************************************"
			  );
			  
			  sp.getServicesLink().click();
			  sp.getDigitalSecurityLink().click();
			  
			  String ExpectedDigitalSecurity = "Digital Security";
			  System.out.println("Expected:" + ExpectedDigitalSecurity); String
			  ActualDigitalSecurity =
			  driver.findElement(By.linkText("Digital Security")).getText();
			  System.out.println("Actual:" + ActualDigitalSecurity); if
			  (ExpectedDigitalSecurity.equals(ActualDigitalSecurity)) {
			  System.out.println("Waoooo we are in Digital Security Page"); }
			  System.out.println(
			  "*************************************************************************************"
			  );
			 
		
		
		// Verifying Services inside Sub Module Engineering Services Page
		
		
		  ServicesEngineeringServices ses=new ServicesEngineeringServices(driver);
		  ses.getServicesLink().click(); // ses.getEngineeringServicesLink().click();
		  
		  ses.getServicesLink().click(); ses.getSupportMaintenanceLink().click();
		  Thread.sleep(2000); String ExpectedSupportMaintenance =
		  "Support & Maintenance"; System.out.println("Expected:" +
		  ExpectedSupportMaintenance); String ActualSupportMaintenance =
		  driver.findElement(By.linkText("Support & Maintenance")).getText();
		  System.out.println("Actual:" + ActualSupportMaintenance); if
		  (ExpectedSupportMaintenance.equals(ActualSupportMaintenance)) {
		  System.out.println("Waoooo we are in Support & Maintenance Page"); }
		  System.out.println(
		  "*************************************************************************************"
		  );
		  
		  ses.getServicesLink().click(); ses.getEnterpriseDevOpsLink().click();
		  Thread.sleep(2000); String ExpectedEnterpriseDevOps = "Enterprise DevOps";
		  System.out.println("Expected:" + ExpectedEnterpriseDevOps); String
		  ActualEnterpriseDevOps =
		  driver.findElement(By.linkText("Enterprise DevOps")).getText();
		  System.out.println("Actual:" + ActualEnterpriseDevOps); if
		  (ExpectedEnterpriseDevOps.equals(ActualEnterpriseDevOps)) {
		  System.out.println("Waoooo we are in Enterprise DevOps Page"); }
		  System.out.println(
		  "*************************************************************************************"
		  );
		  
		  
		  ses.getServicesLink().click(); ses.getApplicationEngineeringLink().click();
		  Thread.sleep(2000); String ExpectedApplicationEngineering =
		  "Application Engineering"; System.out.println("Expected:" +
		  ExpectedApplicationEngineering); String ActualApplicationEngineering =
		  driver.findElement(By.linkText("Application Engineering")).getText();
		  System.out.println("Actual:" + ActualApplicationEngineering); if
		  (ExpectedApplicationEngineering.equals(ActualApplicationEngineering)) {
		  System.out.println("Waoooo we are in Application Engineering Page"); }
		  System.out.println(
		  "*************************************************************************************"
		  );
		  
		  
		  ses.getServicesLink().click(); ses.getProductDesignDevelopmentLink().click();
		  Thread.sleep(2000);
		  
		  ses.getServicesLink().click();
		  ses.getManufacturingExecutionSystemLink().click(); Thread.sleep(2000);
		  
		  String ExpectedManufacturing = "Manufacturing Execution System (MES)";
		  System.out.println("Expected:" + ExpectedManufacturing); String
		  ActualManufacturing =
		  driver.findElement(By.linkText("Manufacturing Execution System (MES)")).
		  getText(); System.out.println("Actual:" + ActualManufacturing); if
		  (ExpectedManufacturing.equals(ActualManufacturing)) { System.out.
		  println("Waoooo we are in Manufacturing Execution System (MES) Page"); }
		  System.out.println(
		  "*************************************************************************************"
		  );
		  
		  ses.getServicesLink().click(); ses.getPLMServicesLink().click();
		  Thread.sleep(2000);
		  
		  String ExpectedPLMServices = "PLM Services"; System.out.println("Expected:" +
		  ExpectedPLMServices); String ActualPLMServices =
		  driver.findElement(By.linkText("PLM Services")).getText();
		  System.out.println("Actual:" + ActualPLMServices); if
		  (ExpectedPLMServices.equals(ActualPLMServices)) {
		  System.out.println("Waoooo we are in PLM Services Page"); }
		  System.out.println(
		  "*************************************************************************************"
		  );
		  
		 
		 
		
		// Verifying Services inside Sub Module Enterprise Transformation Page
		
		  ServiseEnterpriseTransformation set=new ServiseEnterpriseTransformation(driver); 
		  set.getServicesLink().click();
		  set.getOracleSolutionsLink().click(); 
		  Thread.sleep(2000);
		  
		  
		  String ExpectedOracleSolutions = "Oracle Solutions";
			System.out.println("Expected:" + ExpectedOracleSolutions);
			String ActualOracleSolutions = driver.findElement(By.linkText("Oracle Solutions")).getText();
			System.out.println("Actual:" + ActualOracleSolutions);
			if (ExpectedOracleSolutions.equals(ActualOracleSolutions))
			{
				System.out.println("Waoooo we are in Oracle Solutions Page");
			}
			System.out.println("*************************************************************************************");
		  
		  set.getServicesLink().click(); 
		  set.getSAPSolutionsLink().click();
		  Thread.sleep(2000);
		  
		  String ExpectedSAPSolutions = "SAP Solutions";
			System.out.println("Expected:" + ExpectedSAPSolutions);
			String ActualSAPSolutions = driver.findElement(By.linkText("SAP Solutions")).getText();
			System.out.println("Actual:" + ActualSAPSolutions);
			if (ExpectedSAPSolutions.equals(ActualSAPSolutions))
			{
				System.out.println("Waoooo we are in SAP Solutions Page");
			}
			System.out.println("*************************************************************************************");
		  
		  
		  set.getServicesLink().click(); 
		  set.getMicrosoftLink().click();
		  Thread.sleep(2000);
		  
		  String ExpectedMicrosoft = "Microsoft";
			System.out.println("Expected:" + ExpectedMicrosoft);
			String ActualMicrosoft = driver.findElement(By.linkText("Microsoft")).getText();
			System.out.println("Actual:" + ActualMicrosoft);
			if (ExpectedMicrosoft.equals(ActualMicrosoft))
			{
				System.out.println("Waoooo we are in Microsoft Page");
			}
			System.out.println("*************************************************************************************");
		  
		  
		  
		  set.getServicesLink().click();
		  set.getSalesforceLink().click();
		  Thread.sleep(2000);
		  
		  
		  
		  set.getServicesLink().click();
		  set.getEnterpriseIntegrationLink().click();
		  Thread.sleep(2000);
		  
		  String ExpectedEnterpriseIntegration = "Enterprise Integration ";
			System.out.println("Expected:" + ExpectedEnterpriseIntegration);
			String ActualEnterpriseIntegration = driver.findElement(By.linkText("Enterprise Integration")).getText();
			System.out.println("Actual:" + ActualEnterpriseIntegration);
			if (ExpectedEnterpriseIntegration.equals(ActualEnterpriseIntegration))
			{
				System.out.println("Waoooo we are in Enterprise Integration Page");
			}
			System.out.println("*************************************************************************************");
		  
		  
		  
		  set.getServicesLink().click();
		  set.getPortalsCollaborationsLink().click();
		  
		  String ExpectedPortalsCollaborations = "Portals & Collaborations";
			System.out.println("Expected:" + ExpectedPortalsCollaborations);
			String ActualPortalsCollaborations = driver.findElement(By.linkText("Portals & Collaborations")).getText();
			System.out.println("Actual:" + ActualPortalsCollaborations);
			if (ExpectedPortalsCollaborations.equals(ActualPortalsCollaborations))
			{
				System.out.println("Waoooo we are in Portals & Collaborations Page");
			}
			System.out.println("*************************************************************************************");
		  
		 
		
		
		
	//	Thread.sleep(2000);
		// Verifying Insight Page
		InsightsPage isp=new InsightsPage(driver);
		isp.getInsightsLink().click();
		Thread.sleep(2000);
		
		String ExpectedInsight= "Case Studies";
		System.out.println("Expected:" + ExpectedInsight);
		String ActualInsight = driver.findElement(By.linkText("Case Studies")).getText();
		System.out.println("Actual:" + ActualInsight);
		if (ExpectedInsight.equals(ActualInsight))
		{
			System.out.println("Waoooo we are in Insight Page");
		}
		System.out.println("*************************************************************************************");
		
		// Verifying Company Page
		
		
		  CompanyPage comp=new CompanyPage(driver); comp.getCompanyLink().click();
		  comp.getAboutusLink().click(); String ExpectedCompany= "About us";
		  System.out.println("Expected:" + ExpectedCompany); String ActualCompany =
		  driver.findElement(By.id("h-about-us")).getText();
		  System.out.println("Actual:" + ActualCompany);
		  if(ExpectedCompany.equals(ActualCompany)) {
		  System.out.println("Waoooo we are in Company About us Page"); }
		  System.out.println(
		  "*************************************************************************************"
		  );
		  
			/*
			 * Thread.sleep(2000); comp.CompanyEmpSpeak(); comp.CompanyHappyCustomersLink();
			 * comp.CompanyLifeatTRUGlobalLink(); comp.CompanyBlogsLink();
			 * comp.CompanyCareersLink(); comp.CompanyContactUsLink();
			 */
		 
			  
			 
			 
		
	
	  comp.getCompanyLink().click(); 
	  comp.getEmployeeSpeakLink().click();
	 
	//	Thread.sleep(2000);
		
	
	  comp.getCompanyLink().click(); comp.getHappyCustomersLink().click();
	  Thread.sleep(2000);
	  
	  
	  comp.getCompanyLink().click(); comp.getLifeatTRUGlobalLink().click();
	  Thread.sleep(2000);
	  
	  comp.getCompanyLink().click(); comp.getBlogsLink().click();
	  Thread.sleep(2000);
	  
	  comp.getCompanyLink().click(); comp.getCareersLink().click();
	  Thread.sleep(2000);
	  
	  comp.getCompanyLink().click(); comp.getContactUsLink().click();
	  Thread.sleep(2000);
	 
		
		
		driver.quit();
	}
}
