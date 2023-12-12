package Tingeso.EV3.Services;

import Tingeso.EV3.Entities.HorarioEntity;
import Tingeso.EV3.Repositories.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HorarioService {
    @Autowired
    private HorarioRepository horarioRepository;

    public ArrayList<HorarioEntity> getAllHorarios() {
        return (ArrayList<HorarioEntity>) horarioRepository.findAll();
    }

    public HorarioEntity crearHorario(HorarioEntity horario) {
        return horarioRepository.save(horario);
    }

    public HorarioEntity buscarHorarioPorBloque(int bloque) {
        return horarioRepository.findByBloque(bloque);
    }

    public HorarioEntity buscarPorIdHorario(int idHorario) {
        return horarioRepository.findByIdHorario(idHorario);
    }

    public HorarioEntity buscarPorDia(String diaSemana) {
        return horarioRepository.findDiaByDiaSemana(diaSemana);
    }
}