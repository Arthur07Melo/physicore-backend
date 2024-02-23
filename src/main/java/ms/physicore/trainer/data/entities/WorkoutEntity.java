package ms.physicore.trainer.data.entities;

import java.util.HashMap;

import org.hibernate.annotations.Type;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "workout")
public class WorkoutEntity {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    
    @Type(JsonType.class)
    @Column(name = "excercises", columnDefinition = "JSON")
    private HashMap<String, String> exercises;
}
