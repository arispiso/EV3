package Tingeso.EV3.Repositories;

import Tingeso.EV3.Entities.AsignaturaEntity;
import Tingeso.EV3.Entities.HorarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface HorarioRepository extends JpaRepository<HorarioEntity, Long> {
    HorarioEntity findByAsignaturaAndModulo(AsignaturaEntity asignatura, String modulo);

    List<HorarioEntity> findByAsignatura_Codasig(Long codAsignatura);

    boolean existsByAsignaturaAndDiaAndModulo(AsignaturaEntity asignatura, String dia, String modulo);

    boolean findByAsignatura(AsignaturaEntity asignatura);

    @Query(value = "select distinct modulo from horario_entity",
            nativeQuery = true)
    ArrayList<String> obtenerModulos();
}
