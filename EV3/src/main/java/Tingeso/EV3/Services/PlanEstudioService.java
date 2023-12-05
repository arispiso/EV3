package Tingeso.EV3.Services;

import Tingeso.EV3.Entities.PlanEstudioEntity;
import Tingeso.EV3.Repositories.PlanEstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanEstudioService {

    @Autowired
    private PlanEstudioRepository planEstudioRepository;

    public PlanEstudioEntity findAsignatura(Long id){
        return planEstudioRepository.findByAsignatura(id);

    }

    public void subirHorario(String horario){
        System.out.println(horario);
    }

    public void guardarHorario(String horario, Long asignatura){
        PlanEstudioEntity plan = planEstudioRepository.findByAsignatura(asignatura);
        plan.setHorarios(horario);
        planEstudioRepository.save(plan);
    }
}
