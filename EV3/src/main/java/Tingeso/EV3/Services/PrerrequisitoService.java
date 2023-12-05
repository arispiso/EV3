package Tingeso.EV3.Services;

import Tingeso.EV3.Entities.PrerrequisitoEntity;
import Tingeso.EV3.Repositories.PrerrequisitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PrerrequisitoService {

    @Autowired
    PrerrequisitoRepository prerrequisitoRepository;

    public void guardarPrerrequisito(PrerrequisitoEntity prerrequisito){

        prerrequisitoRepository.save(prerrequisito);
    }

    public void eliminarPrerrequisito(PrerrequisitoEntity prerrequisito) {
        prerrequisitoRepository.delete(prerrequisito);
    }

    public ArrayList<PrerrequisitoEntity> obtenerPrerrequisitos(){
        return (ArrayList<PrerrequisitoEntity>) prerrequisitoRepository.findAll();
    }

}
