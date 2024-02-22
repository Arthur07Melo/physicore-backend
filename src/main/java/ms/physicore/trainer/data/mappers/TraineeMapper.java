package ms.physicore.trainer.data.mappers;

import ms.physicore.trainer.core.domain.trainee.Trainee;
import ms.physicore.trainer.data.entities.TraineeEntity;

public class TraineeMapper {
    public Trainee toDomain(TraineeEntity entity) {
        return new Trainee(entity.getId(), entity.getName(), entity.getAge(), entity.getGender(), entity.getEmail(), 
        entity.getPassword(), entity.getTrainer(), entity.getWorkouts());
    }

    public TraineeEntity toEntity(Trainee domainObj) {
        return new TraineeEntity(domainObj.getId(), domainObj.getName(), domainObj.getAge(), domainObj.getGender(), domainObj.getEmail(), 
        domainObj.getPassword(), domainObj.getTrainer(), domainObj.getWorkouts());
    }
}
