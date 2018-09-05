package crossfitSandbox;

import crossfitSandbox.entities.WOD;
import crossfitSandbox.factories.WODfactory;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FactoryTest{

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void buildNewWod()
    {
        WOD testWod = WODfactory.getWod(60,false);
        assertNotNull(testWod);
    }

}