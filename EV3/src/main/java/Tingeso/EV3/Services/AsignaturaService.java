package Tingeso.EV3.Services;

import Tingeso.EV3.Entities.AsignaturaEntity;
import Tingeso.EV3.Entities.CarreraEntity;
import Tingeso.EV3.Repositories.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignaturaService {
    @Autowired
    private AsignaturaRepository asignaturaRepository;


    public List<AsignaturaEntity> getAllAsignaturas() {
        return asignaturaRepository.findAll();
    }

    public Optional<AsignaturaEntity> getAsignaturaById(Long id) {
        return asignaturaRepository.findById(id);
    }

    public void saveAsignatura(AsignaturaEntity asignatura) {
        asignaturaRepository.save(asignatura);
    }


    public AsignaturaEntity findByCodAsignatura(Long codAsignatura) {
        return asignaturaRepository.findByCodasig(codAsignatura)
                .orElseThrow(() -> new RuntimeException("Asignatura no encontrada con el código: " + codAsignatura));
    }

    public List<AsignaturaEntity> findByCarreraAndNivel(CarreraEntity carrera, Integer nivel) {
        Long codCarrera = carrera.getCodcarr(); // Extraer el código de la carrera
        return asignaturaRepository.findByCarreraCodcarrAndNivel(codCarrera,nivel);
    }

    public AsignaturaEntity save(AsignaturaEntity asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    public AsignaturaEntity findById(Long id) {
        return asignaturaRepository.findById(id).orElse(null);
    }
}
