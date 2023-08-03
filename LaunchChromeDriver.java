package week1.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class LaunchChromeDriver {

	public static void main(String[] args) {
		
		//launch the chromebrower
		ChromeDriver driver=new ChromeDriver();
		//load the application url
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 //maximize the brower
		 driver.manage().window().maximize();
		
		 //enter the user name as Demosalesmanager 
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 
		  //enter the passwork as crmsfa
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 //click the decorativesubmitbutton
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //click the CRM/SFA button
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 //click the leads linktext button
		 driver.findElement(By.linkText("Leads")).click();
		 
		 //click the Create lead button 
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 
		 //create leadfrom companyname 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Zoho");
		 
		 
		 //createleadfrom firstname 
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Avinash");
		  
		 
		 //create the lastname 
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Y");
		 
		 
		 //create the industrydropdown filed
		  WebElement findElement = driver.findElement(By.id("createLeadForm_industryEnumId"));
		 
		  
		  Select indutryDropdown=new Select(findElement);
		  
		  //indutryDropdown.selectByValue("IND_HARDWARE");
		  
		  indutryDropdown.selectByVisibleText("Distribution");
		  
		  
		 // WebElement findElement0 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		  
		 // Select ownershipDropdown1=new Select(findElement0);
		  
		 //ownershipDropdown1.selectByVisibleText("OWN_PROPRIETOR");
		  
		 // create the ownershipdropdown filed
		 
		 WebElement findElement2= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 
		 Select ownershipdropdown2=new Select(findElement2);
		 
		 ownershipdropdown2.selectByValue("OWN_PROPRIETOR");
		 
		 
		 //create the departmentname textbox
		 driver.findElement(By.name("departmentName")).sendKeys("M.Sc");
		 
		 //create the fistnamelocal
		 driver.findElement(By.name("firstNameLocal")).sendKeys("Avinash.Y");
		 
		 
		 //create the lastnamelocal
		 driver.findElement(By.name("lastNameLocal")).sendKeys("Yogabalan");
		 
		 
		 //create the leadfrom primarygmail textbox filed
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("avinasyoga2@gmail.com");
		 
		 //create the select from State/Province dropdown box
		 WebElement findElement3=driver.findElement(By.name("generalStateProvinceGeoId"));
		 
		 
		  Select State=new Select(findElement3);
		 
		  State.selectByVisibleText("New York");
		  
		  
		  //create the create smallsubmit button
		  driver.findElement(By.className("smallSubmit")).click();
		  
		  
		  //create the description textbox filed
		  driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("I am very interested in testing domain");
		
		  
		  
		  driver.findElement(By.linkText("Edit")).click();
		  
		  
		  driver.findElement(By.id("updateLeadForm_description")).clear();
		  
		  
		  //create the edit button click them
		  driver.findElement(By.className("subMenuButton")).click();
		  
		  
		  //view the result for the title for command prompt
		  String title1 = "View Lead | opentaps CRM";
		  
			String title = driver.getTitle();
			if(title1.equals(title)) {
				System.out.println(title1);
			}
			else {
				System.out.println("Error");
			}
		 
		 
		 

	}

}
