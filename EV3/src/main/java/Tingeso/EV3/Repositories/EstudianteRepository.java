package Tingeso.EV3.Repositories;

import Tingeso.EV3.Entities.CarreraEntity;
import Tingeso.EV3.Entities.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EstudianteRepository extends JpaRepository<EstudianteEntity,Long> {

    @Query("select e from EstudianteEntity e where e.rut =:rut")
    EstudianteEntity findByRut(String rut);

}
