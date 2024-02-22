package ms.physicore.trainer.infra.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ms.physicore.trainer.core.DTO.trainee.TraineeRequestDTO;
import ms.physicore.trainer.core.domain.trainee.Trainee;
import ms.physicore.trainer.core.usecases.get.GetTraineeInteractor;
import ms.physicore.trainer.core.usecases.post.CreateTraineeInteractor;

@RestController
@RequestMapping("/trainee")
public class TraineeController {
    private CreateTraineeInteractor createTraineeInteractor;
    private GetTraineeInteractor getTraineeInteractor;

    public TraineeController(CreateTraineeInteractor createTraineeInteractor,
            GetTraineeInteractor getTraineeInteractor) {
        this.createTraineeInteractor = createTraineeInteractor;
        this.getTraineeInteractor = getTraineeInteractor;
    }

    @PostMapping
    public Trainee createTrainee(@RequestBody TraineeRequestDTO requestDTO) throws Exception {
        return createTraineeInteractor.execute(requestDTO);
    }

    @GetMapping("/{id}")
    public Trainee getTraineeById(@PathVariable(value = "id") String id) throws Exception {
        return getTraineeInteractor.execute(id);
    }
}
