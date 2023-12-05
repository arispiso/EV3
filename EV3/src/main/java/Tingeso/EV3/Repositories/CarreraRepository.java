package Tingeso.EV3.Repositories;

import Tingeso.EV3.Entities.CarreraEntity;
import Tingeso.EV3.Entities.EstudianteEntity;
import Tingeso.EV3.Entities.PlanEstudioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CarreraRepository extends JpaRepository<CarreraEntity,Long> {

    @Query(value = "select * from carreras as c where c.codigo= :codigo", nativeQuery = true)
    ArrayList<CarreraEntity> findByCodigo(@Param("codigo")Long codigo);

}
