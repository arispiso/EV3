package Tingeso.EV3.Services;

import Tingeso.EV3.Entities.AsignaturaEntity;
import Tingeso.EV3.Entities.PrerrequisitoEntity;
import Tingeso.EV3.Repositories.PrerrequisitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrerrequisitoService {

    @Autowired
    PrerrequisitoRepository prerrequisitoRepository;

    public PrerrequisitoEntity guardarPrerrequisito(PrerrequisitoEntity prerrequisito){

        return prerrequisitoRepository.save(prerrequisito);
    }

    public void eliminarPrerrequisito(PrerrequisitoEntity prerrequisito) {
        prerrequisitoRepository.delete(prerrequisito);
    }

    public ArrayList<PrerrequisitoEntity> obtenerPrerrequisitos(){
        return (ArrayList<PrerrequisitoEntity>) prerrequisitoRepository.findAll();
    }


    public List<PrerrequisitoEntity> getPrerrequisitosByAsignatura(AsignaturaEntity asignatura) {

        return prerrequisitoRepository.findByAsignatura(asignatura);
    }

    public List<PrerrequisitoEntity> findByCodAsignatura(Long codAsignatura) {
        return prerrequisitoRepository.findByAsignatura_codasig(codAsignatura);
    }


}
