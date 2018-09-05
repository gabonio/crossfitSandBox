package crossfitSandbox.factories;

import crossfitSandbox.entities.WOD;

public class WODfactory {

    private WODfactory()
    {

    }

    public static WOD getWod(double timecapInMinutes, boolean isHeroWod)
    {
        return new WOD(timecapInMinutes, isHeroWod);
    }
}
