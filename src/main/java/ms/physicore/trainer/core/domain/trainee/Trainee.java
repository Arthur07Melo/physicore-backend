package ms.physicore.trainer.core.domain.trainee;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import ms.physicore.trainer.core.DTO.trainee.TraineeRequestDTO;
import ms.physicore.trainer.core.domain.Gender;
import ms.physicore.trainer.core.domain.Workout;
import ms.physicore.trainer.core.domain.trainer.Trainer;

@Data
@AllArgsConstructor
public class Trainee {
    private String id;
    private String name;
    private int age;
    private Gender gender;
    private String email;
    private String password;
    private Trainer trainer;

    private List<Workout> workouts;

    public Trainee(TraineeRequestDTO requestDTO) {
        this.name = requestDTO.name();
        this.age = requestDTO.age();
        this.gender = Gender.valueOf(requestDTO.gender());
        this.email =requestDTO. email();
        this.password = requestDTO.password();
    }
}
