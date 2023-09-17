package one.digitalinnovation.LabPadroesProjetoSpring.workout.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.LabPadroesProjetoSpring.exercise.model.Exercise;
import one.digitalinnovation.LabPadroesProjetoSpring.exercise.model.Repetitions;
import one.digitalinnovation.LabPadroesProjetoSpring.workout.WorkoutRepository;
import one.digitalinnovation.LabPadroesProjetoSpring.workout.model.Workout;

@Service
public class WorkoutServiceImpl implements WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

	@Override
	public Iterable<Workout> getAll() {
		return workoutRepository.findAll(); 
	}

	@Override
	public Workout getById(long id) {
		Optional<Workout> workout = workoutRepository.findById(id);
        return workout.get();
	}

	@Override
	public void createWorkout(Workout workout) {
		saveWorkout(workout);
	}

	@Override
	public void updateWorkout(Long id, Workout workout) {
		saveWorkout(workout);
	}

	@Override
	public void deleteWorkout(Long id) {
		workoutRepository.deleteById(id);
	}
    
    private void saveWorkout(Workout workout) {
        for (Exercise exercise : workout.getExercises()) {
            if (!isValidRepetitions(exercise.getRepetitions())) {
                throw new IllegalArgumentException("Invalid repetitions");
            } else {
                workout.AddExercise(exercise);
            }
        }
        
        workoutRepository.save(workout);
    }

    private boolean isValidRepetitions(Repetitions repetitions) {
        int minReps = repetitions.getMinReps();
        int maxReps = repetitions.getMaxReps();

        return minReps >= 0  && minReps <= maxReps;
    }
}
