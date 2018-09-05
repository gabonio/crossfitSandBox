package crossfitsandbox.stepDefinitions;

import crossfitsandbox.entities.WOD;
import crossfitsandbox.factories.WODfactory;
import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;

public class WODFactoryStepDefinition
{
    private static WOD wod = null;

    @Given("^that I want a new WOD$")
    public void thatIWantANewWOD() {

        wod = WODfactory.getEmptyWod();
    }

    @And("^the name of the new WOD is \"([^\"]*)\"$")
    public void theNameOfTheNewWODIs(String arg0) {

        wod.setName(arg0);
    }

    @And("^is NOT a Hero WOD$")
    public void isNotAHeroWOD() {

        wod.setHeroWod(false);
    }

    @And("^is a Hero WOD$")
    public void isAHeroWOD() {

        wod.setHeroWod(true);
    }

    @And("^the WOD is (\\d+) minutes long$")
    public void theWODIsMinutesLong(int arg0) {

        wod.setTimecapInMinutes(arg0);
    }

    @Then("^the new wod must be named \"([^\"]*)\"$")
    public void theNewWodMustBeNamed(String arg0) {

        assert wod != null;
        assert wod.getName().equals(arg0);
    }

    @And("^the new wod must be (\\d+) minutes long$")
    public void theNewWodMustBeMinutesLong(int arg0) {

        assert wod != null;
        assert wod.getTimecapInMinutes() == arg0;
    }

    @And("^it must NOT be a hero WOD$")
    public void itMustNOTBeAHeroWOD() {

        assert wod != null;
        assert !wod.isHeroWod();
    }

    @And("^it must be a hero WOD$")
    public void itMustBeAHeroWOD() {

        assert wod != null;
        assert wod.isHeroWod();
    }
}
