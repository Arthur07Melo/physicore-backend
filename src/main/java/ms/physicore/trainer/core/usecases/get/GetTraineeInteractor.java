package ms.physicore.trainer.core.usecases.get;

import ms.physicore.trainer.core.domain.trainee.Trainee;
import ms.physicore.trainer.core.gateways.TraineeGateway;

public class GetTraineeInteractor {
    private TraineeGateway gateway;

    public GetTraineeInteractor(TraineeGateway gateway) {
        this.gateway = gateway;
    }

    public Trainee execute(String id){
        return gateway.getTrainee(id);
    }
}
