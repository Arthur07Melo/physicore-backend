package ms.physicore.trainer.data.gateways;

import java.util.List;

import ms.physicore.trainer.core.domain.trainee.Trainee;
import ms.physicore.trainer.core.gateways.TraineeGateway;
import ms.physicore.trainer.data.entities.TraineeEntity;
import ms.physicore.trainer.data.mappers.TraineeMapper;
import ms.physicore.trainer.data.repositories.TraineeRepository;

public class TraineeGatewayImpl implements TraineeGateway {
    private TraineeRepository repository;
    private TraineeMapper mapper;

    public TraineeGatewayImpl(TraineeRepository repository, TraineeMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Trainee getTrainee(String id) {
        return mapper.toDomain(repository.findById(id).get());
    }

    @Override
    public List<Trainee> getAllTrainees() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllTrainees'");
    }

    @Override
    public Trainee createTrainee(Trainee trainee) {
        TraineeEntity createdEntity = repository.save(mapper.toEntity(trainee));
        return mapper.toDomain(createdEntity);
    }
    
}
