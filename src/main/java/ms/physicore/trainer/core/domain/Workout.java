package ms.physicore.trainer.core.domain;

import java.util.HashMap;

import lombok.Data;

@Data
public class Workout {
    private String name;
    private HashMap<String, String> exercises;
}
