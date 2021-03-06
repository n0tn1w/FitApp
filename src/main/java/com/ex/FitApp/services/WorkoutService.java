package com.ex.FitApp.services;

import com.ex.FitApp.models.bindings.ExerciseAddBinding;
import com.ex.FitApp.models.bindings.WorkoutAddBinding;
import com.ex.FitApp.models.bindings.WorkoutEditBinding;
import com.ex.FitApp.models.entities.WorkoutEntity;
import com.ex.FitApp.models.views.ExerciseDetailsView;
import com.ex.FitApp.models.views.ExerciseWorkoutEditView;
import com.ex.FitApp.models.views.WorkoutDetailsView;
import com.ex.FitApp.models.views.WorkoutView;

import java.util.List;

public interface WorkoutService {
    WorkoutEntity findByWorkoutName(String workoutName);

    WorkoutEntity addWorkout(WorkoutAddBinding workoutModel, String username);

    WorkoutEntity bindingToEntity(WorkoutAddBinding workoutModel);

    List<WorkoutView> getAllWorkoutsByUsername(String username);

    void deleteById(Long workoutId);

    WorkoutDetailsView findById(Long workoutId);

    List<ExerciseDetailsView>findAllExercisesInAWorkout(Long workoutId);

    List<ExerciseWorkoutEditView> findAllExercisesInAWorkoutWithIds(Long workoutId);

    List<WorkoutView> getAllWorkouts();

    boolean checkIfLoggedUserIsTheOwner(String username, Long workoutId);

    void deleteWorkoutFromUser(String username, Long workoutId);

    void editWorkout(WorkoutEditBinding workoutNew, String username, Long workoutId);

    WorkoutEditBinding preSetBindingValue(WorkoutEditBinding workoutBinding, WorkoutDetailsView workoutView);

    boolean removeExercise(Long workoutId, Long exerciseId);

    boolean addExercise(Long workoutId, Long exerciseId);

    List<ExerciseWorkoutEditView> findExercisesThatAreNotInThisWorkout(Long workoutId);

}
