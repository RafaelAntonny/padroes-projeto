package one.digitalinnovation.LabPadroesProjetoSpring.exercise;

import org.springframework.data.repository.CrudRepository;
import one.digitalinnovation.LabPadroesProjetoSpring.exercise.model.Exercise;

public interface ExerciseRepository extends CrudRepository<Exercise, Long> {
    
}
