package crossfitsandbox.entities;

import crossfitsandbox.data.enums.*;

import java.util.List;
import java.util.logging.Logger;

public class WOD {

    private String name;
    private int timecapInMinutes;
    private boolean isHeroWod;
    private List<WarmupExercises> warmupExercises;
    private List<GymnasticExercises> gymnasticExercises;
    private List<StrengthExercises> strengthExercises;
    private List<WeightliftingExercises> weightliftingExercises;
    private List<ConditioningExercises> conditioningExercises;
    private List<CooldownExercises> cooldownExercises;

    public WOD() {

        Logger logger = Logger.getLogger(this.getClass().getName());
        this.name = "";
    }

    public WOD(String name, int timecapInMinutes, boolean isHeroWod) {

        this();

        this.name = name;
        this.timecapInMinutes = timecapInMinutes;
        this.isHeroWod = isHeroWod;
    }


    public int getTimecapInMinutes() {
        return timecapInMinutes;
    }

    public void setTimecapInMinutes(int timecapInMinutes) {
        this.timecapInMinutes = timecapInMinutes;
    }

    public boolean isHeroWod() {
        return isHeroWod;
    }

    public void setHeroWod(boolean heroWod) {
        isHeroWod = heroWod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WarmupExercises> getWarmupExercises() {
        return warmupExercises;
    }

    public void setWarmupExercises(List<WarmupExercises> warmupExercises) {
        this.warmupExercises = warmupExercises;
    }

    public List<GymnasticExercises> getGymnasticExercises() {
        return gymnasticExercises;
    }

    public void setGymnasticExercises(List<GymnasticExercises> gymnasticExercises) {
        this.gymnasticExercises = gymnasticExercises;
    }

    public List<StrengthExercises> getStrengthExercises() {
        return strengthExercises;
    }

    public void setStrengthExercises(List<StrengthExercises> strengthExercises) {
        this.strengthExercises = strengthExercises;
    }

    public List<WeightliftingExercises> getWeightliftingExercises() {
        return weightliftingExercises;
    }

    public void setWeightliftingExercises(List<WeightliftingExercises> weightliftingExercises) {
        this.weightliftingExercises = weightliftingExercises;
    }

    public List<ConditioningExercises> getConditioningExercises() {
        return conditioningExercises;
    }

    public void setConditioningExercises(List<ConditioningExercises> conditioningExercises) {
        this.conditioningExercises = conditioningExercises;
    }

    public List<CooldownExercises> getCooldownExercises() {
        return cooldownExercises;
    }

    public void setCooldownExercises(List<CooldownExercises> cooldownExercises) {
        this.cooldownExercises = cooldownExercises;
    }
}
