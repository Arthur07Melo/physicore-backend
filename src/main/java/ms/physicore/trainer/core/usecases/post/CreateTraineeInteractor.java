package ms.physicore.trainer.core.usecases.post;

import ms.physicore.trainer.core.DTO.trainee.TraineeRequestDTO;
import ms.physicore.trainer.core.domain.trainee.Trainee;
import ms.physicore.trainer.core.exceptions.InvalidEmailException;
import ms.physicore.trainer.core.exceptions.InvalidPasswordException;
import ms.physicore.trainer.core.gateways.TraineeGateway;

public class CreateTraineeInteractor {
    private TraineeGateway gateway;

    public CreateTraineeInteractor(TraineeGateway gateway) {
        this.gateway = gateway;
    }

    public Trainee execute(TraineeRequestDTO requestDTO) throws Exception {
        if(!requestDTO.email().contains("@")) throw new InvalidEmailException();
        if(requestDTO.password().length() < 8) throw new InvalidPasswordException();
        System.out.println(requestDTO.name());
        Trainee toCreate = new Trainee(requestDTO);
        System.out.println(toCreate.getName());
        Trainee created = gateway.createTrainee(toCreate);

        return created;
    }
}
