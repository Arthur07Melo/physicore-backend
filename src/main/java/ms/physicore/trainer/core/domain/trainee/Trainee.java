package ms.physicore.trainer.core.domain.trainee;

import lombok.Data;
import ms.physicore.trainer.core.domain.Gender;
import ms.physicore.trainer.core.domain.Workout;
import ms.physicore.trainer.core.domain.trainer.Trainer;

@Data
public class Trainee {
    private String id;
    private String name;
    private int age;
    private Gender gender;
    private String email;
    private String password;
    private Trainer trainer;

    private Workout[] workouts;
}
