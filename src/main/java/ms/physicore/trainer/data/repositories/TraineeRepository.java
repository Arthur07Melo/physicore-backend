package ms.physicore.trainer.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ms.physicore.trainer.data.entities.TraineeEntity;


public interface TraineeRepository extends JpaRepository<TraineeEntity, String> {   
}
