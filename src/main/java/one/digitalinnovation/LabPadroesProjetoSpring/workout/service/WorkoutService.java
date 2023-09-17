package one.digitalinnovation.LabPadroesProjetoSpring.workout.service;

import one.digitalinnovation.LabPadroesProjetoSpring.workout.model.Workout;

public interface WorkoutService {
    
    Iterable<Workout> getAll();

    Workout getById(long id);

    void createWorkout(Workout workout);

    void updateWorkout(Long id, Workout workout);

    void deleteWorkout(Long id);

}
