package one.digitalinnovation.LabPadroesProjetoSpring.workout;

import org.springframework.data.repository.CrudRepository;
import one.digitalinnovation.LabPadroesProjetoSpring.workout.model.Workout;

public interface WorkoutRepository extends CrudRepository<Workout, Long> {

}
