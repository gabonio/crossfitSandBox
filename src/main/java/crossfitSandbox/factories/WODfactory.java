package crossfitSandbox.factories;

import crossfitSandbox.entities.WOD;

public class WODfactory {

    private WODfactory()
    {

    }

    public static WOD getEmptyWod()
    {
        return new WOD();
    }

    public static WOD getWod(String name, int timecapInMinutes, boolean isHeroWod)
    {
        return new WOD(name, timecapInMinutes, isHeroWod);
    }
}
