package ms.physicore.trainer.data.mappers;

import java.util.List;

import ms.physicore.trainer.core.domain.Workout;
import ms.physicore.trainer.core.domain.trainee.Trainee;
import ms.physicore.trainer.core.domain.trainer.Trainer;
import ms.physicore.trainer.data.entities.TraineeEntity;
import ms.physicore.trainer.data.entities.TrainerEntity;
import ms.physicore.trainer.data.entities.WorkoutEntity;

public class TraineeMapper {
    private TrainerMapper trainerMapper;

    public Trainee toDomain(TraineeEntity entity) {
        trainerMapper = new TrainerMapper();

        Trainer traineeTrainer = null;
        List<Workout> traineeWorkouts = null;
        if(entity.getTrainer() != null) traineeTrainer = trainerMapper.toDomain(entity.getTrainer());
        if(entity.getWorkouts() != null) traineeWorkouts = entity.getWorkouts().stream().map(n -> workoutToDomain(n)).toList();

        return new Trainee(entity.getId(), entity.getName(), entity.getAge(), entity.getGender(), entity.getEmail(), 
        entity.getPassword(), traineeTrainer, traineeWorkouts);
    }

    public TraineeEntity toEntity(Trainee domainObj) {
        trainerMapper = new TrainerMapper();
        
        TrainerEntity traineeTrainer = null;
        List<WorkoutEntity> traineeWorkouts = null;
        if(domainObj.getTrainer() != null) traineeTrainer = trainerMapper.toEntity(domainObj.getTrainer());
        if(domainObj.getWorkouts() != null) traineeWorkouts = domainObj.getWorkouts().stream().map(n -> workoutToEntity(n)).toList();

        return new TraineeEntity(domainObj.getName(), domainObj.getAge(), domainObj.getGender(), domainObj.getEmail(), 
        domainObj.getPassword(), traineeTrainer, traineeWorkouts);
    }

    public Workout workoutToDomain(WorkoutEntity entity) {
        return new Workout(entity.getId(), entity.getName(), entity.getExercises());
    }

    public WorkoutEntity workoutToEntity(Workout domainObj) {
        return new WorkoutEntity(domainObj.getId(), domainObj.getName(), domainObj.getExercises());
    }
}
