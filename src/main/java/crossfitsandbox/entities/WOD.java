package crossfitsandbox.entities;

import crossfitsandbox.data.enums.*;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WOD {

    //<editor-fold desc="Class properties">
    Logger logger;

    private String name;
    private int timecapInMinutes;
    private boolean isHeroWod;
    private List<WarmupExercises> warmupExercises;
    private List<GymnasticExercises> gymnasticExercises;
    private List<StrengthExercises> strengthExercises;
    private List<WeightliftingExercises> weightliftingExercises;
    private List<ConditioningExercises> conditioningExercises;
    private List<CooldownExercises> cooldownExercises;
    //</editor-fold>

    //<editor-fold desc= "Getters & Setters"
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

        if(warmupExercises == null)
            warmupExercises = new ArrayList<WarmupExercises>();

        return warmupExercises;
    }

    public List<GymnasticExercises> getGymnasticExercises() {

        if(gymnasticExercises == null)
                gymnasticExercises = new ArrayList<GymnasticExercises>();

        return gymnasticExercises;
    }

    public List<StrengthExercises> getStrengthExercises() {

        if(strengthExercises == null)
            strengthExercises = new ArrayList<StrengthExercises>();

        return strengthExercises;
    }

    public List<WeightliftingExercises> getWeightliftingExercises() {

        if(weightliftingExercises == null)
            weightliftingExercises = new ArrayList<WeightliftingExercises>();

        return weightliftingExercises;
    }

    public List<ConditioningExercises> getConditioningExercises() {

        if(conditioningExercises == null)
            conditioningExercises = new ArrayList<ConditioningExercises>();

        return conditioningExercises;
    }

    public List<CooldownExercises> getCooldownExercises() {

        if(cooldownExercises == null)
            cooldownExercises = new ArrayList<CooldownExercises>();

        return cooldownExercises;
    }

    //</editor-fold>

    //<editor-fold desc= "Constructors"

    public WOD() {

        this.logger = Logger.getLogger(this.getClass().getName());
        this.name = "";
    }

    public WOD(String name, int timecapInMinutes, boolean isHeroWod) {

        this();

        this.name = name;
        this.timecapInMinutes = timecapInMinutes;
        this.isHeroWod = isHeroWod;
    }
    //</editor-fold>

    //<editor-fold desc= "Private Methods"


    //</editor-fold>

    //<editor-fold desc= "Public Methods"

    //<editor-fold desc= "Exercise Lists manipulation"

    public void addWarmupExercise (WarmupExercises newExercise) {
        this.getWarmupExercises().add(newExercise);

        this.logger.log(Level.INFO, "Warmup " +newExercise.name() + " added to the WOD: "+ this.getName());
    }

    public void removeWarmupExercise (WarmupExercises exercise) {
        if(getWarmupExercises().contains(exercise)) {
            getWarmupExercises().remove(exercise);
            this.logger.log(Level.INFO, "Warmup " +exercise.name() + " removed from the WOD: "+ this.getName());
        }
        else
            this.logger.log(Level.INFO, "Warmup " +exercise.name() + " is not part of the WOD: "+ this.getName());
    }

    public void addGymnasticExercise (GymnasticExercises newExercise) {
        this.getGymnasticExercises().add(newExercise);

        this.logger.log(Level.INFO, "Gymnastic Exercise " +newExercise.name() + " added to the WOD: "+ this.getName());
    }

    public void removeGymnasticExercise (GymnasticExercises exercise) {
        if(getGymnasticExercises().contains(exercise)) {
            getGymnasticExercises().remove(exercise);
            this.logger.log(Level.INFO, "Gymnastic Exercise " +exercise.name() + " removed from the WOD: "+ this.getName());
        }
        else
            this.logger.log(Level.INFO, "Gymnastic Exercise " +exercise.name() + " is not part of the WOD: "+ this.getName());
    }

    public void addStrengthExercise (StrengthExercises newExercise) {
        this.getStrengthExercises().add(newExercise);

        this.logger.log(Level.INFO, "Strength Exercise " +newExercise.name() + " added to the WOD: "+ this.getName());
    }

    public void removeStrengthExercise (StrengthExercises exercise) {
        if(getStrengthExercises().contains(exercise)) {
            getStrengthExercises().remove(exercise);
            this.logger.log(Level.INFO, "Strength Exercise " +exercise.name() + " removed from the WOD: "+ this.getName());
        }
        else
            this.logger.log(Level.INFO, "Strength Exercise " +exercise.name() + " is not part of the WOD: "+ this.getName());
    }

    public void addWeightliftingExercise (WeightliftingExercises newExercise) {
        this.getWeightliftingExercises().add(newExercise);

        this.logger.log(Level.INFO, "Weightlifting Exercise " +newExercise.name() + " added to the WOD: "+ this.getName());
    }

    public void removeWeightliftingExercise (WeightliftingExercises exercise) {
        if(getWeightliftingExercises().contains(exercise)) {
            getWeightliftingExercises().remove(exercise);
            this.logger.log(Level.INFO, "Weightlifting Exercise " +exercise.name() + " removed from the WOD: "+ this.getName());
        }
        else
            this.logger.log(Level.INFO, "Weightlifting Exercise " +exercise.name() + " is not part of the WOD: "+ this.getName());
    }

    public void addConditioningExercise (ConditioningExercises newExercise) {
        this.getConditioningExercises().add(newExercise);

        this.logger.log(Level.INFO, "Conditioning Exercise " +newExercise.name() + " added to the WOD: "+ this.getName());
    }

    public void removeConditioningExercise (ConditioningExercises exercise) {
        if(getConditioningExercises().contains(exercise)) {
            getConditioningExercises().remove(exercise);
            this.logger.log(Level.INFO, "Conditioning Exercise " +exercise.name() + " removed from the WOD: "+ this.getName());
        }
        else
            this.logger.log(Level.INFO, "Conditioning Exercise " +exercise.name() + " is not part of the WOD: "+ this.getName());
    }

    public void addCooldownExercise (CooldownExercises newExercise) {
        this.getCooldownExercises().add(newExercise);

        this.logger.log(Level.INFO, "Cooldown Exercise " +newExercise.name() + " added to the WOD: "+ this.getName());
    }

    public void removeCooldownExercise (CooldownExercises exercise) {
        if(getCooldownExercises().contains(exercise)) {
            getCooldownExercises().remove(exercise);
            this.logger.log(Level.INFO, "Cooldown Exercise " +exercise.name() + " removed from the WOD: "+ this.getName());
        }
        else
            this.logger.log(Level.INFO, "Cooldown Exercise " +exercise.name() + " is not part of the WOD: "+ this.getName());
    }

    //</editor-fold>

    //</editor-fold>


}
