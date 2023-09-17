package one.digitalinnovation.LabPadroesProjetoSpring.exercise.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Repetitions {
    
    private int maxReps;
    private int minReps;

    public Repetitions(int minReps, int maxReps) {
        this.minReps = minReps;
        this.maxReps = maxReps;
    }

    public int getMaxReps() {
        return maxReps;
    }
    public int getMinReps() {
        return minReps;
    }
    @Override
    public String toString() {
        return minReps + " - " + maxReps + " reps";
    }
}
