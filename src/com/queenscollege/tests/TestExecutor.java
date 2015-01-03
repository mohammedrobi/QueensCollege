package com.queenscollege.tests;
import org.testng.annotations.Test;

import com.queenscollege.base.TestBase;
import com.queenscollege.utility.TestDataProvider;

public class TestExecutor extends TestBase {
	
	
	@Test(dataProvider = "TestData", dataProviderClass = TestDataProvider.class)
	public void testStudentWebMailAccessPage(String user, String pass) {
		System.out.println("Running:- Student Email Login Test");
		studentWebMailAccessPage.doLogin(user,pass);
	} 
	@Test
	public void testHomePage(){
		System.out.println("Running:- Home Page Test");
		homePage.goToHomePage();
	}
	@Test(groups = {"Top Link Directory"})
	public void testQuickLinksPage(){
		System.out.println("Running:- Quick Links Page Test");
		quickLinksDropDoqnPage.goToQuickLinks();
		
	}	
	@Test(groups = {"Top Link Directory"})
	public void testDepartmentsPage(){
		System.out.println("Running:- Departments Drop Down Links Page Test");
		departmentsDropDownpage.goToDepartments();
	} 	
	@Test(groups = {"Menu Bar"})
	public void testAboutQCPage(){
		System.out.println("Running:- Abount QC Page Test");
		aboutQCPage.goToAboutQCPage();
 	}
	@Test(groups = {"QC At a Glance"})
	public void testQCAtAGlacePage(){
		System.out.println("Running:- QC at a Glance Page Test");
		qcAtAGlancePage.goToQCAtAGlancePage();
	} 
	@Test(groups = {"QC At a Glance"})	
	public void testPhotoGalleryPage(){
		System.out.println("Running:- Photo Gallery Page Test");
		photoGallery.goToPhotoGalleryPage();
	}
	@Test(groups = {"QC At a Glance"})
	public void testQCVideosPage(){
		System.out.println("Running:- QC Videos Page Test");
		qcVidoesPage.goToQCVideosPage();
	}
	@Test
	public void testVideoArchivesPage(){
		System.out.println("Running:- Video Archives Page Test");
		videoArchives.goToVideoArchivesPage();
	} 
	@Test(groups = {"QC At a Glance"})
	public void testTheArtsPage(){
		System.out.println("Running:- The Arts Page Test");
		theArtsPage.goToTheArtsPage();		
	}
	@Test(groups = {"QC At a Glance"})
	public void testWebCamPage() throws InterruptedException{
		System.out.println("Running:- Web Cam Page Test");
		webCamPage.goToWebCamPage();
	} 
	@Test(groups = {"Administration"})
	public void testAdmnistrationPage(){
		System.out.println("Running:- Administration Page Test");
		administrationPage.goToAdministrationPage();
	}  
	@Test(groups = {"Administration"})
	public void testThePresidentPage(){
		System.out.println("Running:- The Predisdent Page Test");
		thePresidentPage.goToThePresidentPage();
	}  
	@Test(groups = {"Administration"})
	public void testChiefOfStaff(){
		System.out.println("Running:- Chief Of Staff Page Test");
		chiefOfStaff.goToChiefOfStaffPage();
	} 
	@Test(groups = {"Administration"})
	public void testActingProvostAndVicePresidentForAcademicAffairs(){
		System.out.println("Running:- Provost And VP For Academic Affiars Page Test");
		actingProvostAndVicePresidentForAcademicAffairsPage.goToActingProvostAndVicePresidentForAcademicAffairs();
	}  
	@Test(groups = {"Administration"})
	public void testVicePresidentForFinanceAndAdministrationPage(){
		System.out.println("Running:- Vice President for Fiannce and Administration Page Test");
		vicePresidentForFinanceAndAdministrationPage.goToVicePresidentForFinanceAndAdministrationPage();
	} 
	@Test(groups = {"Administration"})
	public void testVicePredentForStudentAffairsPage(){
		System.out.println("Running:- Vice President for Student Affairs Page Test");
		vicePresidentForStudentAffairsPage.goToVicePresidentForStudentAffairsPage();
	}
	@Test(groups = {"Administration"})// popUp needs to fix
	public void testGeneralCounselAndSpecialCounselForLaborManagementRelationsPage(){
		System.out.println("Running:- General Counsel and Special Counsel for Labor/Management Relations Page Test");
		generalCounselAndSpecialCounselForLaborManagementRelationsPage.goToGeneralCounselAndSpecialCounselForLaborManagementRelationsPage();
	} 	
	@Test(groups = {"Administration"})// Need to FIX popup and "be in the know click"
	public void testDirectorOfComplianceAndDiversityProgramsPage(){
		System.out.println("Running:- Office of Compliance and Diversity Programs Page Test");
		directorOfComplianceAndDiversityProgramsPage.goToDirectorOfComplianceAndDiversityProgramsPage();
	}
}