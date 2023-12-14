package Tingeso.EV3.Services;

import Tingeso.EV3.Entities.AsignaturaCursadaEntity;
import Tingeso.EV3.Entities.AsignaturaEntity;
import Tingeso.EV3.Entities.HorarioEntity;
import Tingeso.EV3.Repositories.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HorarioService {
    @Autowired
    private HorarioRepository horarioRepository;
    public HorarioEntity guardarHorario(HorarioEntity horario) {
        return horarioRepository.save(horario);
    }

    public List<HorarioEntity> obtenerHorarios() {
        return horarioRepository.findAll();
    }

    public HorarioEntity findByAsignaturaAndModulo(AsignaturaEntity asignatura, String modulo) {
        return horarioRepository.findByAsignaturaAndModulo(asignatura, modulo);
    }

    public boolean hasScheduleConflict(List<AsignaturaCursadaEntity> asignaturasInscritas, AsignaturaEntity nuevaAsignatura, String nuevoModulo) {
        for (AsignaturaCursadaEntity asignaturaInscrita : asignaturasInscritas) {
            HorarioEntity horarioInscrito = findByAsignaturaAndModulo(asignaturaInscrita.getAsignatura(), "modulo");
            if (horarioInscrito != null && horarioInscrito.getModulo().equals(nuevoModulo)) {
                return true; // Hay tope de horario
            }
        }
        return false; // No hay tope de horario
    }

    public List<HorarioEntity> getHorariosByAsignaturaCod(Long codAsignatura) {
        return horarioRepository.findByAsignatura_Codasig(codAsignatura);
    }

    public ArrayList<String> obtenerModulos(){
        return horarioRepository.obtenerModulos();
    }

    public boolean existeHorario(HorarioEntity horario) {
        // Verificar si ya existe un horario para la asignatura, día y el módulo seleccionados
        return horarioRepository.existsByAsignaturaAndDiaAndModulo(
                horario.getAsignatura(), horario.getDia(), horario.getModulo());
    }

    public boolean existeHorarioParaAsignatura(AsignaturaEntity asignatura) {
        // Verificar si ya existe un horario para la asignatura
        return horarioRepository.findByAsignatura(asignatura);
    }
}