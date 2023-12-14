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



}
