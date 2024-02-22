package ms.physicore.trainer.core.gateways;

import java.util.List;

import ms.physicore.trainer.core.domain.trainee.Trainee;

public interface TraineeGateway {
    public Trainee getTrainee(String id);
    public List<Trainee> getAllTrainees();
    public Trainee createTrainee(Trainee trainee);
}
