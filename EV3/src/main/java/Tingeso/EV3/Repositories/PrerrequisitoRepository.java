package Tingeso.EV3.Repositories;

import Tingeso.EV3.Entities.PlanEstudioEntity;
import Tingeso.EV3.Entities.PrerrequisitoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrerrequisitoRepository extends JpaRepository<PrerrequisitoEntity,Long> {
}
