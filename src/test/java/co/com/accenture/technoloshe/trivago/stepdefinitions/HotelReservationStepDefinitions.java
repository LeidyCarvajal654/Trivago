 package co.com.accenture.technoloshe.trivago.stepdefinitions;


import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.accenture.technoloshe.trivago.questions.Data;
import co.com.accenture.technoloshe.trivago.tasks.OpenTheBrowser;
import co.com.accenture.technoloshe.trivago.tasks.ReservationData;
import co.com.accenture.technoloshe.trivago.tasks.SearchHotel;
import co.com.accenture.technoloshe.trivago.userinterfaces.TrivagoHome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class HotelReservationStepDefinitions {
	
	
	private TrivagoHome pagina;
	private Actor actor = Actor.named("leidy");
	@Managed (driver = "chrome")
	public WebDriver driver;
	
	@Before
	public void setUp() {
		actor.can(BrowseTheWeb.with(driver));
	}
	
	@Given("^that actor wants find lodging$")
	public void thatLeidyWantsFindLodging()  {
		actor.wasAbleTo(OpenTheBrowser.on(pagina));
			
	}

	@When("^she insert the data of the reservation$")
	public void sheInsertTheDataOfTheReservation(List<List<String>> text)  {
		actor.attemptsTo(SearchHotel.inThePage(text));
	}

	@Then("^She will see the cheapest booking information on the screen$")
	public void sheWillSeeTheCheapestBookingInformationOnTheScreen() throws Exception {
		actor.attemptsTo(ReservationData.inThePage());
		actor.should(seeThat(Data.at()));		
	   
}

	private Consequence seeThat(Data at) {
		// TODO Auto-generated method stub
		return null;
	}
}