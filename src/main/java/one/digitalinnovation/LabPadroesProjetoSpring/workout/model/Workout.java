package one.digitalinnovation.LabPadroesProjetoSpring.workout.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import one.digitalinnovation.LabPadroesProjetoSpring.exercise.model.Exercise;

@Entity
public class Workout {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private MuscleGroup muscleGroup;

    @OneToMany(mappedBy = "workout", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Exercise> exercises = new ArrayList<>();

	public Long getId() {
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
	public MuscleGroup getMuscleGroup() {
		return muscleGroup;
	}
	public void setMuscleGroup(MuscleGroup muscleGroup) {
		this.muscleGroup = muscleGroup;
	}
	public List<Exercise> getExercises() {
		return exercises;
	}
	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	public void AddExercise(Exercise exercise) {}
}
