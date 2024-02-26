package ms.physicore.trainer.data.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import ms.physicore.trainer.core.domain.Gender;

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
    @Column(name = "gender")
    private Gender gender;
    private String email;
    private String password;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private TrainerEntity trainer;

    @OneToMany
    private List<WorkoutEntity> workouts;

    public TraineeEntity(String name, int age, Gender gender, String email, String password, TrainerEntity trainer,
            List<WorkoutEntity> workouts) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.trainer = trainer;
        this.workouts = workouts;
    }
}
