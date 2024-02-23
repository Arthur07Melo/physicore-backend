package ms.physicore.trainer.infra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ms.physicore.trainer.core.gateways.TraineeGateway;
import ms.physicore.trainer.core.usecases.get.GetTraineeInteractor;
import ms.physicore.trainer.core.usecases.post.CreateTraineeInteractor;
import ms.physicore.trainer.data.gateways.TraineeGatewayImpl;
import ms.physicore.trainer.data.mappers.TraineeMapper;
import ms.physicore.trainer.data.repositories.TraineeRepository;

@Configuration
public class TraineeConfig {
    //DATA
    @Bean
    TraineeMapper traineeMapper(){
        return new TraineeMapper();
    }

    @Bean
    TraineeGateway traineeGateway(TraineeRepository repository, TraineeMapper mapper) {
        return new TraineeGatewayImpl(repository, mapper);
    }

    

    //INTERACTORS
    @Bean
    CreateTraineeInteractor createTraineeInteractor(TraineeGateway gateway) {
        return new CreateTraineeInteractor(gateway);
    }

    @Bean
    GetTraineeInteractor getTraineeInteractor(TraineeGateway gateway) {
        return new GetTraineeInteractor(gateway);
    }
}
