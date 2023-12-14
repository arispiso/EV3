package Tingeso.EV3.Services;

import Tingeso.EV3.Entities.AsignaturaCursadaEntity;
import Tingeso.EV3.Entities.AsignaturaEntity;
import Tingeso.EV3.Entities.EstudianteEntity;
import Tingeso.EV3.Entities.PrerrequisitoEntity;
import Tingeso.EV3.Repositories.AsignaturaCursadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturaCursadaService {

    @Autowired
    AsignaturaCursadaRepository asigcursadasRepository;

    @Autowired
    EstudianteService estudianteService;

    @Autowired
    AsignaturaService asignaturaService;


    public List<AsignaturaCursadaEntity> getAllAsigcursadas() {
        return asigcursadasRepository.findAll();
    }

    public void saveAsigcursadas(AsignaturaCursadaEntity asigcursadas) {
        asigcursadasRepository.save(asigcursadas);
    }


    public long countByEstudiante(EstudianteEntity estudiante) {
        return asigcursadasRepository.countByEstudiante(estudiante);
    }

    public AsignaturaCursadaEntity findByEstudianteAndAsignatura(EstudianteEntity estudiante, AsignaturaEntity asignatura) {
        return asigcursadasRepository.findByEstudianteAndAsignatura(estudiante, asignatura);
    }

    public boolean hasApprovedAllPrerequisites(EstudianteEntity estudiante, List<PrerrequisitoEntity> prerequisitos) {
        for (PrerrequisitoEntity prerrequisito : prerequisitos) {
            AsignaturaEntity prerequisitoAsignatura = prerrequisito.getAsignatura();
            AsignaturaCursadaEntity asigcursadasPrerequisito = findByEstudianteAndAsignatura(estudiante, prerequisitoAsignatura);

            if (asigcursadasPrerequisito == null || !"aprobado".equals(asigcursadasPrerequisito.getEstado())) {
                return false;
            }
        }
        return true;
    }

    public List<AsignaturaCursadaEntity> findByEstudiante(EstudianteEntity estudiante) {
        return asigcursadasRepository.findByEstudiante(estudiante);
    }
    public void save(AsignaturaCursadaEntity asigcursadas) {
        asigcursadasRepository.save(asigcursadas);
    }

    public Integer findVecesCursadaByEstudianteAndAsignatura(String rut, Long codasig) {
        EstudianteEntity estudiante = estudianteService.findByRut(rut);
        AsignaturaEntity asignatura = asignaturaService.findByCodAsignatura(codasig);

        AsignaturaCursadaEntity asigcursadas = asigcursadasRepository.findByEstudianteAndAsignatura(estudiante, asignatura);

        // Si asigcursadas es null, significa que no hay información para esa combinación de estudiante y asignatura
        return (asigcursadas != null) ? asigcursadas.getVecescursada() : null;
    }


    public List<AsignaturaCursadaEntity> findByAsignaturaId(Long idAsignatura) {
        return asigcursadasRepository.findByAsignatura_Codasig(idAsignatura);
    }
}
