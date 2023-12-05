package Tingeso.EV3.Services;

import Tingeso.EV3.Entities.EstudianteEntity;
import Tingeso.EV3.Repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    EstudianteRepository estudianteRepository;

    public void guardarEstudiante(EstudianteEntity estudiante){
        estudianteRepository.save(estudiante);
    }

    public void eliminarEstudiante(EstudianteEntity estudiante) {
        estudianteRepository.delete(estudiante);
    }

    public ArrayList<EstudianteEntity> obtenerEstudiantes(){
        return (ArrayList<EstudianteEntity>) estudianteRepository.findAll();
    }

    public ArrayList<EstudianteEntity> obtenerEstudiantesByRUT(String rut){
        return estudianteRepository.findByRut(rut);
    }
}
