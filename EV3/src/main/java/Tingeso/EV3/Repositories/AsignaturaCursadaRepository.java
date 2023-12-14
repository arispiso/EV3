package Tingeso.EV3.Repositories;

import Tingeso.EV3.Entities.AsignaturaCursadaEntity;
import Tingeso.EV3.Entities.AsignaturaEntity;
import Tingeso.EV3.Entities.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AsignaturaCursadaRepository extends JpaRepository<AsignaturaCursadaEntity,Long> {
    long countByEstudiante(EstudianteEntity estudiante);
    AsignaturaCursadaEntity findByEstudianteAndAsignatura(EstudianteEntity estudiante, AsignaturaEntity asignatura);
    List<AsignaturaCursadaEntity> findByEstudiante(EstudianteEntity estudiante);

    List<AsignaturaCursadaEntity> findByAsignatura_Codasig(Long codAsignatura);
}
