package Tingeso.EV3.Services;


import Tingeso.EV3.Entities.NotaEntity;
import Tingeso.EV3.Repositories.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NotaService {

    @Autowired
    NotaRepository notaRepository;

    public NotaEntity guardarNota(NotaEntity nota){
        return notaRepository.save(nota);
    }

    public void eliminarNota(NotaEntity nota) {
        notaRepository.delete(nota);
    }

    public ArrayList<NotaEntity> obtenerNotas(){
        return (ArrayList<NotaEntity>) notaRepository.findAll();
    }

    public ArrayList<NotaEntity> obtenerNotasByRUT(String rut){
        return notaRepository.findByCod_alumno(rut);
    }

    public NotaEntity buscarPorCodigoAsignatura(int codigoAsignatura){
        return notaRepository.findByCod_asig(codigoAsignatura);
    }

    public NotaEntity buscarNota(int nota){
        return notaRepository.findByNota(nota);
    }

    public int verificarCondicionNota(int nota){
        NotaEntity notas = notaRepository.findByNota(nota);
        if(notas == null) {
            return -3; //No existe la nota
        }
        if(notas.getNota() < 3){
            return -2; //Significa que reprobaste el ramo
        }
        if(notas.getNota() > 4){
            return 1; //Cumple con el requerimiento
        }
        return nota;
    }
}
