package ms.physicore.trainer.core.domain.trainer;

import lombok.Data;
import ms.physicore.trainer.core.domain.Gender;
import ms.physicore.trainer.core.domain.trainee.Trainee;

@Data
public class Trainer {
    private String id;
    private String name;
    private int age;
    private Gender gender;
    private String email;
    private String password;
    private Trainee[] trainees;
}
