package ms.physicore.trainer.data.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import ms.physicore.trainer.core.domain.Gender;

@Data
@AllArgsConstructor
@Entity
@Table(name = "trainer")
public class TrainerEntity {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private int age;
    private Gender gender;
    private String email;
    private String password;

    @OneToMany
    private List<TraineeEntity> trainees;

    public TrainerEntity(String name, int age, Gender gender, String email, String password,
            List<TraineeEntity> trainees) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.trainees = trainees;
    }
}
