package com.queenscollege.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.queenscollege.pages.AboutQCPage;
import com.queenscollege.pages.ActingProvostAndVicePresidentForAcademicAffairsPage;
import com.queenscollege.pages.AdministrationPage;
import com.queenscollege.pages.ChiefOfStaffPage;
import com.queenscollege.pages.DepartmentsDropDownPage;
import com.queenscollege.pages.DirectorOfComplianceAndDiversityProgramsPage;
import com.queenscollege.pages.GeneralCounselAndSpecialCounselForLaborManagementRelationsPage;
import com.queenscollege.pages.HomePage;
import com.queenscollege.pages.Office365Page;
import com.queenscollege.pages.PhotoGalleryPage;
import com.queenscollege.pages.QCAtAGlancePage;
import com.queenscollege.pages.QCVideosPage;
import com.queenscollege.pages.QuickLinksDropDownPage;
import com.queenscollege.pages.StudentWebMailAccessPage;
import com.queenscollege.pages.TheArtsPage;
import com.queenscollege.pages.ThePresidentPage;
import com.queenscollege.pages.VicePresidentForFinanceAndAdministrationPage;
import com.queenscollege.pages.VicePresidentForStudentAffairsPage;
import com.queenscollege.pages.VideoArchives;
import com.queenscollege.pages.WebCamPage;

public class TestBase {
	
	public static WebDriver driver;
	public String browser = null;
	
	protected HomePage homePage;
	protected StudentWebMailAccessPage studentWebMailAccessPage;
	protected Office365Page office365Page;
	protected AboutQCPage aboutQCPage;
	protected QuickLinksDropDownPage quickLinksDropDoqnPage;
	protected DepartmentsDropDownPage departmentsDropDownpage;
	protected QCAtAGlancePage qcAtAGlancePage;
	protected PhotoGalleryPage photoGallery;
	protected QCVideosPage qcVidoesPage;
	protected VideoArchives videoArchives;
	protected TheArtsPage theArtsPage;
	protected WebCamPage webCamPage;
	protected AdministrationPage administrationPage;
	protected ThePresidentPage thePresidentPage;
	protected ChiefOfStaffPage chiefOfStaff;
	protected ActingProvostAndVicePresidentForAcademicAffairsPage actingProvostAndVicePresidentForAcademicAffairsPage;
	protected VicePresidentForFinanceAndAdministrationPage vicePresidentForFinanceAndAdministrationPage;
	protected VicePresidentForStudentAffairsPage vicePresidentForStudentAffairsPage;
	protected GeneralCounselAndSpecialCounselForLaborManagementRelationsPage generalCounselAndSpecialCounselForLaborManagementRelationsPage;
	protected DirectorOfComplianceAndDiversityProgramsPage directorOfComplianceAndDiversityProgramsPage;
	
	@BeforeSuite(alwaysRun = true)
	public void setUp() throws IOException{
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("D:\\Java_Workspace\\QueensCollege\\config.properties");
		prop.load(ip);
		browser = prop.getProperty("browserType");
		if(browser.equalsIgnoreCase("IE")){
			driver = new InternetExplorerDriver();
		}else if(browser.equalsIgnoreCase("Chrome")){
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("ff")){
			driver = new FirefoxDriver();
		}		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.qc.cuny.edu/Pages/home.aspx");
		
		homePage = PageFactory.initElements(driver, HomePage.class);
		studentWebMailAccessPage = PageFactory.initElements(driver, StudentWebMailAccessPage.class);
		office365Page = PageFactory.initElements(driver, Office365Page.class);
		aboutQCPage = PageFactory.initElements(driver, AboutQCPage.class);
		quickLinksDropDoqnPage = PageFactory.initElements(driver, QuickLinksDropDownPage.class);
		departmentsDropDownpage = PageFactory.initElements(driver, DepartmentsDropDownPage.class);
		qcAtAGlancePage = PageFactory.initElements(driver, QCAtAGlancePage.class); 
		photoGallery = PageFactory.initElements(driver, PhotoGalleryPage.class);
		qcVidoesPage = PageFactory.initElements(driver, QCVideosPage.class);
		videoArchives = PageFactory.initElements(driver, VideoArchives.class);
		theArtsPage = PageFactory.initElements(driver, TheArtsPage.class);
		webCamPage = PageFactory.initElements(driver, WebCamPage.class);
		administrationPage = PageFactory.initElements(driver, AdministrationPage.class);
		thePresidentPage = PageFactory.initElements(driver, ThePresidentPage.class);
		chiefOfStaff = PageFactory.initElements(driver, ChiefOfStaffPage.class);
		actingProvostAndVicePresidentForAcademicAffairsPage = PageFactory.initElements(driver, ActingProvostAndVicePresidentForAcademicAffairsPage.class);
		vicePresidentForFinanceAndAdministrationPage = PageFactory.initElements(driver, VicePresidentForFinanceAndAdministrationPage.class);
		vicePresidentForStudentAffairsPage = PageFactory.initElements(driver, VicePresidentForStudentAffairsPage.class);
		generalCounselAndSpecialCounselForLaborManagementRelationsPage = PageFactory.initElements(driver, GeneralCounselAndSpecialCounselForLaborManagementRelationsPage.class);
		directorOfComplianceAndDiversityProgramsPage = PageFactory.initElements(driver, DirectorOfComplianceAndDiversityProgramsPage.class);
	}
	 @AfterSuite
	 public void tearDown(){
		//driver.quit();
	 }
	

}
