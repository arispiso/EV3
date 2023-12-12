package Tingeso.EV3.Repositories;

import Tingeso.EV3.Entities.PlanEstudioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PlanEstudioRepository extends JpaRepository<PlanEstudioEntity,Long> {

    PlanEstudioEntity findByCod_plan(int codigo);

    PlanEstudioEntity findByCod_asig(int codigo);

    int findByNivel(int nivel);

    ArrayList<PlanEstudioEntity> findListByCod_asig(int codigoAsignatura);

    @Query(value = "select p from planesDeEstudio p where p.cod_asig = :cod_asig", nativeQuery = true)
    PlanEstudioEntity findByAsignatura(@Param("cod_asig") Long cod_asig);
}
