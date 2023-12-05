package Tingeso.EV3.Repositories;

import Tingeso.EV3.Entities.PlanEstudioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanEstudioRepository extends JpaRepository<PlanEstudioEntity,Long> {

    //@Query(value = "SELECT p FROM PlanEstudioEntity p WHERE p.cod_asig = :cod_asig")
    //PlanEstudioEntity findByAsignatura(@Param("cod_asig") Long cod_asig);
}
