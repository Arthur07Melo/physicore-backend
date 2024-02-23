package ms.physicore.trainer.core.domain;

import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Workout {
    private String id;
    private String name;
    private HashMap<String, String> exercises;
}
