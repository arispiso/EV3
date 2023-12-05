package Tingeso.EV3.Repositories;

import Tingeso.EV3.Entities.PlanEstudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PlanEstudioRepository extends JpaRepository<PlanEstudio,Long> {

    @Query("SELECT p FROM PlanEstudio p WHERE p.cod_asig = :cod_asig")
    PlanEstudio findByAsignatura(@Param("cod_asig") Long cod_asig);
}
