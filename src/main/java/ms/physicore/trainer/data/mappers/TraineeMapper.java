package ms.physicore.trainer.data.mappers;

import ms.physicore.trainer.core.domain.Workout;
import ms.physicore.trainer.core.domain.trainee.Trainee;
import ms.physicore.trainer.data.entities.TraineeEntity;
import ms.physicore.trainer.data.entities.WorkoutEntity;

public class TraineeMapper {
    private TrainerMapper trainerMapper;

    public Trainee toDomain(TraineeEntity entity) {
        trainerMapper = new TrainerMapper();

        return new Trainee(entity.getId(), entity.getName(), entity.getAge(), entity.getGender(), entity.getEmail(), 
        entity.getPassword(), trainerMapper.toDomain(entity.getTrainer()), 
        entity.getWorkouts().stream().map(n -> workoutToDomain(n)).toList());
    }

    public TraineeEntity toEntity(Trainee domainObj) {
        trainerMapper = new TrainerMapper();

        return new TraineeEntity(domainObj.getId(), domainObj.getName(), domainObj.getAge(), domainObj.getGender(), domainObj.getEmail(), 
        domainObj.getPassword(), trainerMapper.toEntity(domainObj.getTrainer()), 
        domainObj.getWorkouts().stream().map(n -> workoutToEntity(n)).toList());
    }

    public Workout workoutToDomain(WorkoutEntity entity) {
        return new Workout(entity.getId(), entity.getName(), entity.getExercises());
    }

    public WorkoutEntity workoutToEntity(Workout domainObj) {
        return new WorkoutEntity(domainObj.getId(), domainObj.getName(), domainObj.getExercises());
    }
}
