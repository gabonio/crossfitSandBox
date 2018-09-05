package crossfitSandbox.entities;

import java.util.logging.Logger;

public class WOD {

    private final Logger logger;

    private double timecapInMinutes;
    private boolean isHeroWod;

    public WOD(double timecapInMinutes, boolean isHeroWod) {

        this.logger =  Logger.getLogger(this.getClass().getName());
        this.timecapInMinutes = timecapInMinutes;
        this.isHeroWod = isHeroWod;
    }

    public double getTimecapInMinutes() {
        return timecapInMinutes;
    }

    public void setTimecapInMinutes(double timecapInMinutes) {
        this.timecapInMinutes = timecapInMinutes;
    }

    public boolean isHeroWod() {
        return isHeroWod;
    }

    public void setHeroWod(boolean heroWod) {
        isHeroWod = heroWod;
    }
}
