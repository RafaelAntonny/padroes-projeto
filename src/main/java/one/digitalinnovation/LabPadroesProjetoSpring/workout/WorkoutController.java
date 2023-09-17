package one.digitalinnovation.LabPadroesProjetoSpring.workout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import one.digitalinnovation.LabPadroesProjetoSpring.workout.model.Workout;
import one.digitalinnovation.LabPadroesProjetoSpring.workout.service.WorkoutService;

@RestController
@RequestMapping("workouts")
public class WorkoutController {
    
    @Autowired
    private WorkoutService workoutService;

    @GetMapping
    public ResponseEntity<Iterable<Workout>> getAll() {
        return ResponseEntity.ok(workoutService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Workout> getById(@PathVariable Long id) {
        return ResponseEntity.ok(workoutService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Workout> create(@RequestBody Workout workout) {
        workoutService.createWorkout(workout);
        return ResponseEntity.ok(workout);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Workout> update(@PathVariable Long id, @RequestBody Workout workout) {
        workoutService.updateWorkout(id, workout);
        return ResponseEntity.ok(workout);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Workout> delete(@PathVariable Long id) {
        workoutService.deleteWorkout(id);
        return ResponseEntity.ok().build();
    }
}
