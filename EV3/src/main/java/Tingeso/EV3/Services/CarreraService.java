package Tingeso.EV3.Services;

import Tingeso.EV3.Entities.CarreraEntity;
import Tingeso.EV3.Entities.EstudianteEntity;
import Tingeso.EV3.Repositories.CarreraRepository;
import Tingeso.EV3.Repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarreraService {

    @Autowired
    CarreraRepository carreraRepository;

    public void guardarCarrera(CarreraEntity carrera){
        carreraRepository.save(carrera);
    }

    public void eliminarCarrera(CarreraEntity carrera) {
        carreraRepository.delete(carrera);
    }

    public ArrayList<CarreraEntity> obtenerCarreras(){
        return (ArrayList<CarreraEntity>) carreraRepository.findAll();
    }

    public ArrayList<CarreraEntity> obtenerCarrerasByRUT(Long codigo){
        return carreraRepository.findByCodigo(codigo);
    }
}
