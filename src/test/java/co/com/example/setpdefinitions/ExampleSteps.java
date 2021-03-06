package co.com.example.setpdefinitions;

import co.com.example.navigation.OpenBrowser;
import co.com.example.tasks.AddItems;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ExampleSteps {


    @Given("^que el usuario (.*) accede hasta la página principal$")
    public void accessToApp(String name) {
        theActorCalled(name)
                .wasAbleTo(
                        OpenBrowser.inPage()
                );

    }

    @When("^el agrega item (.*) al carrito$")
    public void addItems(String item) {
        theActorInTheSpotlight()
                .wasAbleTo(
                        AddItems.toCart(item)
                );

    }

    @Then("^el puede realizar la compra de los artículos$")
    public void payItems() {

    }

}
