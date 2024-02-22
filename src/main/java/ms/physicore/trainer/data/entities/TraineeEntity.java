package ms.physicore.trainer.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import ms.physicore.trainer.core.domain.Gender;
import ms.physicore.trainer.core.domain.Workout;
import ms.physicore.trainer.core.domain.trainer.Trainer;

@Entity
@Table(name = "trainee")
@Data
@AllArgsConstructor
public class TraineeEntity {
    @Id 
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    private int age;
    private Gender gender;
    private String email;
    private String password;
    private Trainer trainer;

    private Workout[] workouts;
}
