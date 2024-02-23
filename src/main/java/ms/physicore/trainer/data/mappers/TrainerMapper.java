package ms.physicore.trainer.data.mappers;

import ms.physicore.trainer.core.domain.trainer.Trainer;
import ms.physicore.trainer.data.entities.TrainerEntity;

public class TrainerMapper {
    private TraineeMapper traineeMapper; 

    public Trainer toDomain(TrainerEntity entity) {
        traineeMapper = new TraineeMapper();

        return new Trainer(entity.getId(), entity.getName(), entity.getAge(), entity.getGender(), entity.getEmail(), 
        entity.getPassword(), 
        entity.getTrainees().stream().map(n -> traineeMapper.toDomain(n)).toList());
    }

    public TrainerEntity toEntity(Trainer domainObj) {
        traineeMapper = new TraineeMapper();

        return new TrainerEntity(domainObj.getId(), domainObj.getName(), domainObj.getAge(), domainObj.getGender(), domainObj.getEmail(), 
        domainObj.getPassword(),
        domainObj.getTrainees().stream().map(n -> traineeMapper.toEntity(n)).toList());
    }
}
