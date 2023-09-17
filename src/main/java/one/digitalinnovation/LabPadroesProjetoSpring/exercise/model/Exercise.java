package one.digitalinnovation.LabPadroesProjetoSpring.exercise.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import one.digitalinnovation.LabPadroesProjetoSpring.workout.model.Workout;

@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Embedded
    private Repetitions repetitions;
    
    private int sets;
    private int weight;
    private int restTime;
    private String muscle;
    private int repsOutOfFailure;
    
    @ManyToOne
    private Workout workout;

    public Exercise(String name, Repetitions repetitions, int sets, int weight, int restTime, String muscle,
            int repsOutOfFailure,
            Workout workout) {
        this.name = name;
        this.repetitions = repetitions;
        this.sets = sets;
        this.weight = weight;
        this.restTime = restTime;
        this.muscle = muscle;
        this.repsOutOfFailure = repsOutOfFailure;
        this.workout = workout;
    }

    public Long id() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Repetitions getRepetitions() {
        return repetitions;
    }
    public void setRepetitions(Repetitions repetitions) {
        this.repetitions = repetitions;
    }
    public int getSets() {
        return sets;
    }
    public void setSets(int sets) {
        this.sets = sets;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getRestTime() {
        return restTime;
    }
    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }
    public String getMuscle() {
        return muscle;
    }
    public void setMuscle(String muscle) {
        this.muscle = muscle;
    }
    public int getRepsOutOfFailure() {
        return repsOutOfFailure;
    }
    public void setRepsOutOfFailure(int repsOutOfFailure) {
        this.repsOutOfFailure = repsOutOfFailure;
    }
    public Workout getWorkout() {
        return workout;
    }
    public void setWorkout(Workout workout) {
        this.workout = workout;
    }
}
