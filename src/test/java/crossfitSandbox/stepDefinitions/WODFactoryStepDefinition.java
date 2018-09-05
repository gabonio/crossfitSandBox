package crossfitSandbox.stepDefinitions;

import crossfitSandbox.entities.WOD;
import crossfitSandbox.factories.WODfactory;
import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.runtime.PendingException;

public class WODFactoryStepDefinition
{
    public static WOD wod = null;

    @Given("^that I want a new WOD$")
    public void thatIWantANewWOD() throws Throwable {

        wod = WODfactory.getEmptyWod();
    }

    @And("^the name of the new WOD is \"([^\"]*)\"$")
    public void theNameOfTheNewWODIs(String arg0) throws Throwable {

        wod.setName(arg0);
    }

    @And("^is NOT a Hero WOD$")
    public void isNotAHeroWOD() throws Throwable {

        wod.setHeroWod(false);
    }

    @And("^is a Hero WOD$")
    public void isAHeroWOD() throws Throwable {

        wod.setHeroWod(true);
    }

    @And("^the WOD is (\\d+) minutes long$")
    public void theWODIsMinutesLong(int arg0) throws Throwable {

        wod.setTimecapInMinutes(arg0);
    }

    @Then("^the new wod must be named \"([^\"]*)\"$")
    public void theNewWodMustBeNamed(String arg0) throws Throwable {

        assert wod != null;
        assert wod.getName().equals(arg0);
    }

    @And("^the new wod must be (\\d+) minutes long$")
    public void theNewWodMustBeMinutesLong(int arg0) throws Throwable {

        assert wod != null;
        assert wod.getTimecapInMinutes() == arg0;
    }

    @And("^it must NOT be a hero WOD$")
    public void itMustNOTBeAHeroWOD() throws Throwable {

        assert wod != null;
        assert wod.isHeroWod() == false;
    }

    @And("^it must be a hero WOD$")
    public void itMustBeAHeroWOD() throws Throwable {

        assert wod != null;
        assert wod.isHeroWod() == true;
    }
}
