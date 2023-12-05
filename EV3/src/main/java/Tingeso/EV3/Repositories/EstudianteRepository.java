package Tingeso.EV3.Repositories;

import Tingeso.EV3.Entities.EstudianteEntity;
import Tingeso.EV3.Entities.PlanEstudioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EstudianteRepository extends JpaRepository<EstudianteEntity,Long> {

    @Query(value = "select * from estudiantes as e where e.rut= :rut", nativeQuery = true)
    ArrayList<EstudianteEntity> findByRut(@Param("rut")String rut);


}
