package stepdef;

import base.JavaBase;
import io.cucumber.java.en.Given;
import pages.ContactPage;
import pages.HomePage;
import pages.LoginPage;


public class CogmentoStepDef extends JavaBase{

	LoginPage loginPage;
	HomePage homePage;
	ContactPage contactPage;
		@Given("I want to open browser and launch the application")
		public void i_want_to_open_browser_and_launch_the_application() {
		    // Write code here that turns the phrase above into concrete actions
			Initialize();
			   
		}
		
		@Given("login with {string} and {string}")
		public void login_with_credentials(String uname, String password) {
		    // Write code here that turns the phrase above into concrete actions
			loginPage=new LoginPage();
			homePage=new HomePage();
			loginPage.login(uname, password);
			homePage.isUserloggedin();   
		}
		
		@Given("click Contact link")
		public void click_contact_link() {
		    // Write code here that turns the phrase above into concrete actions
			contactPage=new ContactPage();
			homePage=new HomePage();
			homePage.contactPageList();
			contactPage.contactFilter();
		}
		//close browser
		@Given("close browser")
		public void close_browser() {
		    // Write code here that turns the phrase above into concrete actions
			driver.close();
			   
		
}

}