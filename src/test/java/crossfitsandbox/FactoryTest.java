package crossfitsandbox;

import crossfitsandbox.entities.WOD;
import crossfitsandbox.factories.WODfactory;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FactoryTest{

    private WOD testWod;

    @Before
    public void setUp() {
        testWod = null;
    }

    @After
    public void tearDown() {

        testWod = null;
    }

    @Test
    public void buildEmptyWod()
    {
        testWod = WODfactory.getEmptyWod();

        assertNotNull(testWod);
        assertEquals("", testWod.getName());
        assertEquals(0, testWod.getTimecapInMinutes());
    }

    @Test
    public void buildNewWod()
    {
        testWod = WODfactory.getWod("testWod",60,false);

        assertNotNull(testWod);
        assertEquals("testWod", testWod.getName());
        assertEquals(60, testWod.getTimecapInMinutes());
        assertEquals(false, testWod.isHeroWod());
    }

}